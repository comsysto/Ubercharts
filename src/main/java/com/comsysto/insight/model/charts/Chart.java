package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.Type;
import com.comsysto.insight.model.options.ZoomType;

import java.util.List;
import java.util.Map;

/**
 * Date: Feb 18, 2011
 * Time: 3:16:33 PM
 *
 * @author Mohammed El Batya
 */
public class Chart {

  protected Chart(Type pType) {
    type = pType;
  }

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
  private ZoomType zoomType;


  public Boolean getAlignTicks() {
    return alignTicks;
  }

  public void setAlignTicks(Boolean pAlignTicks) {
    alignTicks = pAlignTicks;
  }

  public Boolean getAnimation() {
    return animation;
  }

  public void setAnimation(Boolean pAnimation) {
    animation = pAnimation;
  }

  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String pBackgroundColor) {
    backgroundColor = pBackgroundColor;
  }

  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(String pBorderColor) {
    borderColor = pBorderColor;
  }

  public Integer getBorderRadius() {
    return borderRadius;
  }

  public void setBorderRadius(Integer pBorderRadius) {
    borderRadius = pBorderRadius;
  }

  public Integer getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(Integer pBorderWidth) {
    borderWidth = pBorderWidth;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String pClassName) {
    className = pClassName;
  }

  public String getDefaultSeriesType() {
    return defaultSeriesType;
  }

  public void setDefaultSeriesType(String pDefaultSeriesType) {
    defaultSeriesType = pDefaultSeriesType;
  }

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer pHeight) {
    height = pHeight;
  }

  public Boolean getIgnoreHiddenSeries() {
    return ignoreHiddenSeries;
  }

  public void setIgnoreHiddenSeries(Boolean pIgnoreHiddenSeries) {
    ignoreHiddenSeries = pIgnoreHiddenSeries;
  }

  public Boolean getInverted() {
    return inverted;
  }

  public void setInverted(Boolean pInverted) {
    inverted = pInverted;
  }

  public List<Integer> getArgin() {
    return margin;
  }

  public void setArgin(List<Integer> pArgin) {
    margin = pArgin;
  }

  public Integer getArginTop() {
    return marginTop;
  }

  public void setArginTop(Integer pArginTop) {
    marginTop = pArginTop;
  }

  public Integer getArginRight() {
    return marginRight;
  }

  public void setArginRight(Integer pArginRight) {
    marginRight = pArginRight;
  }

  public Integer getArginBottom() {
    return marginBottom;
  }

  public void setArginBottom(Integer pArginBottom) {
    marginBottom = pArginBottom;
  }

  public Integer getArginLeft() {
    return marginLeft;
  }

  public void setArginLeft(Integer pArginLeft) {
    marginLeft = pArginLeft;
  }

  public String getPlotBackgroundColor() {
    return plotBackgroundColor;
  }

  public void setPlotBackgroundColor(String pPlotBackgroundColor) {
    plotBackgroundColor = pPlotBackgroundColor;
  }

  public String getPlotBackgroundImage() {
    return plotBackgroundImage;
  }

  public void setPlotBackgroundImage(String pPlotBackgroundImage) {
    plotBackgroundImage = pPlotBackgroundImage;
  }

  public String getPlotBorderColor() {
    return plotBorderColor;
  }

  public void setPlotBorderColor(String pPlotBorderColor) {
    plotBorderColor = pPlotBorderColor;
  }

  public Integer getPlotBorderWidth() {
    return plotBorderWidth;
  }

  public void setPlotBorderWidth(Integer pPlotBorderWidth) {
    plotBorderWidth = pPlotBorderWidth;
  }

  public Boolean getPlotShadow() {
    return plotShadow;
  }

  public void setPlotShadow(Boolean pPlotShadow) {
    plotShadow = pPlotShadow;
  }

  public Boolean getReflow() {
    return reflow;
  }

  public void setReflow(Boolean pReflow) {
    reflow = pReflow;
  }

  public String getRenderTo() {
    return renderTo;
  }

  public void setRenderTo(String pRenderTo) {
    renderTo = pRenderTo;
  }

  public Boolean getShadow() {
    return shadow;
  }

  public void setShadow(Boolean pShadow) {
    shadow = pShadow;
  }

  public Boolean getShowAxes() {
    return showAxes;
  }

  public void setShowAxes(Boolean pShowAxes) {
    showAxes = pShowAxes;
  }

  public Integer getSpacingTop() {
    return spacingTop;
  }

  public void setSpacingTop(Integer pSpacingTop) {
    spacingTop = pSpacingTop;
  }

  public Integer getSpacingRight() {
    return spacingRight;
  }

  public void setSpacingRight(Integer pSpacingRight) {
    spacingRight = pSpacingRight;
  }

  public Integer getSpacingBottom() {
    return spacingBottom;
  }

  public void setSpacingBottom(Integer pSpacingBottom) {
    spacingBottom = pSpacingBottom;
  }

  public Integer getSpacingLeft() {
    return spacingLeft;
  }

  public void setSpacingLeft(Integer pSpacingLeft) {
    spacingLeft = pSpacingLeft;
  }

  public Map<String, String> getStyle() {
    return style;
  }

  public void setStyle(Map<String, String> pStyle) {
    style = pStyle;
  }

  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer pWidth) {
    width = pWidth;
  }

  public ZoomType getZoomType() {
    return zoomType;
  }

  public void setZoomType(ZoomType pZoomType) {
    zoomType = pZoomType;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type pType) {
    type = pType;
  }
}
