/*
 Copyright 2011 comSysto GmbH

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.Point;
import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Collection;

/**
 * Implementation of {@link AbstractSeries} which represents an array of X/Y-Coordinates to be plotted on the chart.
 * <p/>
 * For more information read href="http://www.highcharts.com/ref/#series.
 * <p/>
 * Date: Feb 18, 2011 Time: 9:47:50 PM
 *
 * @author Mohammed El Batya
 * @see Point
 */
public class PointSeries extends AbstractSeries<Point[]> {

    /** {@link AbstractSeries#AbstractSeries()} */
    public PointSeries() {
    }

    /** {@link AbstractSeries#AbstractSeries(String)} */
    public PointSeries(String pName) {
        super(pName);
    }


    /**
     * Sets an array of {@link Point}s to this series to be plotted on the chart.
     *
     * @param pPoints an array of {@link Point}s
     * @return this object for convenient chaining, not a copy
     * @see Point
     */
    public PointSeries setData(Point[] pPoints) {
        mData = pPoints;
        return this;
    }


    /**
     * Sets an {@link Collection} of {@link Point}s to this series to be plotted on the chart.
     *
     * @param pPoints an {@link Collection} of {@link Point}s
     * @return this object for convenient chaining, not a copy
     * @see Point
     */
    public PointSeries setData(Collection<Point> pPoints) {
        return setData((Point[]) pPoints.toArray());
    }
}
