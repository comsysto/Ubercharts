/*
 * Copyright 2012 comSysto GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.comsysto.ubercharts.api;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Highchart by default puts a credits label in the lower right corner of the chart. This can be changed using these options.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Credits implements Serializable {

    /**
     * Whether to show the credits text.
     * <p/>
     * Defaults to true.
     */
    public boolean enabled = true;

    /**
     * The URL for the credits label.
     * <p/>
     * Defaults to "http://www.highcharts.com".
     */
    public String href = "http://www.highcharts.com";

    /**
     * Highchart by default puts a credits label in the lower right corner of the chart.
     * This can be changed using these options.
     */
    public Position position = new Position();

    /**
     * CSS styles for the credits label.
     * <p/>
     * Defaults to:
     * <p/>
     * <pre>
     *     style: {
     *              cursor: 'pointer',
     *              color: '#909090',
     *              fontSize: '10px'
     *          }
     * </pre>
     * <p/>
     */
    public Map<String, String> style = new LinkedHashMap<String, String>();

    /**
     * The text for the credits label.
     * <p/>
     * Defaults to "Highcharts.com".
     */
    public String text = "Highcharts.com";

    public Credits() {

        style.put("cursor", "pointer");
        style.put("color", "#909090");
        style.put("fontSize", "10px");

    }
}
