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

import java.io.Serializable;
import java.util.Map;

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Loading implements Serializable {

    private Integer mHideDuration;
    private Map<String, String> mLabelStyle;
    private Integer mShowDuration;
    private Map<String, String> mStyle;

    public Integer getHideDuration() {
        return mHideDuration;
    }

    public Loading setHideDuration(Integer pHideDuration) {
        mHideDuration = pHideDuration;
        return this;
    }

    public Map<String, String> getLabelStyle() {
        return mLabelStyle;
    }

    public Loading setLabelStyle(Map<String, String> pLabelStyle) {
        mLabelStyle = pLabelStyle;
        return this;
    }

    public Integer getShowDuration() {
        return mShowDuration;
    }

    public Loading setShowDuration(Integer pShowDuration) {
        mShowDuration = pShowDuration;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public Loading setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }
}