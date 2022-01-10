/*
 * Copyright 2017 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.lib.jdbc;

import com.google.common.annotations.VisibleForTesting;
import com.streamsets.pipeline.api.StageException;
import com.streamsets.pipeline.lib.jdbc.schemawriter.JdbcSchemaWriter;
import com.streamsets.pipeline.lib.jdbc.typesupport.JdbcType;
import com.streamsets.pipeline.lib.jdbc.typesupport.JdbcTypeInfo;
import com.streamsets.pipeline.stage.processor.jdbcmetadata.JdbcMetadataProcessor;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;

public class JdbcSchemaReader {
  private static final Logger LOG = LoggerFactory.getLogger(JdbcMetadataProcessor.class);

  // JDBC Metadata Columns
  @VisibleForTesting
  public static final int COLUMN_NAME = 4;
  @VisibleForTesting
  public static final int DATA_TYPE = 5;
  @VisibleForTesting
  public static final int TYPE_STRING = 6;
  @VisibleForTesting
  public static final int COLUMN_SIZE = 7;
  @VisibleForTesting
  public static final int DECIMAL_DIGITS = 9;

  private final HikariDataSource dataSource;
  private final JdbcSchemaWriter schemaWriter;
  private final JdbcUtil jdbcUtil;

  public JdbcSchemaReader(HikariDataSource dataSource, JdbcSchemaWriter schemaWriter) {
    this.dataSource = dataSource;
    this.schemaWriter = schemaWriter;
    this.jdbcUtil = UtilsProvider.getJdbcUtil();
  }

  public LinkedHashMap<String,JdbcTypeInfo> getTableSchema(String schema, String tableName) throws SQLException, StageException {
    LinkedHashMap<String, JdbcTypeInfo> columns = new LinkedHashMap<>();

    LOG.info("Loading schema for table {}.{}", schema, tableName);
    try (Connection connection = dataSource.getConnection()) {
      try (ResultSet metaDataTables = jdbcUtil.getTableMetadata(connection, schema, tableName)) {
        if (!metaDataTables.next()) {
          return columns;
        }

        ResultSet metaDataColumns = jdbcUtil.getColumnMetadata(connection, schema, tableName);
        while (metaDataColumns.next()) {
          JdbcType jdbcType = JdbcType.valueOf(metaDataColumns.getString(TYPE_STRING), metaDataColumns.getInt(DATA_TYPE));
          if(jdbcType == null) {
            throw new StageException(
                JdbcErrors.JDBC_91,
                metaDataColumns.getString(COLUMN_NAME),
                metaDataColumns.getString(TYPE_STRING),
                metaDataColumns.getInt(DATA_TYPE)
            );
          }

          JdbcTypeInfo typeInfo = jdbcType.getSupport().createTypeInfo(
              jdbcType,
              schemaWriter,
              metaDataColumns.getInt(COLUMN_SIZE),
              metaDataColumns.getInt(DECIMAL_DIGITS)
          );

          LOG.info("\tLoaded column '{}' {}('{}') as internal type {}",
              metaDataColumns.getString(COLUMN_NAME),
              metaDataColumns.getString(TYPE_STRING),
              metaDataColumns.getInt(DATA_TYPE),
              typeInfo
          );

          columns.put(metaDataColumns.getString(COLUMN_NAME),typeInfo);
        }
      }
    }

    return columns;
  }
}
