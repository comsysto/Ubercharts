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

public class Subtitle extends BasicTitle {

    private Boolean mFloating;
    private VerticalAlign mVerticalAlign;
    private Integer mX;
    private Integer mY;


    public Subtitle(String pText) {
        super(pText);
    }

    public Subtitle(String pText, Align pAlign, Map<String, String> pStyle) {
        super(pText, pAlign, pStyle);
    }

    public Boolean getFloating() {
        return mFloating;
    }

    public Subtitle setFloating(Boolean pFloating) {
        mFloating = pFloating;
        return this;
    }


    public VerticalAlign getVerticalAlign() {
        return mVerticalAlign;
    }

    public Subtitle setVerticalAlign(VerticalAlign pVerticalAlign) {
        mVerticalAlign = pVerticalAlign;
        return this;
    }

    public Integer getX() {
        return mX;
    }

    public Subtitle setX(Integer pX) {
        mX = pX;
        return this;
    }

    public Integer getY() {
        return mY;
    }

    public Subtitle setY(Integer pY) {
        mY = pY;
        return this;
    }
}
