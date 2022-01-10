/*
 * Copyright 2019 StreamSets Inc.
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
package com.streamsets.pipeline.stage.util.scripting;

import com.streamsets.pipeline.api.Record;

/**
 * Version of the record for scripts that works directly with our internal SDC Record
 */
public class SdcScriptRecord extends ScriptRecord {
  public final Record sdcRecord;

  SdcScriptRecord(Record record) {
    this.sdcRecord = record;
  }
}
