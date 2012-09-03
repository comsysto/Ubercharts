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
import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Axis implements Serializable {


    /**
     * An id for the axis. This can be used after render time to get a pointer to the axis object through chart.get().
     * <p/>
     * Defaults to null.
     */
    public String id;

    /**
     * Whether to allow decimals in this axis' ticks.
     * When counting integers, like persons or hits on a web page, decimals must be avoided in the axis tick labels.
     * <p/>
     * Defaults to true.
     */
    public boolean allowDecimals = true;

    /**
     * When using an alternate grid color, a band is painted across the plot area between every other grid line.
     * <p/>
     * Defaults to null.
     */
    public String alternateGridColor;

    /**
     * If categories are present for the xAxis, names are used instead of numbers for that axis.
     * <p/>
     * Example:
     * categories: ['Apples', 'Bananas', 'Oranges']
     */
    public List<String> categories = new ArrayList<String>();

    /**
     * Whether to force the axis to end on a tick. Use this option with the maxPadding option to control the axis end.
     * <p/>
     * Defaults to false.
     */
    public boolean endOnTick = false;

    /**
     * Color of the grid lines extending the ticks across the plot area.
     * <p/>
     * Defaults to "#C0C0C0".
     */
    public String gridLineColor = "#C0C0C0";

    /**
     * The dash or dot style of the grid lines.
     * <p/>
     * Defaults to Solid.
     */
    public DashStyle gridLineDashStyle = DashStyle.Solid;

    /**
     * The width of the grid lines extending the ticks across the plot area.
     * <p/>
     * Defaults to 0.
     */
    public int gridLineWidth = 0;

    /**
     * The color of the line marking the axis itself.
     * <p/>
     * Defaults to "#C0D0E0".
     */
    public String lineColor = "#C0D0E0";

    /**
     * The width of the line marking the axis itself.
     * <p/>
     * Defaults to 1.
     */
    public int lineWidth = 1;

    /**
     * The maximum value of the axis. If null, the max value is automatically calculated.
     * If the endOnTick option is true, the max value might be rounded up.
     * The actual maximum value is also influenced by chart.alignTicks.
     * <p/>
     * Defaults to null.
     */
    public Long max;

    /**
     * The minimum value of the axis. If null the min value is automatically calculated.
     * If the startOnTick option is true, the min value might be rounded down.
     * <p/>
     * Defaults to null.
     */
    public Long mix;

    /**
     * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
     * This is useful when you don't want the highest data value to appear on the edge of the plot area.
     * When the axis' max option is set or a max extreme is set using axis.setExtremes(), the maxPadding will be ignored.
     * <p/>
     * Defaults to 0.01.
     */
    public double maxPadding = 0.01;

    /**
     * The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this.
     * For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.
     * <p/>
     * The default minRange for the x axis is five times the smallest interval between any of the data points.
     * <p/>
     * On a logarithmic axis, the unit for the minimum range is the power.
     * So a minRange of 1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.
     */
    public Long minRange;

}
