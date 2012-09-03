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
 * Options for the tooltip that appears when the user hovers over a series or point.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Tooltip implements Serializable {

    private static final String EMPTY = "";

    /**
     * Enable or disable animation of the tooltip.
     * In old browsers combined with data-heavy charts, the animation may be slow, so turning it off can be a good idea.
     * <p/>
     * Defaults to true.
     *
     * @since Highcharts 2.3.0
     */
    public boolean animation = true;

    /**
     * The background color or gradient for the tooltip.
     * <p/>
     * Defaults to "rgba(255, 255, 255, .85)". Set in Highcharts though.
     */
    public String backgroundColor;

    /**
     * The color of the tooltip border. When null, the border takes the color of the corresponding series or point.
     * <p/>
     * Defaults to null.
     */
    public String borderColor;

    /**
     * The radius of the rounded border corners.
     * <p/>
     * Defaults to 5.
     */
    public int borderRadius = 5;

    /**
     * The pixel width of the tooltip border.
     * <p/>
     * Defaults to 2.
     */
    public int borderWidth = 2;

    /**
     * Display crosshairs to connect the points with their corresponding axis values.
     * The crosshairs can be defined as a boolean, an array of booleans or an object.
     * <p/>
     * Ubercharts currently only supports single boolean value.
     * If the crosshairs option is true, a single crosshair relating to the x axis will be shown.
     * <p/>
     * TODO (db) provide more options as in Highcharts.
     */
    public boolean crosshairs = false;

    /**
     * Enable or disable the tooltip.
     * <p/>
     * Defaults to true.
     */
    public boolean enabled = true;

    /**
     * A string to append to the tooltip format.
     * <p/>
     * Defaults to false.
     */
    public String footerFormat;

    /**
     * The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets.
     * Available variables are point.x, point.y, series.name and series.color and other properties on the same form.
     * Furthermore, point.y can be extended by the tooltip.yPrefix and tooltip.ySuffix variables.
     * This can also be overridden for each series, which makes it a good hook for displaying units.
     * <p/>
     * Defaults to :
     * <pre>
     *     <span style="color:{series.color}">{series.name}</span>: <b>{point.y}</b><br/>
     * </pre>
     */
    public String pointFormat = "<span style=\"color:{series.color}\">{series.name}</span>: <b>{point.y}</b><br/>";

    /**
     * Whether to apply a drop shadow to the tooltip.
     * <p/>
     * Defaults to true.
     */
    public boolean shadow = true;

    /**
     * When the tooltip is shared, the entire plot area will capture mouse movement,
     * and tooltip texts for all series will be shown in a single bubble.
     * This is recommended for single series charts and for iPad optimized sites.
     * <p/>
     * Defaults to false.
     */
    public boolean shared = false;

    /**
     * Proximity snap for graphs or single points. Does not apply to bars, columns and pie slices.
     * It defaults to 10 for mouse-powered devices and 25 for touch devices.
     * <p/>
     * Defaults to 10/25 in Highcharts. Ubercharts sets default value to 10.
     * TODO (db) revisit!
     */
    public int snap = 10;

    /**
     * CSS styles for the tooltip. The tooltip can also be styled through the CSS class .highcharts-tooltip.
     * <p/>
     * Default value:
     * style:
     * <pre>
     * {
     *  color: '#333333',
     *  fontSize: '9pt',
     *  padding: '5px'
     * }
     * </pre>
     */
    public Map<String, String> style = new LinkedHashMap<String, String>();

    /**
     * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip.
     * It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
     * <p/>
     * Defaults to false.
     */
    public boolean useHTML = false;

    /**
     * How many decimals to show in each series' y value. This is overridable in each series' tooltip options object.
     * <p/>
     * The default is to preserve all decimals. It's set in Highcharts itself though.
     * <p/>
     * TODO (db) revisit!
     */
    public Integer valueDecimals;

    /**
     * A string to prepend to each series' y value. Overridable in each series' tooltip options object.
     * <p/>
     * Defaults to "".
     */
    public String valuePrefix = EMPTY;

    /**
     * A string to append to each series' y value. Overridable in each series' tooltip options object.
     * <p/>
     * Defaults to "".
     */
    public String valueSuffix = EMPTY;

    /**
     * The format for the date in the tooltip header if the X axis is a datetime axis.
     * Example for a different format: '%Y-%m-%d'.
     * <p/>
     * The default is a best guess based on the smallest distance between points in the chart. Provided by Highcharts though.
     */
    public String xDateFormat;

    public Tooltip() {

        style.put("color", "#333333");
        style.put("fontSize", "9pt");
        style.put("padding", "5px");

    }
}
