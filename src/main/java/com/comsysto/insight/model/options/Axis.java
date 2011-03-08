package com.comsysto.insight.model.options;

import java.util.List;

public class Axis {

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

    public Axis setAllowDecimals(Boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
        return this;
    }

    public String getAlternateGridColor() {
        return alternateGridColor;
    }

    public Axis setAlternateGridColor(String alternateGridColor) {
        this.alternateGridColor = alternateGridColor;
        return this;
    }

    public List<String> getCategories() {
        return categories;
    }

    public Axis setCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public Boolean getEndOnTick() {
        return endOnTick;
    }

    public Axis setEndOnTick(Boolean endOnTick) {
        this.endOnTick = endOnTick;
        return this;
    }

    public String getGridLineColor() {
        return gridLineColor;
    }

    public Axis setGridLineColor(String gridLineColor) {
        this.gridLineColor = gridLineColor;
        return this;
    }

    public Dashstyles getGridLineDashStyle() {
        return gridLineDashStyle;
    }

    public Axis setGridLineDashStyle(Dashstyles gridLineDashStyle) {
        this.gridLineDashStyle = gridLineDashStyle;
        return this;
    }

    public Integer getGridLineWidth() {
        return gridLineWidth;
    }

    public Axis setGridLineWidth(Integer gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
        return this;
    }

    public String getId() {
        return id;
    }

    public Axis setId(String id) {
        this.id = id;
        return this;
    }

    public Labels getLabels() {
        return labels;
    }

    public Axis setLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public String getLineColor() {
        return lineColor;
    }

    public Axis setLineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Integer getLineWidth() {
        return lineWidth;
    }

    public Axis setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public Integer getLinkedTo() {
        return linkedTo;
    }

    public Axis setLinkedTo(Integer linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Integer getMax() {
        return max;
    }

    public Axis setMax(Integer max) {
        this.max = max;
        return this;
    }

    public Double getMaxPadding() {
        return maxPadding;
    }

    public Axis setMaxPadding(Double maxPadding) {
        this.maxPadding = maxPadding;
        return this;
    }

    public Integer getMaxZoom() {
        return maxZoom;
    }

    public Axis setMaxZoom(Integer maxZoom) {
        this.maxZoom = maxZoom;
        return this;
    }

    public Integer getMin() {
        return min;
    }

    public Axis setMin(Integer min) {
        this.min = min;
        return this;
    }

    public String getMinorGridLineColor() {
        return minorGridLineColor;
    }

    public Axis setMinorGridLineColor(String minorGridLineColor) {
        this.minorGridLineColor = minorGridLineColor;
        return this;
    }

    public Dashstyles getMinorGridLineDashStyle() {
        return minorGridLineDashStyle;
    }

    public Axis setMinorGridLineDashStyle(Dashstyles minorGridLineDashStyle) {
        this.minorGridLineDashStyle = minorGridLineDashStyle;
        return this;
    }

    public Integer getMinorGridLineWidth() {
        return minorGridLineWidth;
    }

    public Axis setMinorGridLineWidth(Integer minorGridLineWidth) {
        this.minorGridLineWidth = minorGridLineWidth;
        return this;
    }

    public String getMinorTickColor() {
        return minorTickColor;
    }

    public Axis setMinorTickColor(String minorTickColor) {
        this.minorTickColor = minorTickColor;
        return this;
    }

    public Integer getMinorTickInterval() {
        return minorTickInterval;
    }

    public Axis setMinorTickInterval(Integer minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
        return this;
    }

    public Integer getMinorTickLength() {
        return minorTickLength;
    }

    public Axis setMinorTickLength(Integer minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    public TickPosition getMinorTickPosition() {
        return minorTickPosition;
    }

    public Axis setMinorTickPosition(TickPosition minorTickPosition) {
        this.minorTickPosition = minorTickPosition;
        return this;
    }

    public Integer getMinorTickWidth() {
        return minorTickWidth;
    }

    public Axis setMinorTickWidth(Integer minorTickWidth) {
        this.minorTickWidth = minorTickWidth;
        return this;
    }

    public Double getMinPadding() {
        return minPadding;
    }

    public Axis setMinPadding(Double minPadding) {
        this.minPadding = minPadding;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public Axis setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Boolean getOpposite() {
        return opposite;
    }

    public Axis setOpposite(Boolean opposite) {
        this.opposite = opposite;
        return this;
    }

    public Boolean getReversed() {
        return reversed;
    }

    public Axis setReversed(Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public Boolean getShowFirstLabel() {
        return showFirstLabel;
    }

    public Axis setShowFirstLabel(Boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public Boolean getShowLastLabel() {
        return showLastLabel;
    }

    public Axis setShowLastLabel(Boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    public Integer getStartOfWeek() {
        return startOfWeek;
    }

    public Axis setStartOfWeek(Integer startOfWeek) {
        this.startOfWeek = startOfWeek;
        return this;
    }

    public Boolean getStartOnTick() {
        return startOnTick;
    }

    public Axis setStartOnTick(Boolean startOnTick) {
        this.startOnTick = startOnTick;
        return this;
    }

    public String getTickColor() {
        return tickColor;
    }

    public Axis setTickColor(String tickColor) {
        this.tickColor = tickColor;
        return this;
    }

    public Integer getTickInterval() {
        return tickInterval;
    }

    public Axis setTickInterval(Integer tickInterval) {
        this.tickInterval = tickInterval;
        return this;
    }

    public Integer getTickLength() {
        return tickLength;
    }

    public Axis setTickLength(Integer tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public String getTickmarkPlacement() {
        return tickmarkPlacement;
    }

    public Axis setTickmarkPlacement(String tickmarkPlacement) {
        this.tickmarkPlacement = tickmarkPlacement;
        return this;
    }

    public Integer getTickPixelInterval() {
        return tickPixelInterval;
    }

    public Axis setTickPixelInterval(Integer tickPixelInterval) {
        this.tickPixelInterval = tickPixelInterval;
        return this;
    }

    public TickPosition getTickPosition() {
        return tickPosition;
    }

    public Axis setTickPosition(TickPosition tickPosition) {
        this.tickPosition = tickPosition;
        return this;
    }

    public Integer getTickWidth() {
        return tickWidth;
    }

    public Axis setTickWidth(Integer tickWidth) {
        this.tickWidth = tickWidth;
        return this;
    }

    public AxisTitle getTitle() {
        return fTitle;
    }

    public Axis setTitle(AxisTitle pTitle) {
        this.fTitle = pTitle;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Axis setType(Type type) {
        this.type = type;
        return this;
    }


}

