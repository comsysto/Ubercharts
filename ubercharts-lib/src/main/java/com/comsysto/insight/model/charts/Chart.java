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

package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.ChartType;
import com.comsysto.insight.model.options.ZoomType;

import java.io.Serializable;
import java.util.Map;

/**
 * Date: Feb 18, 2011 Time: 3:16:33 PM
 *
 * @author Mohammed El Batya
 */
public class Chart implements Serializable {

    public Chart(ChartType pType) {
        defaultSeriesType = pType;
    }

    private Boolean alignTicks;
    private Boolean animation;
    private String backgroundColor;
    private String borderColor;
    private Integer borderRadius;
    private Integer borderWidth;
    private String className;
    private ChartType defaultSeriesType;

    // events: not supported

    private Integer height;
    private Boolean ignoreHiddenSeries;
    private Boolean inverted;
    private Integer[] margin;
    private Integer marginTop;
    private Integer marginRight;
    private Integer marginBottom;
    private Integer marginLeft;
    private String plotBackgroundColor;
    private String plotBackgroundImage;
    private String plotBorderColor;
    private Integer plotBorderWidth;
    private Boolean plotShadow;
    private Boolean reflow;
    private String renderTo;
    private Boolean shadow;
    private Boolean showAxes;
    private Integer spacingTop;
    private Integer spacingRight;
    private Integer spacingBottom;
    private Integer spacingLeft;
    private Map<String, String> style;

    /** use {@link #defaultSeriesType} instead */
    @Deprecated
    private String type;
    private Integer width;
    private ZoomType zoomType;


    public Boolean getAlignTicks() {
        return alignTicks;
    }

    public Chart setAlignTicks(Boolean pAlignTicks) {
        alignTicks = pAlignTicks;
        return this;
    }

    public Boolean getAnimation() {
        return animation;
    }

    public Chart setAnimation(Boolean pAnimation) {
        animation = pAnimation;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public Chart setBackgroundColor(String pBackgroundColor) {
        backgroundColor = pBackgroundColor;
        return this;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public Chart setBorderColor(String pBorderColor) {
        borderColor = pBorderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return borderRadius;
    }

    public Chart setBorderRadius(Integer pBorderRadius) {
        borderRadius = pBorderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public Chart setBorderWidth(Integer pBorderWidth) {
        borderWidth = pBorderWidth;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public Chart setClassName(String pClassName) {
        className = pClassName;
        return this;
    }

    public ChartType getDefaultSeriesType() {
        return defaultSeriesType;
    }

    public Chart setDefaultSeriesType(ChartType pDefaultSeriesType) {
        defaultSeriesType = pDefaultSeriesType;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Chart setHeight(Integer pHeight) {
        height = pHeight;
        return this;
    }

    public Boolean getIgnoreHiddenSeries() {
        return ignoreHiddenSeries;
    }

    public Chart setIgnoreHiddenSeries(Boolean pIgnoreHiddenSeries) {
        ignoreHiddenSeries = pIgnoreHiddenSeries;
        return this;
    }

    public Boolean getInverted() {
        return inverted;
    }

    public Chart setInverted(Boolean pInverted) {
        inverted = pInverted;
        return this;
    }

    public Integer[] getMargin() {
        return margin;
    }

    public Chart setMargin(Integer[] pMargin) {
        margin = pMargin;
        return this;
    }

    public Integer getMarginTop() {
        return marginTop;
    }

    public Chart setMarginTop(Integer pMarginTop) {
        marginTop = pMarginTop;
        return this;
    }

    public Integer getMarginRight() {
        return marginRight;
    }

    public Chart setMarginRight(Integer pMarginRight) {
        marginRight = pMarginRight;
        return this;
    }

    public Integer getMarginBottom() {
        return marginBottom;
    }

    public Chart setMarginBottom(Integer pMarginBottom) {
        marginBottom = pMarginBottom;
        return this;
    }

    public Integer getMarginLeft() {
        return marginLeft;
    }

    public Chart setMarginLeft(Integer pMarginLeft) {
        marginLeft = pMarginLeft;
        return this;
    }

    public String getPlotBackgroundColor() {
        return plotBackgroundColor;
    }

    public Chart setPlotBackgroundColor(String pPlotBackgroundColor) {
        plotBackgroundColor = pPlotBackgroundColor;
        return this;
    }

    public String getPlotBackgroundImage() {
        return plotBackgroundImage;
    }

    public Chart setPlotBackgroundImage(String pPlotBackgroundImage) {
        plotBackgroundImage = pPlotBackgroundImage;
        return this;
    }

    public String getPlotBorderColor() {
        return plotBorderColor;
    }

    public Chart setPlotBorderColor(String pPlotBorderColor) {
        plotBorderColor = pPlotBorderColor;
        return this;
    }

    public Integer getPlotBorderWidth() {
        return plotBorderWidth;
    }

    public Chart setPlotBorderWidth(Integer pPlotBorderWidth) {
        plotBorderWidth = pPlotBorderWidth;
        return this;
    }

    public Boolean getPlotShadow() {
        return plotShadow;
    }

    public Chart setPlotShadow(Boolean pPlotShadow) {
        plotShadow = pPlotShadow;
        return this;
    }

    public Boolean getReflow() {
        return reflow;
    }

    public Chart setReflow(Boolean pReflow) {
        reflow = pReflow;
        return this;
    }

    public String getRenderTo() {
        return renderTo;
    }

    public Chart setRenderTo(String pRenderTo) {
        renderTo = pRenderTo;
        return this;
    }

    public Boolean getShadow() {
        return shadow;
    }

    public Chart setShadow(Boolean pShadow) {
        shadow = pShadow;
        return this;
    }

    public Boolean getShowAxes() {
        return showAxes;
    }

    public Chart setShowAxes(Boolean pShowAxes) {
        showAxes = pShowAxes;
        return this;
    }

    public Integer getSpacingTop() {
        return spacingTop;
    }

    public Chart setSpacingTop(Integer pSpacingTop) {
        spacingTop = pSpacingTop;
        return this;
    }

    public Integer getSpacingRight() {
        return spacingRight;
    }

    public Chart setSpacingRight(Integer pSpacingRight) {
        spacingRight = pSpacingRight;
        return this;
    }

    public Integer getSpacingBottom() {
        return spacingBottom;
    }

    public Chart setSpacingBottom(Integer pSpacingBottom) {
        spacingBottom = pSpacingBottom;
        return this;
    }

    public Integer getSpacingLeft() {
        return spacingLeft;
    }

    public Chart setSpacingLeft(Integer pSpacingLeft) {
        spacingLeft = pSpacingLeft;
        return this;
    }

    public Map<String, String> getStyle() {
        return style;
    }

    public Chart setStyle(Map<String, String> pStyle) {
        style = pStyle;
        return this;
    }

    /** use {@link #getDefaultSeriesType()} instead */
    @Deprecated
    public String getType() {
        return type;
    }

    /** use {@link #setDefaultSeriesType(com.comsysto.insight.model.options.ChartType)} instead */
    @Deprecated
    public Chart setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Chart setWidth(Integer pWidth) {
        width = pWidth;
        return this;
    }

    public ZoomType getZoomType() {
        return zoomType;
    }

    public Chart setZoomType(ZoomType pZoomType) {
        zoomType = pZoomType;
        return this;
    }

}
