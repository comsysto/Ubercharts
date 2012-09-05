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

    /**
     * The minimum tick interval allowed in axis values.
     * For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours.
     * <p/>
     * Defaults to undefined.
     */
    public Long minTickInterval;

    /**
     * Color of the minor, secondary grid lines.
     * <p/>
     * Defaults to #E0E0E0.
     */
    public String minorGridLineColor = "#E0E0E0";

    /**
     * The dash or dot style of the minor grid lines.
     * <p/>
     * Defaults to Solid.
     */
    public DashStyle minorGridLineDashStyle = DashStyle.Solid;

    /**
     * Width of the minor, secondary grid lines.
     * <p/>
     * Defaults to 1.
     */
    public int minorGridLineWidth = 1;

    /**
     * Color for the minor tick marks.
     * <p/>
     * Defaults to #A0A0A0.
     */
    public String minorTickColor = "#A0A0A0";

    /**
     * Tick interval in scale units for the minor ticks.
     * On a linear axis, if "auto", the minor tick interval is calculated as a fifth of the tickInterval.
     * If null, minor ticks are not shown.
     * <p/>
     * On logarithmic axes, the unit is the power of the value.
     * For example, setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc.
     * Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 10 and 100 etc.
     * A minorTickInterval of "auto" on a log axis results in a best guess,
     * attempting to enter approximately 5 minor ticks between each major tick.
     * <p/>
     * <i>'Auto' as value not supported by Ubercharts.</i>
     * <p/>
     * Defaults to null.
     */
    public Double minorTickInterval;

    /**
     * The pixel length of the minor tick marks.
     * Defaults to 2.
     */
    public int minorTickLength = 2;

    /**
     * The position of the minor tick marks relative to the axis line.
     * Can be one of inside and outside.
     * <p/>
     * Defaults to outside.
     */
    public TickPosition minorTickPosition = TickPosition.outside;

    /**
     * The pixel width of the minor tick mark.
     * <p/>
     * Defaults to 0.
     */
    public int minorTickWidth = 0;

    /**
     * The distance in pixels from the plot area to the axis line.
     * A positive offset moves the axis with it's line, labels and ticks away from the plot area.
     * This is typically used when two or more axes are displayed on the same side of the plot.
     * <p/>
     * Defaults to 0.
     */
    public int offset = 0;

    /**
     * Whether to display the axis on the opposite side of the normal.
     * The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively.
     * This is typically used with dual or multiple axes.
     * <p/>
     * Defaults to false.
     */
    public boolean opposite = false;

    /**
     * A colored band stretching across the plot area marking an interval on the axis.
     */
    public PlotBands plotBands = new PlotBands();

    /**
     * A line streching across the plot area, marking a specific value on one of the axes.
     */
    public PlotLines plotLines = new PlotLines();

    /**
     * Whether to reverse the axis so that the highest number is closest to origo.
     * If the chart is inverted, the x axis is reversed by default.
     * <p/>
     * Defaults to false.
     */
    public boolean reversed = false;

    /**
     * Whether to show the axis line and title when the axis has no data.
     * <p/>
     * Defaults to true.
     */
    public boolean showEmpty = true;

    /**
     * Whether to show the first tick label.
     * <p/>
     * Defaults to true.
     */
    public boolean showFirstLabel = true;

    /**
     * Whether to show the last tick label.
     * <p/>
     * Defaults to false.
     */
    public boolean showLastLabel = false;

    /**
     * For datetime axes, this decides where to put the tick between weeks.
     * 0 = Sunday, 1 = Monday.
     * <p/>
     * Defaults to 1.
     */
    public Integer startOfWeek = 1;

    /**
     * Whether to force the axis to start on a tick.
     * Use this option with the maxPadding option to control the axis start.
     * <p/>
     * Defaults to false.
     */
    public boolean startOnTick = false;

    /**
     * Color for the main tick marks.
     * <p/>
     * Defaults to #C0D0E0.
     */
    public String tickColor = "#C0D0E0";

    /**
     * The pixel length of the main tick marks.
     * <p/>
     * Defaults to 5.
     */
    public int tickLength = 5;

    /**
     * If tickInterval is null this option sets the approximate pixel interval of the tick marks.
     * Not applicable to categorized axis.
     * <p/>
     * Defaults to 72 for the Y axis and 100 for the X axis.
     * <p/>
     * <i>Defaults provided in this case by Highcharts itself.</i>
     */
    public Integer tickPixelInterval;

    /**
     * The position of the major tick marks relative to the axis line. Can be one of inside and outside.
     * <p/>
     * Defaults to "outside".
     */
    public TickPosition tickPosition = TickPosition.outside;

    /**
     * The pixel width of the major tick marks.
     * <p/>
     * Defaults to 1.
     */
    public int tickWidth = 1;

    /**
     * For categorized axes only.
     * If "on" the tick mark is placed in the center of the category,
     * if "between" the tick mark is placed between categories. Defaults to "between".
     */
    public TickmarkPlacement tickmarkPlacement = TickmarkPlacement.between;

    /**
     * The axis title, showing next to the axis line.
     * <p/>
     * TODO db requires Title for Axis here!
     */
    public Title title = new Title();

    /**
     * The type of axis. Can be one of "linear", "logarithmic" or "datetime".
     * In a datetime axis, the numbers are given in milliseconds, and tick marks are placed on appropriate values like full hours or days.
     * <p/>
     * Defaults to "linear".
     */
    public AxisType type = AxisType.linear;


}
