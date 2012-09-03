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
 * Applies only to polar charts and angular gauges.
 * This configuration object holds general options for the combined X and Y axes set.
 * Each xAxis or yAxis can reference the pane by index.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Pane implements Serializable {

    public static final int X = 0;
    public static final int Y = 1;

    /**
     * An object, or array of objects, for backgrounds.
     * Sub options include backgroundColor (which can be solid or gradient), innerWidth, outerWidth, borderWidth, borderColor.
     */
    public List<Background> background = new ArrayList<Background>();

    /**
     * The start angle of the polar X axis or gauge axis, given in degrees where 0 is north.
     * <p/>
     * Defaults to 0.
     */
    public int startAngle = 0;

    /**
     * The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north.
     * <p/>
     * Defaults to startAngle + 360.
     */
    public int endAngle = startAngle + 360;

    /**
     * The center of a polar chart or angular gauge, given as an array of [x, y] positions.
     * Positions can be given as integers that transform to pixels, or as percentages of the plot area size.
     * <p/>
     * Defaults to ['50%', '50%'].
     */
    private List<String> center = new ArrayList<String>(2);

    public Pane() {

        center.add("50%");
        center.add("50%");

    }

    public Pane center(String x, String y) {

        center.set(X, x);
        center.set(Y, y);

        return this;

    }

    public Pane center(int x, int y) {

        center.set(X, String.valueOf(x));
        center.set(Y, String.valueOf(y));

        return this;

    }

    public String getXOfCenter() {

        return center.get(X);

    }

    public String getYOfCenter() {

        return center.get(Y);

    }
}
