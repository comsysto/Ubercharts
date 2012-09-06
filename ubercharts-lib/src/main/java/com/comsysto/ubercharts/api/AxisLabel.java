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
 * The axis labels show the number or category for each tick.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AxisLabel implements Serializable {

    /**
     * What part of the string the given position is anchored to.
     * Can be one of "left", "center" or "right".
     * In inverted charts, x axis label alignment and y axis alignment are swapped.
     * <p/>
     * Defaults to "center".
     */
    public Align align = Align.center;

    /**
     * Enable or disable the axis labels.
     * <p/>
     * Defaults to true.
     */
    public boolean enabled = true;

    /**
     * How to handle overflowing labels on horizontal axis.
     * Can be undefined or "justify". If "justify", labels will not render outside the plot area.
     * If there is room to move it, it will be aligned to the edge, else it will be removed.
     * <p/>
     * Defaults to undefined.
     */
    public Overflow overflow = Overflow.undefined;

    /**
     * Rotation of the labels in degrees.
     * <p/>
     * Defaults to 0.
     */
    public int rotation = 0;

    /**
     * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.
     * <p/>
     * Defaults to null.
     */
    public Integer staggerLines;

    /**
     * To show only every n'th label on the axis, set the step to n.
     * Setting the step to 2 shows every other label.
     * <p/>
     * Defaults to null.
     */
    public Integer step;

    /**
     * CSS styles for the label.
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
     * The x position offset of the label relative to the tick position on the axis.
     * <p/>
     * Defaults to 0.
     */
    public int x;

    /**
     * The y position offset of the label relative to the tick position on the axis.
     * <p/>
     * Defaults to 0.
     */
    public int y;

    public AxisLabel() {

        style.put("color", "#6D869F");
        style.put("fontWeight", "bold");

    }

    public enum Overflow {

        justify, undefined

    }

}
