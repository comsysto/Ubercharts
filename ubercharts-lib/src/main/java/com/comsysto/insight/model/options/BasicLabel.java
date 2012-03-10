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
 * Date: 15/03/2011
 * Time: 18:58
 * To change this template use File | Settings | File Templates.
 */
class BasicLabel implements Serializable {
    private Align mAlign;
    private Integer mRotation;
    private Map<String, String> mStyle;
    private Integer mX;
    private Integer mY;

    public Align getAlign() {
        return mAlign;
    }

    public BasicLabel setAlign(Align pAlign) {
        mAlign = pAlign;
        return this;
    }


    public Integer getRotation() {
        return mRotation;
    }

    public BasicLabel setRotation(Integer pRotation) {
        mRotation = pRotation;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public BasicLabel setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }

    public Integer getX() {
        return mX;
    }

    public BasicLabel setX(Integer pX) {
        mX = pX;
        return this;
    }

    public Integer getY() {
        return mY;
    }

    public BasicLabel setY(Integer pY) {
        mY = pY;
        return this;
    }
}
