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
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */
public class PlotBand {

    private String mColor;
    private Integer mFrom;
    private Integer mId;
    private PlotLabel mPlotBandLabel;
    private Integer mTo;
    private Integer mZIndex;

    public String getColor() {
        return mColor;
    }

    public PlotBand setColor(String pColor) {
        mColor = pColor;
        return this;
    }

    public Integer getFrom() {
        return mFrom;
    }

    public PlotBand setFrom(Integer pFrom) {
        mFrom = pFrom;
        return this;
    }

    public Integer getId() {
        return mId;
    }

    public PlotBand setId(Integer pId) {
        mId = pId;
        return this;
    }

    public PlotLabel getPlotBandLabel() {
        return mPlotBandLabel;
    }

    public PlotBand setPlotBandLabel(PlotLabel pPlotBandLabel) {
        mPlotBandLabel = pPlotBandLabel;
        return this;
    }

    public Integer getTo() {
        return mTo;
    }

    public PlotBand setTo(Integer pTo) {
        mTo = pTo;
        return this;
    }

    @JsonProperty("zIndex")
    public Integer getZIndex() {
        return mZIndex;
    }

    public PlotBand setZIndex(Integer pZIndex) {
        mZIndex = pZIndex;
        return this;
    }
}
