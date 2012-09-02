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
 * Options for the paging or navigation appearing when the legend is overflown.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Navigation implements Serializable {

    /**
     * The color for the active up or down arrow in the legend page navigation.
     * <p/>
     * Defaults to #3E576F.
     */
    public String activeColor = "#3E576F";

    /**
     * How to animate the pages when navigating up or down. A value of true applies the default navigation given in the chart.animation option.
     * Additional options can be given as an object containing values for easing and duration.
     * <p/>
     * Defaults to true.
     */
    public boolean animation = true;

    /**
     * The pixel size of the up and down arrows in the legend paging navigation.
     * <p/>
     * Defaults to 12.
     */
    public int arrowSize = 12;

    /**
     * The color of the inactive up or down arrow in the legend page navigation.
     * <p/>
     * Defaults to #CCC.
     */
    public String inactiveColor = "#CCC";

    /**
     * Text styles for the legend page navigation.
     */
    public Map<String, String> style = new LinkedHashMap<String, String>();

}
