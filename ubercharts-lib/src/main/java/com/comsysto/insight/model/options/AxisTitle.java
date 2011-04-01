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

package com.comsysto.insight.model.options;

import java.util.Map;

/**
 * Date: Feb 18, 2011
 * Time: 10:49:54 PM
 *
 * @author Mohammed El Batya
 */
public class AxisTitle extends BasicTitle {

    private Integer margin;
    private Integer rotation;

    public AxisTitle(String pText) {
        super(pText);
    }

    public AxisTitle(String pText, Align pAlign, Map<String, String> pStyle) {
        super(pText, pAlign, pStyle);
    }

    public Integer getMargin() {
        return margin;
    }

    public AxisTitle setMargin(Integer margin) {
        this.margin = margin;
        return this;
    }

    public Integer getRotation() {
        return rotation;
    }

    public AxisTitle setRotation(Integer rotation) {
        this.rotation = rotation;
        return this;
    }
}


