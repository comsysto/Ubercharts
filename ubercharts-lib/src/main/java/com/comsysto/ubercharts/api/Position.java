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
 * Position configuration for the credits label. Supported properties are align, verticalAlign, x and y.
 * <p/>
 * Defaults to:
 * <pre>
 *     position: {
 *      align: 'right',
 *      x: -10,
 *      verticalAlign: 'bottom',
 *      y: -5
 * }
 *
 * </pre>
 *
 * @author Daniel Bartl
 * @since Highcharts 2.1
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Position implements Serializable {

    public Align align = Align.right;

    public VerticalAlign verticalAlign = VerticalAlign.bottom;

    public int x = -10;

    public int y = -5;

}
