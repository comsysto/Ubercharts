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
 * The legend is a box containing a symbol and name for each series item or point item in the chart.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Legend implements Serializable {

    /**
     * The horizontal alignment of the legend box within the chart area.
     * <p/>
     * Defaults to "center".
     */
    public Align align = Align.center;

    /**
     * The background color of the legend, filling the rounded corner border.
     * <p/>
     * Defaults to null.
     */
    public String backgroundColor;

    /**
     * The color of the drawn border around the legend.
     * <p/>
     * Defaults to #909090.
     */
    public String borderColor = "#909090";

    /**
     * The width of the drawn border around the legend.
     * <p/>
     * Defaults to 1.
     */
    public int borderWidth = 1;

    /**
     * Enable or disable the legend.
     * <p/>
     * Defaults to true.
     */
    public boolean enabled = true;

    /**
     * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
     * <p/>
     * Defaults to false.
     */
    public boolean floating = false;

    /**
     * CSS styles for each legend item when the corresponding series or point is hidden.
     * Properties are inherited from style unless overridden here.
     * <p/>
     * Defaults to:
     * <pre>
     *  itemHiddenStyle: {
     *      color: '#CCC'
     *  }
     * </pre>
     */
    public Map<String, String> itemHiddenStyle = new LinkedHashMap<String, String>();

    /**
     * CSS styles for each legend item in hover mode. Properties are inherited from style unless overridden here.
     * <p/>
     * Defaults to:
     * <pre>
     *  itemHoverStyle: {
     *      color: '#000'
     * }
     * </pre>
     */
    public Map<String, String> itemHoverStyle = new LinkedHashMap<String, String>();

    /**
     * The pixel bottom margin for each legend item.
     * <p/>
     * Defaults to 0.
     */
    public int itemMarginBottom = 0;

    /**
     * The pixel top margin for each legend item.
     * <p/>
     * Defaults to 0.
     */
    public int itemMarginTop = 0;

    /**
     * CSS styles for each legend item.
     * <p/>
     * Defaults to:
     * <pre>
     *  itemStyle: {
     *      cursor: 'pointer',
     *      color: '#3E576F'
     * }
     * </pre>
     */
    public Map<String, String> itemStyle = new LinkedHashMap<String, String>();

    /**
     * The width for each legend item. This is useful in a horizontal layout with many items
     * when you want the items to align vertically.
     * <p/>
     * Defaults to null.
     * TODO db Problem for the api.
     */
    public int itemWidth;

    /**
     * The layout of the legend items.
     * Can be one of "horizontal" or "vertical".
     * <p/>
     * Defaults to "horizontal".
     */
    public Layout layout = Layout.horizontal;

    /**
     * If the plot area sized is calculated automatically and the legend is not floating,
     * the legend margin is the space between the legend and the axis labels or plot area.
     * <p/>
     * Defaults to 15.
     */
    public int margin = 15;

    /**
     * Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
     * <p/>
     * Defaults to undefined.
     * TODO db Problem for the api.
     */
    public int maxHeight;

    /**
     * Options for the paging or navigation appearing when the legend is overflown.
     */
    public Navigation navigation = new Navigation();

    /**
     * Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object.
     * <p/>
     * Defaults to false.
     */
    public boolean reversed = false;

    /**
     * Whether to show the symbol on the right side of the text rather than the left side. This is common in Arabic and Hebraic.
     * <p/>
     * Defaults to false.
     */
    public boolean rtl = false;

    /**
     * Whether to apply a drop shadow to the legend. A backgroundColor also needs to be applied for this to take effect.
     * Since 2.3 the shadow can be an object configuration containing color, offsetX, offsetY, opacity and width.
     * <i>Configuration object not supported by Ubercharts currently</i>
     * <p/>
     * Defaults to false.
     */
    public boolean shadow = false;

    /**
     * The pixel padding between the legend item symbol and the legend item text.
     * <p/>
     * Defaults to 5.
     */
    public int symbolPadding = 5;

    /**
     * The pixel width of the legend item symbol.
     * <p/>
     * Defaults to 30.
     */
    public int symbolWidth = 30;

    /**
     * The vertical alignment of the legend box. Can be one of "top", "middle" or "bottom".
     * Vertical position can be further determined by the y option. Defaults to "bottom".
     */
    public VerticalAlign verticalAlign = VerticalAlign.bottom;

    /**
     * The width of the legend box, not including style.padding.
     * <p/>
     * Defaults to null.
     * TODO db Problem for the api.
     */
    public int width;

    /**
     * The x offset of the legend relative to it's horizontal alignment align within chart.spacingLeft and chart.spacingRight.
     * Negative x moves it to the left, positive x moves it to the right. The default value of 15 together with align: "center" puts it in the center of the plot area.
     * <p/>
     * Defaults to 0.
     */
    public int x = 0;

    /**
     * The vertical offset of the legend relative to it's vertical alignment verticalAlign within chart.spacingTop and chart.spacingBottom.
     * Negative y moves it up, positive y moves it down.
     * <p/>
     * Defaults to 0.
     */
    public int y = 0;

}
