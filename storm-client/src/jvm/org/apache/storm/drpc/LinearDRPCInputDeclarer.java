/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.  The ASF licenses this file to you under the Apache License, Version
 * 2.0 (the "License"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package org.apache.storm.drpc;

import org.apache.storm.grouping.CustomStreamGrouping;
import org.apache.storm.topology.ComponentConfigurationDeclarer;
import org.apache.storm.tuple.Fields;

@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
public interface LinearDRPCInputDeclarer extends ComponentConfigurationDeclarer<LinearDRPCInputDeclarer> {
    LinearDRPCInputDeclarer fieldsGrouping(Fields fields);

    LinearDRPCInputDeclarer fieldsGrouping(String streamId, Fields fields);

    LinearDRPCInputDeclarer globalGrouping();

    LinearDRPCInputDeclarer globalGrouping(String streamId);

    LinearDRPCInputDeclarer shuffleGrouping();

    LinearDRPCInputDeclarer shuffleGrouping(String streamId);

    LinearDRPCInputDeclarer localOrShuffleGrouping();

    LinearDRPCInputDeclarer localOrShuffleGrouping(String streamId);

    LinearDRPCInputDeclarer noneGrouping();

    LinearDRPCInputDeclarer noneGrouping(String streamId);

    LinearDRPCInputDeclarer allGrouping();

    LinearDRPCInputDeclarer allGrouping(String streamId);

    LinearDRPCInputDeclarer directGrouping();

    LinearDRPCInputDeclarer directGrouping(String streamId);

    LinearDRPCInputDeclarer partialKeyGrouping(Fields fields);

    LinearDRPCInputDeclarer partialKeyGrouping(String streamId, Fields fields);

    LinearDRPCInputDeclarer customGrouping(CustomStreamGrouping grouping);

    LinearDRPCInputDeclarer customGrouping(String streamId, CustomStreamGrouping grouping);

}
