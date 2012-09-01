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
public class Series implements Serializable {

    public static Series newSeries() {

        return new Series();

    }

    public List<Data> data = new ArrayList<Data>();

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * <p/>
     * Defaults to "".
     */
    public String name = "";

    /**
     * The type of series. Can be one of area, areaspline, bar, column, line, pie, scatter or spline.
     * From version 2.3, arearange, areasplinerange and columnrange are supported with the highcharts-more.js component.
     * <p/>
     * Defaults to "line".
     */
    public Type type = Type.line;

    public Series data(int[] y) {

        data.clear();

        for (int i = 0; i < y.length; i++) {

            data.add(new Data(y[i]));

        }

        return this;

    }

    public Series data(int[] x, int[] y) {

        data.clear();

        for (int i = 0; i < x.length; i++) {

            data.add(new Data(x[i], y[i]));

        }

        return this;

    }

    public Series name(String name) {

        this.name = name;
        return this;

    }


}
