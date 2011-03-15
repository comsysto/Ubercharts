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
