/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.graph;

import org.apache.nifi.controller.ControllerService;

import java.util.Map;

public interface GraphClientService extends ControllerService {
    String NODES_CREATED= "graph.nodes.created";
    String RELATIONS_CREATED = "graph.relations.created";
    String LABELS_ADDED = "graph.labels.added";
    String NODES_DELETED = "graph.nodes.deleted";
    String RELATIONS_DELETED = "graph.relations.deleted";
    String PROPERTIES_SET = "graph.properties.set";
    String ROWS_RETURNED = "graph.rows.returned";

    Map<String, String> executeQuery(String query, Map<String, Object> parameters, GraphQueryResultCallback handler);
    String getTransitUrl();
}