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

/**
 * Date: Feb 18, 2011 Time: 9:44:10 PM
 *
 * @author Mohammed El Batya
 */
public class Point {

    private String mColor;
    private String mId;
    private Marker mMarker;
    private String mName;
    private Boolean mSliced;
    private Number mX;
    private Number mY;

    public Point(Number pX, Number pY) {
        mX = pX;
        mY = pY;
    }

    public String getColor() {
        return mColor;
    }

    public Point setColor(String pColor) {
        mColor = pColor;
        return this;
    }

    public String getId() {
        return mId;
    }

    public Point setId(String pId) {
        mId = pId;
        return this;
    }

    public Marker getMarker() {
        return mMarker;
    }

    public Point setMarker(Marker pMarker) {
        mMarker = pMarker;
        return this;
    }

    public String getName() {
        return mName;
    }

    public Point setName(String pName) {
        mName = pName;
        return this;
    }

    public Boolean isSliced() {
        return mSliced;
    }

    public Point setSliced(Boolean pSliced) {
        mSliced = pSliced;
        return this;
    }

    public Number getX() {
        return mX;
    }

    public Point setX(Number pX) {
        mX = pX;
        return this;
    }

    public Number getY() {
        return mY;
    }

    public Point setY(Number pY) {
        mY = pY;
        return this;
    }
}
