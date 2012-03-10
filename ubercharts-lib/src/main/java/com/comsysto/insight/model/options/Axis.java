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

public class Axis implements Serializable {

    private Boolean mAllowDecimals;
    private String mAlternateGridColor;
    private String[] mCategories;
    private Boolean mEndOnTick;
    private String mGridLineColor;
    private DashStyle mGridLineDashStyle;
    private Integer mGridLineWidth;
    private String mId;
    private AxisLabels mLabels;
    private String mLineColor;
    private Integer mLineWidth;
    private Integer mLinkedTo;
    private Integer mMax;
    private Double mMaxPadding;
    private Integer mMaxZoom;
    private Integer mMin;
    private String mMinorGridLineColor;
    private DashStyle mMinorGridLineDashStyle;
    private Integer mMinorGridLineWidth;
    private String mMinorTickColor;
    private Integer mMinorTickInterval;
    private Integer mMinorTickLength;
    private TickPosition mMinorTickPosition;
    private Integer mMinorTickWidth;
    private Double mMinPadding;
    private Integer mOffset;
    private Boolean mOpposite;
    private PlotBand[] mPlotBands;
    private PlotLine[] mPlotLines;
    private Boolean mReversed;
    private Boolean mShowFirstLabel;
    private Boolean mShowLastLabel;
    private Integer mStartOfWeek;
    private Boolean mStartOnTick;
    private String mTickColor;
    private Integer mTickInterval;
    private Integer mTickLength;
    private TickmarkPlacement mTickmarkPlacement;
    private Integer mTickPixelInterval;
    private TickPosition mTickPosition;
    private Integer mTickWidth;
    private AxisTitle mTitle;
    private AxisType mType;


    public Boolean getAllowDecimals() {
        return mAllowDecimals;
    }

    public Axis setAllowDecimals(Boolean pAllowDecimals) {
        mAllowDecimals = pAllowDecimals;
        return this;
    }

    public String getAlternateGridColor() {
        return mAlternateGridColor;
    }

    public Axis setAlternateGridColor(String pAlternateGridColor) {
        mAlternateGridColor = pAlternateGridColor;
        return this;
    }

    public String[] getCategories() {
        return mCategories;
    }

    public Axis setCategories(String[] pCategories) {
        mCategories = pCategories;
        return this;
    }

    public Boolean getEndOnTick() {
        return mEndOnTick;
    }

    public Axis setEndOnTick(Boolean pEndOnTick) {
        mEndOnTick = pEndOnTick;
        return this;
    }

    public String getGridLineColor() {
        return mGridLineColor;
    }

    public Axis setGridLineColor(String pGridLineColor) {
        mGridLineColor = pGridLineColor;
        return this;
    }

    public DashStyle getGridLineDashStyle() {
        return mGridLineDashStyle;
    }

    public Axis setGridLineDashStyle(DashStyle pGridLineDashStyle) {
        mGridLineDashStyle = pGridLineDashStyle;
        return this;
    }

    public Integer getGridLineWidth() {
        return mGridLineWidth;
    }

    public Axis setGridLineWidth(Integer pGridLineWidth) {
        mGridLineWidth = pGridLineWidth;
        return this;
    }

    public String getId() {
        return mId;
    }

    public Axis setId(String pId) {
        mId = pId;
        return this;
    }

    public AxisLabels getLabels() {
        return mLabels;
    }

    public Axis setLabels(AxisLabels pLabels) {
        mLabels = pLabels;
        return this;
    }

    public String getLineColor() {
        return mLineColor;
    }

    public Axis setLineColor(String pLineColor) {
        mLineColor = pLineColor;
        return this;
    }

    public Integer getLineWidth() {
        return mLineWidth;
    }

    public Axis setLineWidth(Integer pLineWidth) {
        mLineWidth = pLineWidth;
        return this;
    }

    public Integer getLinkedTo() {
        return mLinkedTo;
    }

    public Axis setLinkedTo(Integer pLinkedTo) {
        mLinkedTo = pLinkedTo;
        return this;
    }

    public Integer getMax() {
        return mMax;
    }

    public Axis setMax(Integer pMax) {
        mMax = pMax;
        return this;
    }

    public Double getMaxPadding() {
        return mMaxPadding;
    }

    public Axis setMaxPadding(Double pMaxPadding) {
        mMaxPadding = pMaxPadding;
        return this;
    }

    public Integer getMaxZoom() {
        return mMaxZoom;
    }

    public Axis setMaxZoom(Integer pMaxZoom) {
        mMaxZoom = pMaxZoom;
        return this;
    }

    public Integer getMin() {
        return mMin;
    }

    public Axis setMin(Integer pMin) {
        mMin = pMin;
        return this;
    }

    public String getMinorGridLineColor() {
        return mMinorGridLineColor;
    }

    public Axis setMinorGridLineColor(String pMinorGridLineColor) {
        mMinorGridLineColor = pMinorGridLineColor;
        return this;
    }

    public DashStyle getMinorGridLineDashStyle() {
        return mMinorGridLineDashStyle;
    }

    public Axis setMinorGridLineDashStyle(DashStyle pMinorGridLineDashStyle) {
        mMinorGridLineDashStyle = pMinorGridLineDashStyle;
        return this;
    }

    public Integer getMinorGridLineWidth() {
        return mMinorGridLineWidth;
    }

    public Axis setMinorGridLineWidth(Integer pMinorGridLineWidth) {
        mMinorGridLineWidth = pMinorGridLineWidth;
        return this;
    }

    public String getMinorTickColor() {
        return mMinorTickColor;
    }

    public Axis setMinorTickColor(String pMinorTickColor) {
        mMinorTickColor = pMinorTickColor;
        return this;
    }

    public Integer getMinorTickInterval() {
        return mMinorTickInterval;
    }

    public Axis setMinorTickInterval(Integer pMinorTickInterval) {
        mMinorTickInterval = pMinorTickInterval;
        return this;
    }

    public Integer getMinorTickLength() {
        return mMinorTickLength;
    }

    public Axis setMinorTickLength(Integer pMinorTickLength) {
        mMinorTickLength = pMinorTickLength;
        return this;
    }

    public TickPosition getMinorTickPosition() {
        return mMinorTickPosition;
    }

    public Axis setMinorTickPosition(TickPosition pMinorTickPosition) {
        mMinorTickPosition = pMinorTickPosition;
        return this;
    }

    public Integer getMinorTickWidth() {
        return mMinorTickWidth;
    }

    public Axis setMinorTickWidth(Integer pMinorTickWidth) {
        mMinorTickWidth = pMinorTickWidth;
        return this;
    }

    public Double getMinPadding() {
        return mMinPadding;
    }

    public Axis setMinPadding(Double pMinPadding) {
        mMinPadding = pMinPadding;
        return this;
    }

    public Integer getOffset() {
        return mOffset;
    }

    public Axis setOffset(Integer pOffset) {
        mOffset = pOffset;
        return this;
    }

    public Boolean getOpposite() {
        return mOpposite;
    }

    public Axis setOpposite(Boolean pOpposite) {
        mOpposite = pOpposite;
        return this;
    }

    public PlotBand[] getPlotBands() {
        return mPlotBands;
    }

    public Axis setPlotBands(PlotBand[] pPlotBands) {
        mPlotBands = pPlotBands;
        return this;
    }

    public PlotLine[] getPlotLines() {
        return mPlotLines;
    }

    public Axis setPlotLines(PlotLine[] pPlotLines) {
        mPlotLines = pPlotLines;
        return this;
    }

    public Boolean getReversed() {
        return mReversed;
    }

    public Axis setReversed(Boolean pReversed) {
        mReversed = pReversed;
        return this;
    }

    public Boolean getShowFirstLabel() {
        return mShowFirstLabel;
    }

    public Axis setShowFirstLabel(Boolean pShowFirstLabel) {
        mShowFirstLabel = pShowFirstLabel;
        return this;
    }

    public Boolean getShowLastLabel() {
        return mShowLastLabel;
    }

    public Axis setShowLastLabel(Boolean pShowLastLabel) {
        mShowLastLabel = pShowLastLabel;
        return this;
    }

    public Integer getStartOfWeek() {
        return mStartOfWeek;
    }

    public Axis setStartOfWeek(Integer pStartOfWeek) {
        mStartOfWeek = pStartOfWeek;
        return this;
    }

    public Boolean getStartOnTick() {
        return mStartOnTick;
    }

    public Axis setStartOnTick(Boolean pStartOnTick) {
        mStartOnTick = pStartOnTick;
        return this;
    }

    public String getTickColor() {
        return mTickColor;
    }

    public Axis setTickColor(String pTickColor) {
        mTickColor = pTickColor;
        return this;
    }

    public Integer getTickInterval() {
        return mTickInterval;
    }

    public Axis setTickInterval(Integer pTickInterval) {
        mTickInterval = pTickInterval;
        return this;
    }

    public Integer getTickLength() {
        return mTickLength;
    }

    public Axis setTickLength(Integer pTickLength) {
        mTickLength = pTickLength;
        return this;
    }

    public TickmarkPlacement getTickmarkPlacement() {
        return mTickmarkPlacement;
    }

    public Axis setTickmarkPlacement(TickmarkPlacement pTickmarkPlacement) {
        mTickmarkPlacement = pTickmarkPlacement;
        return this;
    }

    public Integer getTickPixelInterval() {
        return mTickPixelInterval;
    }

    public Axis setTickPixelInterval(Integer pTickPixelInterval) {
        mTickPixelInterval = pTickPixelInterval;
        return this;
    }

    public TickPosition getTickPosition() {
        return mTickPosition;
    }

    public Axis setTickPosition(TickPosition pTickPosition) {
        mTickPosition = pTickPosition;
        return this;
    }

    public Integer getTickWidth() {
        return mTickWidth;
    }

    public Axis setTickWidth(Integer pTickWidth) {
        mTickWidth = pTickWidth;
        return this;
    }

    public AxisTitle getTitle() {
        return mTitle;
    }

    public Axis setTitle(AxisTitle pTitle) {
        mTitle = pTitle;
        return this;
    }

    public AxisType getType() {
        return mType;
    }

    public Axis setType(AxisType pType) {
        mType = pType;
        return this;
    }
}

