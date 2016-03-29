package com.dssmp.pipeline.rdbms.impl;

import com.dssmp.pipeline.config.PipelineConfiguration;
import com.dssmp.pipeline.rdbms.ConnectionFactroy;

import java.sql.Connection;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class MySqlConnectionFactory extends ConnectionFactroy {


    public MySqlConnectionFactory(PipelineConfiguration pipelineConfiguration) {
        super(pipelineConfiguration);
    }

    public MySqlConnectionFactory(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void init() {

    }
}
