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
 * A line streching across the plot area, marking a specific value on one of the axes.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PlotLines implements Serializable {

    /**
     * An id used for identifying the plot line in Axis.removePlotLine.
     * <p/>
     * Defaults to null.
     */
    public String id;

    /**
     * The color of the line.
     * <p/>
     * Defaults to null.
     */
    public String color;

    /**
     * The dashing or dot style for the plot line.
     * <p/>
     * Defaults to Solid.
     */
    public DashStyle dashStyle = DashStyle.Solid;

    /**
     * Text labels for the plot bands.
     */
    public PlotLabel label;

    /**
     * The position of the line in axis units.
     * <p/>
     * Defaults to null.
     */
    public Double value;

    /**
     * The width or thickness of the plot line.
     * <p/>
     * Defaults to null.
     */
    public Integer width;

    /**
     * The z index of the plot line within the chart.
     * <p/>
     * Defaults to null.
     */
    public Integer zIndex;

}
