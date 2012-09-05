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
 * Text label for the plot bands.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
class PlotLabel implements Serializable {


    public static PlotLabel horizontal() {

        return new PlotLabel(0);

    }

    public static PlotLabel vertical() {

        return new PlotLabel(90);

    }

    /**
     * Horizontal alignment of the label. Can be one of "left", "center" or "right".
     * <p/>
     * Defaults to "center".
     */
    public Align align = Align.center;

    /**
     * Rotation of the text label in degrees.
     * Defaults to 0 for horizontal plot lines and 90 for vertical lines.
     */
    public Integer rotation;

    /**
     * CSS styles for the text label
     */
    public Map<String, String> style = new LinkedHashMap<String, String>();

    /**
     * The string text itself. A subset of HTML is supported.
     */
    public String text;

    /**
     * The text alignment for the label.
     * While align determines where the texts anchor point is placed within the plot band,
     * textAlign determines how the text is aligned against its anchor point.
     * <p/>
     * Possible values are "left", "center" and "right".
     * <p/>
     * Defaults to the same as the align option
     */
    public Align textAlign = align;

    /**
     * Vertical alignment of the label relative to the plot band.
     * Can be one of "top", "middle" or "bottom".
     * <p/>
     * Defaults to "top".
     */
    public VerticalAlign verticalAlign = VerticalAlign.top;

    /**
     * Horizontal position relative the alignment.
     * <p/>
     * Default varies by orientation.
     */
    public Integer x;

    /**
     * Vertical position of the text baseline relative to the alignment.
     * <p/>
     * Default varies by orientation.
     */
    public Integer y;

    public PlotLabel() {

    }

    public PlotLabel(Integer rotation) {

        this.rotation = rotation;

    }
}