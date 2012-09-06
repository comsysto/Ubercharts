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
 * The axis title, showing next to the axis line.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AxisTitle implements Serializable {

    /**
     * Alignment of the title relative to the axis values.
     * Possible values are "low", "middle" or "high".
     * <p/>
     * Defaults to "middle".
     */
    public AxisTitleAlign align = AxisTitleAlign.middle;

    /**
     * The pixel distance between the axis labels or line and the title.
     * <p/>
     * Defaults to 0 for horizontal axes, 10 for vertical. Default values provided in Highcharts library itself.
     */
    public Integer margin;

    /**
     * The distance of the axis title from the axis line.
     * <p/>
     * By default, this distance is computed from the offset width of the labels, the labels' distance from the axis and the title's margin.
     * However when the offset option is set, it overrides all this.
     * <p/>
     * Defaults to undefined.
     */
    public Integer offset;

    /**
     * The rotation of the text in degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
     * <p/>
     * Defaults to 0.
     */
    public int rotation = 0;

    /**
     * CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.
     * Most noteworthy, a bug in IE8 renders all rotated strings bold and italic.
     * <p/>
     * Defaults to:
     * <pre>
     * style: {
     *      color: '#6D869F',
     *      fontWeight: 'bold'
     * }
     * </pre>
     */
    public Map<String, String> style = new LinkedHashMap<String, String>();

    /**
     * The actual text of the axis title. It can contain basic HTML text markup like <b>, <i> and spans with style.
     * Set the text to null to disable the title.
     * <p/>
     * Defaults to null.
     */
    public String text;

    public AxisTitle() {

        style.put("color", "#6D869F");
        style.put("fontWeight", "bold");

    }
}
