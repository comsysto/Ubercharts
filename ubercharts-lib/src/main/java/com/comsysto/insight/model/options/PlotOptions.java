package com.comsysto.insight.model.options;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zutherb
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class PlotOptions implements Serializable {
    private PlotOption area;
    private PlotOption areaspline;
    private PlotOption bar;
    private PlotOption column;
    private PlotOption line;
    private PlotOption pie;
    private PlotOption scatter;
    private PlotOption spline;
    private Series series;

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

    public Series getSeries() {
        return series;
    }

    public PlotOptions setSeries(Series series) {
        this.series = series;
        return this;
    }

    public void initializeNullPlotOption(){
        if(area == null)        area = new PlotOption();
        if(areaspline == null)  areaspline = new PlotOption();
        if(bar == null)         bar = new PlotOption();
        if(column == null)      column = new PlotOption();
        if(line == null)        line = new PlotOption();
        if(pie == null)         pie = new PlotOption();
        if(scatter == null)     scatter = new PlotOption();
        if(spline == null)      spline = new PlotOption();
    }

    @JsonIgnore
    public List<PlotOption> getPlotOptions(){
        List<PlotOption> plotOptions = new ArrayList<PlotOption>();
        if(area != null)        plotOptions.add(area);
        if(areaspline != null)  plotOptions.add(areaspline);
        if(bar != null)         plotOptions.add(bar);
        if(column != null)      plotOptions.add(column);
        if(line != null)        plotOptions.add(line);
        if(pie != null)         plotOptions.add(pie);
        if(scatter != null)     plotOptions.add(scatter);
        if(spline != null)      plotOptions.add(spline);
        return plotOptions;
    }
}
