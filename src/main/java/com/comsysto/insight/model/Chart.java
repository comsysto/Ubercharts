package com.comsysto.insight.model;

import java.util.List;
import java.util.Map;

public class Chart {
	private Boolean alignTicks;// = Boolean.TRUE;
	private Boolean animation;// = Boolean.TRUE;
	private String backgroundColor; //"#FFFFFF";
	private String borderColor; //"#4572A7";
	private Integer borderRadius = 5;
	private Integer borderWidth = 0;
	private String className = "";
	private String defaultSeriesType;
	
	// NOT SUPPORTED
	//events: {...
		// addSeries: ,
		//click: ,
		//load: ,
		//redraw: ,
		//selection:
	//},

	private Integer height;
	private Boolean ignoreHiddenSeries; //: true,
	private Boolean inverted; //: false,
	private List<Integer> margin; //: [null],
	private Integer marginTop; //: null,
	private Integer marginRight; //: 50,
	private Integer marginBottom; //: 70,
	private Integer marginLeft; //: 80,
	private String plotBackgroundColor; //: null,
	private String plotBackgroundImage;// : null,
	private String plotBorderColor; //: "#C0C0C0",
	private Integer plotBorderWidth; //: 0,
	
	//CAUTION: Requires that plotBackgroundColor be set
	private Boolean plotShadow; //: false,

	private Boolean reflow; //: true,
	private String renderTo; //: null,
	private Boolean shadow; //: false,
	private Boolean showAxes; //: false,
	private Integer spacingTop; //: 10,
	private Integer spacingRight; //: 10,
	private Integer spacingBottom; //: 15,
	private Integer spacingLeft; //: 10,
	private Map<String, String> style;
	private Type type; //: "line",
	private Integer width; //: null,
	private ZoomType zoomType; //: ""
	
	public Chart() {
		zoomType = ZoomType.xy;
	}

	public Boolean getAlignTicks() {
		return alignTicks;
	}

	public void setAlignTicks(Boolean alignTicks) {
		this.alignTicks = alignTicks;
	}

	public Boolean getAnimation() {
		return animation;
	}

	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public Integer getBorderRadius() {
		return borderRadius;
	}

	public void setBorderRadius(Integer borderRadius) {
		this.borderRadius = borderRadius;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDefaultSeriesType() {
		return defaultSeriesType;
	}

	public void setDefaultSeriesType(String defaultSeriesType) {
		this.defaultSeriesType = defaultSeriesType;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Boolean getIgnoreHiddenSeries() {
		return ignoreHiddenSeries;
	}

	public void setIgnoreHiddenSeries(Boolean ignoreHiddenSeries) {
		this.ignoreHiddenSeries = ignoreHiddenSeries;
	}

	public Boolean getInverted() {
		return inverted;
	}

	public void setInverted(Boolean inverted) {
		this.inverted = inverted;
	}

	public List<Integer> getMargin() {
		return margin;
	}

	public void setMargin(List<Integer> margin) {
		this.margin = margin;
	}

	public Integer getMarginTop() {
		return marginTop;
	}

	public void setMarginTop(Integer marginTop) {
		this.marginTop = marginTop;
	}

	public Integer getMarginRight() {
		return marginRight;
	}

	public void setMarginRight(Integer marginRight) {
		this.marginRight = marginRight;
	}

	public Integer getMarginBottom() {
		return marginBottom;
	}

	public void setMarginBottom(Integer marginBottom) {
		this.marginBottom = marginBottom;
	}

	public Integer getMarginLeft() {
		return marginLeft;
	}

	public void setMarginLeft(Integer marginLeft) {
		this.marginLeft = marginLeft;
	}

	public String getPlotBackgroundColor() {
		return plotBackgroundColor;
	}

	public void setPlotBackgroundColor(String plotBackgroundColor) {
		this.plotBackgroundColor = plotBackgroundColor;
	}

	public String getPlotBackgroundImage() {
		return plotBackgroundImage;
	}

	public void setPlotBackgroundImage(String plotBackgroundImage) {
		this.plotBackgroundImage = plotBackgroundImage;
	}

	public String getPlotBorderColor() {
		return plotBorderColor;
	}

	public void setPlotBorderColor(String plotBorderColor) {
		this.plotBorderColor = plotBorderColor;
	}

	public Integer getPlotBorderWidth() {
		return plotBorderWidth;
	}

	public void setPlotBorderWidth(Integer plotBorderWidth) {
		this.plotBorderWidth = plotBorderWidth;
	}

	public Boolean getPlotShadow() {
		return plotShadow;
	}

	public void setPlotShadow(Boolean plotShadow) {
		this.plotShadow = plotShadow;
	}

	public Boolean getReflow() {
		return reflow;
	}

	public void setReflow(Boolean reflow) {
		this.reflow = reflow;
	}

	public String getRenderTo() {
		return renderTo;
	}

	public void setRenderTo(String renderTo) {
		this.renderTo = renderTo;
	}

	public Boolean getShadow() {
		return shadow;
	}

	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
	}

	public Boolean getShowAxes() {
		return showAxes;
	}

	public void setShowAxes(Boolean showAxes) {
		this.showAxes = showAxes;
	}

	public Integer getSpacingTop() {
		return spacingTop;
	}

	public void setSpacingTop(Integer spacingTop) {
		this.spacingTop = spacingTop;
	}

	public Integer getSpacingRight() {
		return spacingRight;
	}

	public void setSpacingRight(Integer spacingRight) {
		this.spacingRight = spacingRight;
	}

	public Integer getSpacingBottom() {
		return spacingBottom;
	}

	public void setSpacingBottom(Integer spacingBottom) {
		this.spacingBottom = spacingBottom;
	}

	public Integer getSpacingLeft() {
		return spacingLeft;
	}

	public void setSpacingLeft(Integer spacingLeft) {
		this.spacingLeft = spacingLeft;
	}

	public Map<String, String> getStyle() {
		return style;
	}

	public void setStyle(Map<String, String> style) {
		this.style = style;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public ZoomType getZoomType() {
		return zoomType;
	}

	public void setZoomType(ZoomType zoomType) {
		this.zoomType = zoomType;
	}

}