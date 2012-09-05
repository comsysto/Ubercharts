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
 * A colored band stretching across the plot area marking an interval on the axis.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PlotBands implements Serializable {

    /**
     * An id used for identifying the plot band in Axis.removePlotBand.
     * <p/>
     * Defaults to null.
     */
    public String id;


    /**
     * The color of the plot band.
     * <p/>
     * Defaults to null.
     */
    public String color;

    /**
     * The start position of the plot band in axis units.
     * <p/>
     * Defaults to null.
     */
    public Integer from;

    /**
     * The end position of the plot band in axis units.
     * <p/>
     * Defaults to null.
     */
    public Integer to;

    /**
     * Text labels for the plot bands.
     */
    public PlotLabel label = new PlotLabel();

    /**
     * The z index of the plot band within the chart.
     * <p/>
     * Defaults to null.
     */
    public Integer zIndex;

}
