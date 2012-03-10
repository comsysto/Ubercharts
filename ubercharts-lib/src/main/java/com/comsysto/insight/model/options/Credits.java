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

import java.io.Serializable;
import java.util.Map;


public class Credits implements Serializable {

    private Boolean enabled;
    private Position position;
    private String href;
    private Map<String, String> style;
    private String text;

    public Credits(Boolean pEnabled) {
        enabled = pEnabled;
    }

    public Credits(String pText) {
        this(true);
        this.text = pText;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Credits setEnabled(Boolean pEnabled) {
        enabled = pEnabled;
        return this;
    }

    public Position getPosition() {
        return position;
    }

    public Credits setPosition(Position pPosition) {
        position = pPosition;
        return this;
    }

    public String getHref() {
        return href;
    }

    public Credits setHref(String pHref) {
        href = pHref;
        return this;
    }

    public Map<String, String> getStyle() {
        return style;
    }

    public Credits setStyle(Map<String, String> pStyle) {
        style = pStyle;
        return this;
    }

    public String getText() {
        return text;
    }

    public Credits setText(String pText) {
        text = pText;
        return this;
    }
}