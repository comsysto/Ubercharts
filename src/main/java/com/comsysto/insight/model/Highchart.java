package com.comsysto.insight.model;

import com.comsysto.insight.model.charts.Chart;
import com.comsysto.insight.model.options.Title;
import com.comsysto.insight.model.options.XAxis;
import com.comsysto.insight.model.options.series.generic.ISeries;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
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


    private ObjectMapper mapper = new ObjectMapper().configure(SerializationConfig.Feature.WRITE_NULL_PROPERTIES, false);


    private Chart chart;
    private XAxis xAxis = new XAxis();
    private Title title;


    //private List<ISeries> series;
    private List<ISeries> series = new LinkedList<ISeries>();


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


}