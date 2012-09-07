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

import org.codehaus.jackson.annotate.JsonRawValue;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class DataLabels implements Serializable {
    private Align align;
    private Boolean enabled;
    private String color;
    private int x;
    @JsonRawValue
    private String formatter;
    private String connectorColor;

    public Align getAlign() {
        return align;
    }

    public DataLabels setAlign(Align align) {
        this.align = align;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public DataLabels setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getColor() {
        return color;
    }

    public DataLabels setColor(Color color) {
        this.color = color.name();
        return this;
    }

    public String getFormatter() {
        return formatter;
    }

    public DataLabels setFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public int getX() {
        return x;
    }

    public DataLabels setX(int x) {
        this.x = x;
        return this;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConnectorColor(String connectorColor) {
        this.connectorColor = connectorColor;
    }
}