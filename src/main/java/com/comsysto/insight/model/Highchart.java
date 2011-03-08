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
    private ChartTitle title;
    private Tooltip tooltip;
    private Axis xAxis = new Axis();
    private Axis yAxis = new Axis();
    private Exporting exporting;
    private Navigation navigation;

    public Highchart() {
        mapper.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
    }

    public Highchart(Chart pChart, ISeries... pSeries) {
        this();
        chart = pChart;
        setSeries(pSeries);
    }

    public Highchart(Chart pChart, List<ISeries> pSeries) {
        this(pChart);
        setSeries(pSeries);
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

    public Chart getChart() {
        return chart;
    }

    public Highchart setChart(Chart pChart) {
        chart = pChart;
        return this;
    }

    public String[] getColors() {
        return colors;
    }

    public Highchart setColors(String[] pColors) {
        colors = pColors;
        return this;
    }

    public Credits getCredits() {
        return credits;
    }

    public Highchart setCredits(Credits pCredits) {
        credits = pCredits;
        return this;
    }

    public Labels getLabels() {
        return labels;
    }

    public Highchart setLabels(Labels pLabels) {
        labels = pLabels;
        return this;
    }

    public Legend getLegend() {
        return legend;
    }

    public Highchart setLegend(Legend pLegend) {
        legend = pLegend;
        return this;
    }

    public Loading getLoading() {
        return loading;
    }

    public Highchart setLoading(Loading pLoading) {
        loading = pLoading;
        return this;
    }

    public PlotOptions getPlotOptions() {
        return plotOptions;
    }

    public Highchart setPlotOptions(PlotOptions pPlotOptions) {
        plotOptions = pPlotOptions;
        return this;
    }

    public Point getPoint() {
        return point;
    }

    public Highchart setPoint(Point pPoint) {
        point = pPoint;
        return this;
    }

    public List<ISeries> getSeries() {
        return series;
    }

    public Highchart setSeries(List<ISeries> pSeries) {
        series = pSeries;
        return this;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public Highchart setSubtitle(Subtitle pSubtitle) {
        subtitle = pSubtitle;
        return this;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public Highchart setSymbols(String[] pSymbols) {
        symbols = pSymbols;
        return this;
    }

    public ChartTitle getTitle() {
        return title;
    }

    public Highchart setTitle(ChartTitle pTitle) {
        title = pTitle;
        return this;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public Highchart setTooltip(Tooltip pTooltip) {
        tooltip = pTooltip;
        return this;
    }

    public Axis getXAxis() {
        return xAxis;
    }

    public Highchart setXAxis(Axis pXAxis) {
        xAxis = pXAxis;
        return this;
    }

    public Axis getYAxis() {
        return yAxis;
    }

    public Highchart setYAxis(Axis pYAxis) {
        yAxis = pYAxis;
        return this;
    }

    public Exporting getExporting() {
        return exporting;
    }

    public Highchart setExporting(Exporting pExporting) {
        exporting = pExporting;
        return this;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public Highchart setNavigation(Navigation pNavigation) {
        navigation = pNavigation;
        return this;
    }
}