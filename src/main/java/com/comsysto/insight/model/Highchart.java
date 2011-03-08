package com.comsysto.insight.model;

import com.comsysto.insight.model.charts.Chart;
import com.comsysto.insight.model.options.*;
import com.comsysto.insight.model.options.series.generic.ISeries;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Highchart {

    // TODO: refactor this
    // 1. find minimal configuration needed to render a chart (AFAIK chart, series and xAxis is minimum)
    // 2. group similar charts by type (e.g. column and bar charts are same (?))
    // 3. all attributes should be private
    // 4. make "builder-pattern light" structure of all objects
    // 5. write some documentation


    private ObjectMapper mapper = new ObjectMapper();


    private Chart chart;
    private String[] colors;
    private Credits credits;
    //private Global global;
    private Labels labels;
    //private Lang lang;
    private Legend legend;
    private Loading loading;
    private PlotOptions plotOptions;
    private Point point;
    private List<ISeries> series = new LinkedList<ISeries>();
    private Subtitle subtitle;
    private String[] symbols;
    private Title title;
    private Tooltip tooltip;
    private XAxis xAxis = new XAxis();
    private YAxis yAxis = new YAxis();
    private Exporting exporting;
    private Navigation navigation;


    public Highchart(Chart pChart) {
        chart = pChart;
        mapper.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
    }


    public String toJson() {


        String json = "";

        try {
            json = mapper.writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // dump JSON object
        System.out.println(json);

        return json;
    }

    public Chart getChart() {
        return chart;
    }

    public Highchart addSeries(ISeries... pSeries) {

        for (ISeries s : pSeries) {
            series.add(s);
        }

        return this;
    }

    public Highchart setSeries(ISeries... pSeries) {
        series.clear();
        addSeries(pSeries);
        return this;
    }


    public List<ISeries> getSeries() {
        return series;
    }

    public XAxis getXAxis() {
        return xAxis;
    }

    public Title getTitle() {
        return title;
    }

    public Highchart setTitle(Title pTitle) {
        title = pTitle;
        return this;
    }


    public ObjectMapper getMapper() {
        return mapper;
    }

    public void setMapper(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public Credits getCredits() {
        return credits;
    }

    public void setCredits(Credits credits) {
        this.credits = credits;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public Loading getLoading() {
        return loading;
    }

    public void setLoading(Loading loading) {
        this.loading = loading;
    }

    public PlotOptions getPlotOptions() {
        return plotOptions;
    }

    public void setPlotOptions(PlotOptions plotOptions) {
        this.plotOptions = plotOptions;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public YAxis getYAxis() {
        return yAxis;
    }

    public void setYAxis(YAxis yAxis) {
        this.yAxis = yAxis;
    }

    public Exporting getExporting() {
        return exporting;
    }

    public void setExporting(Exporting exporting) {
        this.exporting = exporting;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }
}