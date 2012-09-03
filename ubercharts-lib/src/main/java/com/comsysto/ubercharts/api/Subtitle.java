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
 * A subtitle of a chart.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Subtitle implements Serializable {

    /**
     * The horizontal alignment of the title. Can be one of "left", "center" and "right".
     * <p/>
     * Defaults to "center".
     */
    public Align align = Align.center;

    /**
     * When the title is floating, the plot area will not move to make space for it.
     * <p/>
     * Defaults to false.
     */
    public boolean floating = false;

    /**
     * CSS styles for the title. Use this for font styling, but use align, x and yfor text alignment.
     * <p/>
     * Defaults to:
     * <pre>
     * {
     *  color: '#3E576F',
     *  fontSize: '16px'
     * }
     * </pre>
     */
    public Map<String, String> style = new LinkedHashMap<String, String>();

    /**
     * The title of the chart. To disable the title, set the text to null.
     * <p/>
     * Defaults to "Chart title".
     */
    public String text = "Chart title";

    /**
     * The vertical alignment of the title. Can be one of "top", "middle" and "bottom".
     * <p/>
     * Defaults to "top".
     */
    public VerticalAlign verticalAlign = VerticalAlign.top;

    /**
     * The x position of the title relative to the alignment within chart.spacingLeft and chart.spacingRight.
     * <p/>
     * Defaults to 0.
     */
    public int x = 0;

    /**
     * The y position of the title relative to the alignment within chart.spacingTop and chart.spacingBottom.
     * <p/>
     * Defaults to 15.
     */
    public int y = 15;

}
