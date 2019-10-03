/*
 * Copyright 2010-2019 Boxfuse GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.output;

import java.util.List;

public class InfoOutput {
    public String productVersion;
    public String database;
    public String schemaVersion;
    public String schemaName;
    public int executionTime;
    public List<MigrationOutput> migrations;

    public InfoOutput(String productVersion, String database, String schemaVersion, String schemaName,
                      int executionTime, List<MigrationOutput> migrations) {
        this.productVersion = productVersion;
        this.database = database;
        this.schemaVersion = schemaVersion;
        this.schemaName = schemaName;
        this.executionTime = executionTime;
        this.migrations = migrations;
    }
}