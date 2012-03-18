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

package com.comsysto.insight.model;

import com.comsysto.insight.model.charts.Chart;
import com.comsysto.insight.model.options.*;
import com.comsysto.insight.model.options.series.generic.ISeries;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.introspect.JacksonAnnotationIntrospector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Highchart implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Highchart.class);

    private Chart chart;
    private String[] colors;
    private Credits credits;
    private ChartLabels labels;
    private Legend legend;
    private Loading loading;
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
    private PlotOptions plotOptions = new PlotOptions();

    public Highchart() {

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
            json = JsonObjectMapper.getInstance().writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        LOGGER.info(json);

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

    public ChartLabels getLabels() {
        return labels;
    }

    public Highchart setLabels(ChartLabels pLabels) {
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

    public Highchart setSymbols(Symbol[] pSymbols) {
        String[] symbols = new String[pSymbols.length];

        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = pSymbols[i].toString();
        }

        return setSymbols(symbols);
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

    @JsonProperty("xAxis")
    public Axis getXAxis() {
        return xAxis;
    }

    public Highchart setXAxis(Axis pXAxis) {
        xAxis = pXAxis;
        return this;
    }

    @JsonProperty("yAxis")
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

    public PlotOptions getPlotOptions() {
        return plotOptions;
    }

    public void setPlotOptions(PlotOptions plotOptions) {
        this.plotOptions = plotOptions;
    }

    private static class JsonObjectMapper {

        private static ObjectMapper mapper;

        public static synchronized ObjectMapper getInstance(){
            if(mapper == null){
                mapper = new ObjectMapper();
                mapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
            }
            return mapper;
        }

    }
}