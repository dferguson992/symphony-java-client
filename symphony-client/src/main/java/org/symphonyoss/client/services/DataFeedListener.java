/*
 *
 * Copyright 2016 The Symphony Software Foundation
 *
 * Licensed to The Symphony Software Foundation (SSF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.symphonyoss.client.services;

import org.symphonyoss.symphony.agent.model.V2BaseMessage;
import org.symphonyoss.client.events.SymEvent;

/**
 * Callback listener used by the {@link MessageService} to read in base level messages.
 * <p>
 * <p>
 * @author Frank Tarsillo
 */
interface DataFeedListener {

    /**
     * Base messages from datafeed polling
     * This is only enabled when V2 API is being used.
     * @param message Base message
     */
    void onMessage(V2BaseMessage message);


    /**
     * Listen to all events from datafeed polling
     * This is only enabled when V4+ API is being used.
     *
     * @param symEvent Events received from datafeed polling
     */
    void onEvent(SymEvent symEvent);
}
