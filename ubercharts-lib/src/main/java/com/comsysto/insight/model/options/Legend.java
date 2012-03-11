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
public class Legend implements Serializable {

    private Align mAlign;
    private String mBackgroundColor;
    private String mBorderColor;
    private Integer mBorderRadius;
    private Integer mBorderWidth;
    private Boolean mEnabled;
    private Boolean mFloating;
    private Map<String, String> mItemHiddenStyle;
    private Map<String, String> mItemHoverStyle;
    private Map<String, String> mItemStyle;
    private Integer mItemWidth;
    private Layout mLayout;
    private Integer mLineHeight;
    private Integer mMargin;
    private Boolean mReversed;
    private Boolean mShadow;
    private Map<String, String> mStyle;
    private Integer mSymbolPadding;
    private Integer mSymbolWidth;
    private VerticalAlign mVerticalAlign;
    private Integer mWidth;
    private Integer mX;
    private Integer mY;

    public Align getAlign() {
        return mAlign;
    }

    public Legend setAlign(Align pAlign) {
        mAlign = pAlign;
        return this;
    }

    public String getBackgroundColor() {
        return mBackgroundColor;
    }

    public Legend setBackgroundColor(String pBackgroundColor) {
        mBackgroundColor = pBackgroundColor;
        return this;
    }

    public String getBorderColor() {
        return mBorderColor;
    }

    public Legend setBorderColor(String pBorderColor) {
        mBorderColor = pBorderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return mBorderRadius;
    }

    public Legend setBorderRadius(Integer pBorderRadius) {
        mBorderRadius = pBorderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return mBorderWidth;
    }

    public Legend setBorderWidth(Integer pBorderWidth) {
        mBorderWidth = pBorderWidth;
        return this;
    }

    public Boolean getEnabled() {
        return mEnabled;
    }

    public Legend setEnabled(Boolean pEnabled) {
        mEnabled = pEnabled;
        return this;
    }

    public Boolean getFloating() {
        return mFloating;
    }

    public Legend setFloating(Boolean pFloating) {
        mFloating = pFloating;
        return this;
    }

    public Map<String, String> getItemHiddenStyle() {
        return mItemHiddenStyle;
    }

    public Legend setItemHiddenStyle(Map<String, String> pItemHiddenStyle) {
        mItemHiddenStyle = pItemHiddenStyle;
        return this;
    }

    public Map<String, String> getItemHoverStyle() {
        return mItemHoverStyle;
    }

    public Legend setItemHoverStyle(Map<String, String> pItemHoverStyle) {
        mItemHoverStyle = pItemHoverStyle;
        return this;
    }

    public Map<String, String> getItemStyle() {
        return mItemStyle;
    }

    public Legend setItemStyle(Map<String, String> pItemStyle) {
        mItemStyle = pItemStyle;
        return this;
    }

    public Integer getItemWidth() {
        return mItemWidth;
    }

    public Legend setItemWidth(Integer pItemWidth) {
        mItemWidth = pItemWidth;
        return this;
    }

    public Layout getLayout() {
        return mLayout;
    }

    public Legend setLayout(Layout pLayout) {
        mLayout = pLayout;
        return this;
    }

    public Integer getLineHeight() {
        return mLineHeight;
    }

    public Legend setLineHeight(Integer pLineHeight) {
        mLineHeight = pLineHeight;
        return this;
    }

    public Integer getMargin() {
        return mMargin;
    }

    public Legend setMargin(Integer pMargin) {
        mMargin = pMargin;
        return this;
    }

    public Boolean getReversed() {
        return mReversed;
    }

    public Legend setReversed(Boolean pReversed) {
        mReversed = pReversed;
        return this;
    }

    public Boolean getShadow() {
        return mShadow;
    }

    public Legend setShadow(Boolean pShadow) {
        mShadow = pShadow;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public Legend setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }

    public Integer getSymbolPadding() {
        return mSymbolPadding;
    }

    public Legend setSymbolPadding(Integer pSymbolPadding) {
        mSymbolPadding = pSymbolPadding;
        return this;
    }

    public Integer getSymbolWidth() {
        return mSymbolWidth;
    }

    public Legend setSymbolWidth(Integer pSymbolWidth) {
        mSymbolWidth = pSymbolWidth;
        return this;
    }

    public VerticalAlign getVerticalAlign() {
        return mVerticalAlign;
    }

    public Legend setVerticalAlign(VerticalAlign pVerticalAlign) {
        mVerticalAlign = pVerticalAlign;
        return this;
    }

    public Integer getWidth() {
        return mWidth;
    }

    public Legend setWidth(Integer pWidth) {
        mWidth = pWidth;
        return this;
    }

    public Integer getX() {
        return mX;
    }

    public Legend setX(Integer pX) {
        mX = pX;
        return this;
    }

    public Integer getY() {
        return mY;
    }

    public Legend setY(Integer pY) {
        mY = pY;
        return this;
    }
}