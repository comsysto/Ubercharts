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
public class Tooltip implements Serializable {

    private String mBackgroundColor;
    private String mBorderColor;
    private Integer mBorderRadius;
    private Integer mBorderWidth;
    private boolean[] mCrosshairs;
    private Boolean mEnabled;
    private Boolean mShadow;
    private Boolean mShared;
    private Integer mSnap;
    private Map<String, String> mStyle;

    public String getBackgroundColor() {
        return mBackgroundColor;
    }

    public Tooltip setBackgroundColor(String pBackgroundColor) {
        mBackgroundColor = pBackgroundColor;
        return this;
    }

    public String getBorderColor() {
        return mBorderColor;
    }

    public Tooltip setBorderColor(String pBorderColor) {
        mBorderColor = pBorderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return mBorderRadius;
    }

    public Tooltip setBorderRadius(Integer pBorderRadius) {
        mBorderRadius = pBorderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return mBorderWidth;
    }

    public Tooltip setBorderWidth(Integer pBorderWidth) {
        mBorderWidth = pBorderWidth;
        return this;
    }

    public boolean[] getCrosshairs() {
        return mCrosshairs;
    }

    public Tooltip setCrosshairs(boolean[] pCrosshairs) {
        mCrosshairs = pCrosshairs;
        return this;
    }

    public Tooltip setCrosshairs(boolean pXCrosshair, boolean pYCrosshair) {
        boolean[] crosshairs = new boolean[2];
        crosshairs[0] = pXCrosshair;
        crosshairs[1] = pYCrosshair;
        return setCrosshairs(crosshairs);
    }

    public Tooltip setCrosshairs(boolean pCrosshairs) {
        return setCrosshairs(pCrosshairs, pCrosshairs);
    }

    public Boolean getEnabled() {
        return mEnabled;
    }

    public Tooltip setEnabled(Boolean pEnabled) {
        mEnabled = pEnabled;
        return this;
    }

    public Boolean getShadow() {
        return mShadow;
    }

    public Tooltip setShadow(Boolean pShadow) {
        mShadow = pShadow;
        return this;
    }

    public Boolean getShared() {
        return mShared;
    }

    public Tooltip setShared(Boolean pShared) {
        mShared = pShared;
        return this;
    }

    public Integer getSnap() {
        return mSnap;
    }

    public Tooltip setSnap(Integer pSnap) {
        mSnap = pSnap;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public Tooltip setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }
}