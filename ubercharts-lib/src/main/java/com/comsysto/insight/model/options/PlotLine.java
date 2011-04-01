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

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 15/03/2011
 * Time: 19:08
 * To change this template use File | Settings | File Templates.
 */
public class PlotLine {

    private String mColor;
    private DashStyle mDashStyle;
    private Integer mId;
    private PlotLabel mPlotLabel;
    private Integer mValue;
    private Integer mWidth;
    private Integer mZIndex;

    public String getColor() {
        return mColor;
    }

    public PlotLine setColor(String pColor) {
        mColor = pColor;
        return this;
    }

    public DashStyle getDashStyle() {
        return mDashStyle;
    }

    public PlotLine setDashStyle(DashStyle pDashStyle) {
        mDashStyle = pDashStyle;
        return this;
    }

    public Integer getId() {
        return mId;
    }

    public PlotLine setId(Integer pId) {
        mId = pId;
        return this;
    }

    public PlotLabel getPlotLabel() {
        return mPlotLabel;
    }

    public PlotLine setPlotLabel(PlotLabel pPlotLabel) {
        mPlotLabel = pPlotLabel;
        return this;
    }

    public Integer getValue() {
        return mValue;
    }

    public PlotLine setValue(Integer pValue) {
        mValue = pValue;
        return this;
    }

    public Integer getWidth() {
        return mWidth;
    }

    public PlotLine setWidth(Integer pWidth) {
        mWidth = pWidth;
        return this;
    }

    @JsonProperty("zIndex")
    public Integer getZIndex() {
        return mZIndex;
    }

    public PlotLine setZIndex(Integer pZIndex) {
        mZIndex = pZIndex;
        return this;
    }
}
