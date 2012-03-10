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

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 08/03/2011
 * Time: 16:53
 */
class BasicTitle implements Serializable {

    private String mText;
    private Align mAlign;
    private Map<String, String> mStyle;

    public BasicTitle(String pText) {
        mText = pText;
    }

    public BasicTitle(String pText, Align pAlign, Map<String, String> pStyle) {
        mText = pText;
        mAlign = pAlign;
        mStyle = pStyle;
    }

    public String getText() {
        return mText;
    }

    public BasicTitle setText(String pText) {
        mText = pText;
        return this;
    }

    public Align getAlign() {
        return mAlign;
    }

    public BasicTitle setAlign(Align pAlign) {
        mAlign = pAlign;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public BasicTitle setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }


}
