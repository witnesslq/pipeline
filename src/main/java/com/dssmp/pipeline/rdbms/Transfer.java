package com.dssmp.pipeline.rdbms;

import com.dssmp.pipeline.config.PipelineConfiguration;

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
public abstract class Transfer {
    protected PipelineConfiguration pipelineConfiguration;
    protected ConnectionFactroy exportConnectionFactory;
    protected ConnectionFactroy importConnectionFactory;


    public Transfer(PipelineConfiguration pipelineConfiguration, ConnectionFactroy exportConnectionFactory, ConnectionFactroy importConnectionFactory) {
        this.pipelineConfiguration = pipelineConfiguration;
        this.exportConnectionFactory = exportConnectionFactory;
        this.importConnectionFactory = importConnectionFactory;
    }

    public PipelineConfiguration getPipelineConfiguration() {
        return pipelineConfiguration;
    }

    public void setPipelineConfiguration(PipelineConfiguration pipelineConfiguration) {
        this.pipelineConfiguration = pipelineConfiguration;
    }

    public ConnectionFactroy getExportConnectionFactory() {
        return exportConnectionFactory;
    }

    public void setExportConnectionFactory(ConnectionFactroy exportConnectionFactory) {
        this.exportConnectionFactory = exportConnectionFactory;
    }

    public ConnectionFactroy getImportConnectionFactory() {
        return importConnectionFactory;
    }

    public void setImportConnectionFactory(ConnectionFactroy importConnectionFactory) {
        this.importConnectionFactory = importConnectionFactory;
    }

    /**
     * 传输
     */
    public abstract void tranfer() throws Exception;
}
