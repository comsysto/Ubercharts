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

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Map;

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class ChartTitle extends Subtitle {

    private Integer margin;

    public ChartTitle(String pText) {
        super(pText);
    }

    public ChartTitle(String pText, Align pAlign, Map<String, String> pStyle) {
        super(pText, pAlign, pStyle);
    }

    public Integer getMargin() {
        return margin;
    }

    public ChartTitle setMargin(Integer pMargin) {
        margin = pMargin;
        return this;
    }
}