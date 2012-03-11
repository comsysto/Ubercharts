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

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 18/03/2011
 * Time: 14:04
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class ButtonOptions implements Serializable {

    private Align mAlign;
    private String mBackgroundColor;
    private String mBorderColor;
    private Integer mBorderRadius;
    private Integer mBorderWidth;
    private Boolean mEnabled;
    private Integer mHeight;
    private String mHoverBorderColor;
    private String mHoverSymbolFill;
    private String mHoverSymbolStroke;
    private String mSymbolFill;
    private Integer mSymbolSize;
    private String mSymbolStroke;
    private Integer mSymbolStrokeWidth;
    private Integer mSymbolX;
    private Integer mSymbolY;
    private VerticalAlign mVerticalAlign;
    private Integer mWidth;
    private Integer mY;

    public Align getAlign() {
        return mAlign;
    }

    public ButtonOptions setAlign(Align pAlign) {
        mAlign = pAlign;
        return this;
    }

    public String getBackgroundColor() {
        return mBackgroundColor;
    }

    public ButtonOptions setBackgroundColor(String pBackgroundColor) {
        mBackgroundColor = pBackgroundColor;
        return this;
    }

    public String getBorderColor() {
        return mBorderColor;
    }

    public ButtonOptions setBorderColor(String pBorderColor) {
        mBorderColor = pBorderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return mBorderRadius;
    }

    public ButtonOptions setBorderRadius(Integer pBorderRadius) {
        mBorderRadius = pBorderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return mBorderWidth;
    }

    public ButtonOptions setBorderWidth(Integer pBorderWidth) {
        mBorderWidth = pBorderWidth;
        return this;
    }

    public Boolean getEnabled() {
        return mEnabled;
    }

    public ButtonOptions setEnabled(Boolean pEnabled) {
        mEnabled = pEnabled;
        return this;
    }

    public Integer getHeight() {
        return mHeight;
    }

    public ButtonOptions setHeight(Integer pHeight) {
        mHeight = pHeight;
        return this;
    }

    public String getHoverBorderColor() {
        return mHoverBorderColor;
    }

    public ButtonOptions setHoverBorderColor(String pHoverBorderColor) {
        mHoverBorderColor = pHoverBorderColor;
        return this;
    }

    public String getHoverSymbolFill() {
        return mHoverSymbolFill;
    }

    public ButtonOptions setHoverSymbolFill(String pHoverSymbolFill) {
        mHoverSymbolFill = pHoverSymbolFill;
        return this;
    }

    public String getHoverSymbolStroke() {
        return mHoverSymbolStroke;
    }

    public ButtonOptions setHoverSymbolStroke(String pHoverSymbolStroke) {
        mHoverSymbolStroke = pHoverSymbolStroke;
        return this;
    }

    public String getSymbolFill() {
        return mSymbolFill;
    }

    public ButtonOptions setSymbolFill(String pSymbolFill) {
        mSymbolFill = pSymbolFill;
        return this;
    }

    public Integer getSymbolSize() {
        return mSymbolSize;
    }

    public ButtonOptions setSymbolSize(Integer pSymbolSize) {
        mSymbolSize = pSymbolSize;
        return this;
    }

    public String getSymbolStroke() {
        return mSymbolStroke;
    }

    public ButtonOptions setSymbolStroke(String pSymbolStroke) {
        mSymbolStroke = pSymbolStroke;
        return this;
    }

    public Integer getSymbolStrokeWidth() {
        return mSymbolStrokeWidth;
    }

    public ButtonOptions setSymbolStrokeWidth(Integer pSymbolStrokeWidth) {
        mSymbolStrokeWidth = pSymbolStrokeWidth;
        return this;
    }

    public Integer getSymbolX() {
        return mSymbolX;
    }

    public ButtonOptions setSymbolX(Integer pSymbolX) {
        mSymbolX = pSymbolX;
        return this;
    }

    public Integer getSymbolY() {
        return mSymbolY;
    }

    public ButtonOptions setSymbolY(Integer pSymbolY) {
        mSymbolY = pSymbolY;
        return this;
    }

    public VerticalAlign getVerticalAlign() {
        return mVerticalAlign;
    }

    public ButtonOptions setVerticalAlign(VerticalAlign pVerticalAlign) {
        mVerticalAlign = pVerticalAlign;
        return this;
    }

    public Integer getWidth() {
        return mWidth;
    }

    public ButtonOptions setWidth(Integer pWidth) {
        mWidth = pWidth;
        return this;
    }

    public Integer getY() {
        return mY;
    }

    public ButtonOptions setY(Integer pY) {
        mY = pY;
        return this;
    }
}
