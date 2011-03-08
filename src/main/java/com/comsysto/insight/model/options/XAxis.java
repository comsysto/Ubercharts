package com.comsysto.insight.model.options;

import java.util.List;

public class XAxis {

    private Boolean allowDecimals;// true,
    private String alternateGridColor;// null,

    List<String> categories;// [],

    // not supported
    // dateTimeLabelFormats:

    private Boolean endOnTick;// false,

    // not supported
    // events: {...},

    private String gridLineColor;// "#C0C0C0",
    private Dashstyles gridLineDashStyle;// ShortDot,
    private Integer gridLineWidth;// 0,
    private String id;// null,
    private Labels labels;// {...},
    private String lineColor;// "#C0D0E0",
    private Integer lineWidth;// 1,
    private Integer linkedTo;// null,
    private Integer max;// null,
    private Double maxPadding;// 0.01,
    private Integer maxZoom;// ,
    private Integer min;// null,
    private String minorGridLineColor;// #E0E0E0,
    private Dashstyles minorGridLineDashStyle;// Solid,
    private Integer minorGridLineWidth;// 1,
    private String minorTickColor;// #A0A0A0,
    private Integer minorTickInterval;// null,
    private Integer minorTickLength;// 2,
    private TickPosition minorTickPosition;// outside,
    private Integer minorTickWidth;// 0,
    private Double minPadding;// 0.01,
    private Integer offset;// 0,
    private Boolean opposite;// false,

    // not supported
    // plotBands: [{...}],
    // plotLines: [{...}],

    private Boolean reversed;// false,
    private Boolean showFirstLabel;// true,
    private Boolean showLastLabel;// false,
    private Integer startOfWeek;// 1,
    private Boolean startOnTick;// false,
    private String tickColor;// #C0D0E0,
    private Integer tickInterval;// null,
    private Integer tickLength;// 5,
    private String tickmarkPlacement;// "between",
    private Integer tickPixelInterval;// ,
    private TickPosition tickPosition;// "outside",
    private Integer tickWidth;// 1,
    private AxisTitle fTitle;
    private Type type;// "linear"

    public Boolean getAllowDecimals() {
        return allowDecimals;
    }

    public void setAllowDecimals(Boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
    }

    public String getAlternateGridColor() {
        return alternateGridColor;
    }

    public void setAlternateGridColor(String alternateGridColor) {
        this.alternateGridColor = alternateGridColor;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public Boolean getEndOnTick() {
        return endOnTick;
    }

    public void setEndOnTick(Boolean endOnTick) {
        this.endOnTick = endOnTick;
    }

    public String getGridLineColor() {
        return gridLineColor;
    }

    public void setGridLineColor(String gridLineColor) {
        this.gridLineColor = gridLineColor;
    }

    public Dashstyles getGridLineDashStyle() {
        return gridLineDashStyle;
    }

    public void setGridLineDashStyle(Dashstyles gridLineDashStyle) {
        this.gridLineDashStyle = gridLineDashStyle;
    }

    public Integer getGridLineWidth() {
        return gridLineWidth;
    }

    public void setGridLineWidth(Integer gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public Integer getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }

    public Integer getLinkedTo() {
        return linkedTo;
    }

    public void setLinkedTo(Integer linkedTo) {
        this.linkedTo = linkedTo;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Double getMaxPadding() {
        return maxPadding;
    }

    public void setMaxPadding(Double maxPadding) {
        this.maxPadding = maxPadding;
    }

    public Integer getMaxZoom() {
        return maxZoom;
    }

    public void setMaxZoom(Integer maxZoom) {
        this.maxZoom = maxZoom;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public String getMinorGridLineColor() {
        return minorGridLineColor;
    }

    public void setMinorGridLineColor(String minorGridLineColor) {
        this.minorGridLineColor = minorGridLineColor;
    }

    public Dashstyles getMinorGridLineDashStyle() {
        return minorGridLineDashStyle;
    }

    public void setMinorGridLineDashStyle(Dashstyles minorGridLineDashStyle) {
        this.minorGridLineDashStyle = minorGridLineDashStyle;
    }

    public Integer getMinorGridLineWidth() {
        return minorGridLineWidth;
    }

    public void setMinorGridLineWidth(Integer minorGridLineWidth) {
        this.minorGridLineWidth = minorGridLineWidth;
    }

    public String getMinorTickColor() {
        return minorTickColor;
    }

    public void setMinorTickColor(String minorTickColor) {
        this.minorTickColor = minorTickColor;
    }

    public Integer getMinorTickInterval() {
        return minorTickInterval;
    }

    public void setMinorTickInterval(Integer minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
    }

    public Integer getMinorTickLength() {
        return minorTickLength;
    }

    public void setMinorTickLength(Integer minorTickLength) {
        this.minorTickLength = minorTickLength;
    }

    public TickPosition getMinorTickPosition() {
        return minorTickPosition;
    }

    public void setMinorTickPosition(TickPosition minorTickPosition) {
        this.minorTickPosition = minorTickPosition;
    }

    public Integer getMinorTickWidth() {
        return minorTickWidth;
    }

    public void setMinorTickWidth(Integer minorTickWidth) {
        this.minorTickWidth = minorTickWidth;
    }

    public Double getMinPadding() {
        return minPadding;
    }

    public void setMinPadding(Double minPadding) {
        this.minPadding = minPadding;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Boolean getOpposite() {
        return opposite;
    }

    public void setOpposite(Boolean opposite) {
        this.opposite = opposite;
    }

    public Boolean getReversed() {
        return reversed;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
    }

    public Boolean getShowFirstLabel() {
        return showFirstLabel;
    }

    public void setShowFirstLabel(Boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
    }

    public Boolean getShowLastLabel() {
        return showLastLabel;
    }

    public void setShowLastLabel(Boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
    }

    public Integer getStartOfWeek() {
        return startOfWeek;
    }

    public void setStartOfWeek(Integer startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    public Boolean getStartOnTick() {
        return startOnTick;
    }

    public void setStartOnTick(Boolean startOnTick) {
        this.startOnTick = startOnTick;
    }

    public String getTickColor() {
        return tickColor;
    }

    public void setTickColor(String tickColor) {
        this.tickColor = tickColor;
    }

    public Integer getTickInterval() {
        return tickInterval;
    }

    public void setTickInterval(Integer tickInterval) {
        this.tickInterval = tickInterval;
    }

    public Integer getTickLength() {
        return tickLength;
    }

    public void setTickLength(Integer tickLength) {
        this.tickLength = tickLength;
    }

    public String getTickmarkPlacement() {
        return tickmarkPlacement;
    }

    public void setTickmarkPlacement(String tickmarkPlacement) {
        this.tickmarkPlacement = tickmarkPlacement;
    }

    public Integer getTickPixelInterval() {
        return tickPixelInterval;
    }

    public void setTickPixelInterval(Integer tickPixelInterval) {
        this.tickPixelInterval = tickPixelInterval;
    }

    public TickPosition getTickPosition() {
        return tickPosition;
    }

    public void setTickPosition(TickPosition tickPosition) {
        this.tickPosition = tickPosition;
    }

    public Integer getTickWidth() {
        return tickWidth;
    }

    public void setTickWidth(Integer tickWidth) {
        this.tickWidth = tickWidth;
    }

    public AxisTitle getTitle() {
        return fTitle;
    }

    public void setTitle(AxisTitle pTitle) {
        this.fTitle = pTitle;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


}

