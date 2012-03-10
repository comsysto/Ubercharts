package com.comsysto.insight.model.options;

import java.io.Serializable;

/**
 * @author zutherb
 */
public class PlotOptions implements Serializable {
    PlotOption area = new PlotOption();
    PlotOption areaspline = new PlotOption();
    PlotOption bar = new PlotOption();
    PlotOption column = new PlotOption();
    PlotOption line = new PlotOption();
    PlotOption pie = new PlotOption();
    PlotOption scatter = new PlotOption();
    PlotOption spline = new PlotOption();

    public PlotOption getSpline() {
        return spline;
    }

    public void setSpline(PlotOption spline) {
        this.spline = spline;
    }

    public PlotOption getScatter() {
        return scatter;
    }

    public void setScatter(PlotOption scatter) {
        this.scatter = scatter;
    }

    public PlotOption getPie() {
        return pie;
    }

    public void setPie(PlotOption pie) {
        this.pie = pie;
    }

    public PlotOption getLine() {
        return line;
    }

    public void setLine(PlotOption line) {
        this.line = line;
    }

    public PlotOption getColumn() {
        return column;
    }

    public void setColumn(PlotOption column) {
        this.column = column;
    }

    public PlotOption getBar() {
        return bar;
    }

    public void setBar(PlotOption bar) {
        this.bar = bar;
    }

    public PlotOption getAreaspline() {
        return areaspline;
    }

    public void setAreaspline(PlotOption areaspline) {
        this.areaspline = areaspline;
    }

    public PlotOption getArea() {
        return area;
    }

    public void setArea(PlotOption area) {
        this.area = area;
    }
}
