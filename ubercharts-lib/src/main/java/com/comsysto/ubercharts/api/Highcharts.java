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
public class Highcharts implements Serializable {

    /**
     * Options regarding the chart area and plot area as well as general chart options.
     */
    public Chart chart = new Chart();

    /**
     * Highchart by default puts a credits label in the lower right corner of the chart.
     * This can be changed using these options.
     */
    public Credits credits = new Credits();

    /**
     * HTML labels that can be positioined anywhere in the chart area.
     */
    public Labels labels = new Labels();

    /**
     * The actual series to append to the chart. In addition to the members listed below, any member of the plotOptions for
     * that specific type of plot can be added to a series individually.
     * <p/>
     * For example, even though a general lineWidth is specified in plotOptions.series, an individual lineWidth can be specified for each series.
     */
    public List<Series> series = new ArrayList<Series>();

    /**
     * The X axis or category axis. Normally this is the horizontal axis, though if the chart is inverted this is the vertical axis.
     * In case of multiple axes, the xAxis node is an array of configuration objects.
     */
    public Axis xAxis = new Axis();

    /**
     * The Y axis or value axis. Normally this is the vertical axis, though if the chart is inverted this is the horiontal axis.
     * In case of multiple axes, the yAxis node is an array of configuration objects.
     */
    public Axis yAxis = new Axis();

    public Highcharts series(Series seriesToAdd) {

        series.add(seriesToAdd);
        return this;

    }

}
