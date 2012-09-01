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

/**
 * Options regarding the chart area and plot area as well as general chart options.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Chart implements Serializable {

    private static final String EMPTY = "";

    /**
     * When using multiple axis, the ticks of two or more opposite axes will automatically be aligned by adding ticks
     * to the axis or axes with the least ticks.
     * This can be prevented by setting alignTicks to false.
     * If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting gridLineWidth to 0.
     * <p/>
     * Defaults to true.
     */
    public boolean alignTicks = true;

    /**
     * Set the overall animation for all chart updating. Animation can be disabled throughout the chart by setting it to false here.
     * It can be overridden for each individual API method as a function parameter.
     * The only animation not affected by this option is the initial series animation, see plotOptions.series => animation.
     * <p/>
     * The animation can either be set as a boolean or a configuration object.
     * <p/>
     * <i>NOTE: Defining animation as a configuration object currently not supported by Ubercharts</i>
     * <p/>
     * If true, it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object, the following properties are supported:
     * <p/>
     * duration The duration of the animation in milliseconds.
     * easing When using jQuery as the general framework, the easing can be set to linear or swing.
     * More easing functions are available with the use of jQuery plug-ins, most notably the jQuery UI suite.
     * See the jQuery docs. When using MooTools as the general framework, use the property name transition instead of easing.
     * <p/>
     * Defaults to true.
     */
    public boolean animation = true;

    /**
     * The background color or gradient for the outer chart area.
     * <p/>
     * <i>NOTE: Defining backgroundColor as a gradient currently not supported by Ubercharts</i>
     * <p/>
     * Defaults to "#FFFFFF".
     */
    public String backgroundColor = "#FFFFFF";

    /**
     * The color of the outer chart border.
     * The border is painted using vector graphic techniques to allow rounded corners.
     * <p/>
     * Defaults to "#4572A7".
     */
    public String borderColor = "#4572A7";

    /**
     * The corner radius of the outer chart border in px.
     * <p/>
     * Defaults to 5.
     */
    public int borderRadius = 5;

    /**
     * The pixel width of the outer chart border.
     * The border is painted using vector graphic techniques to allow rounded corners.
     * <p/>
     * Defaults to 0.
     */
    public int borderWidth = 0;

    /**
     * A CSS class name to apply to the charts container div, allowing unique CSS styling for each chart.
     * <p/>
     * Defaults to "".
     */
    public String className = EMPTY;

    /**
     * An explicit height for the chart. By default the height is calculated from the offset height of the containing element.
     * <p/>
     * Defaults to null.
     * <p/>
     * TODO (db) a problem for the api
     */
    public Integer height;

    /**
     * If true, the axes will scale to the remaining visible series once one series is hidden.
     * If false, hiding and showing a series will not affect the axes or the other series.
     * For stacks, once one series within the stack is hidden, the rest of the stack will close in around it even if the axis is not affected.
     * <p/>
     * Defaults to true.
     */
    public boolean ignoreHiddenSeries = true;

    /**
     * Whether to invert the axes so that the x axis is horizontal and y axis is vertical. When true, the x axis is reversed by default.
     * If a bar plot is present in the chart, it will be inverted automatically.
     * <p/>
     * Defaults to false.
     */
    public boolean inverted = false;

    /**
     * The margin between the bottom outer edge of the chart and the plot area in px.
     * Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also spacingBottom.
     * <p/>
     * Defaults to 70.
     */
    public int marginBottom = 70;

    /**
     * The margin between the left outer edge of the chart and the plot area.
     * Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also spacingLeft.
     * <p/>
     * Defaults to 80.
     */
    public int marginLeft = 80;

    /**
     * The margin between the right outer edge of the chart and the plot area.
     * Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also spacingRight.
     * <p/>
     * Defaults to 50.
     */
    public int marginRight = 50;

    /**
     * The margin between the top outer edge of the chart and the plot area.
     * Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also spacingTop.
     * <p/>
     * Defaults to null.
     * <p/>
     * TODO (db) a problem for the api
     */
    public int marginTop;

    /**
     * The background color or gradient for the plot area.
     * <p/>
     * Defaults to null.
     * <p/>
     * TODO (db) a problem for the api
     */
    public String plotBackgroundColor;

    /**
     * The URL for an image to use as the plot background.
     * To set an image as the background for the entire chart, set a CSS background image to the container element.
     * <p/>
     * Defaults to null.
     * <p/>
     * TODO (db) a problem for the api
     */
    public String plotBackgroundImage;

    /**
     * The color of the inner chart or plot area border.
     * <p/>
     * Defaults to "#C0C0C0".
     */
    public String plotBorderColor = "#C0C0C0";

    /**
     * The pixel width of the plot area border.
     * <p/>
     * Defaults to 0.
     */
    public int plotBorderWidth = 0;

    /**
     * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set.
     * Since 2.3 the shadow can be an object configuration containing color, offsetX, offsetY, opacity and width.
     * <p/>
     * <i>NOTE: Defining plotShadow as a configuration object currently not supported by Ubercharts</i>
     * <p/>
     * Defaults to false.
     */
    public boolean plotShadow = false;

    /**
     * When true, cartesian charts like line, spline, area and column are transformed into the polar coordinate system.
     * Requires highcharts-more.js.
     *
     * @since Highcharts 2.3.0
     */
    public boolean polar = false;

    /**
     * Whether to reflow the chart to fit the width of the container div on resizing the window.
     * <p/>
     * Defaults to true.
     */
    public boolean reflow = true;

    /**
     * The HTML element where the chart will be rendered. If it is a string, the element by that id is used.
     * The HTML element can also be passed by direct reference.
     * <p/>
     * <i>NOTE: Defining renderTo as a HTML element not supported by Ubercharts</i>
     * <p/>
     * Defaults to null.
     * TODO (db) a problem for the api
     */
    public String renderTo;

    /**
     * The space between the bottom edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position).
     * <p/>
     * Defaults to 15.
     */
    public int spacingBottom = 15;

    /**
     * The space between the left edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position).
     * <p/>
     * Defaults to 10.
     */
    public int spacingLeft = 10;

    /**
     * The space between the right edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position).
     * <p/>
     * Defaults to 10.
     */
    public int spacingRight = 10;

    /**
     * The space between the top edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position).
     * <p/>
     * Defaults to 10.
     */
    public int spacingTop = 10;

    /**
     * The default series type for the chart.
     * Can be one of line, spline, area, areaspline, column, bar, pie and scatter.
     * From version 2.3, arearange, areasplinerange and columnrange are supported with the highcharts-more.js component.
     * <p/>
     * Defaults to "line".
     */
    public Type type = Type.line;

    /**
     * An explicit width for the chart. By default the width is calculated from the offset width of the containing element.
     * <p/>
     * Defaults to null.
     * TODO (db) a problem for the api
     */
    public Integer width;

}
