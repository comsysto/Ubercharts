package com.comsysto.insight.model;

import com.comsysto.insight.model.charts.Chart;
import com.comsysto.insight.model.options.Series;
import com.comsysto.insight.model.options.XAxis;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Highchart {

  // TODO: refactor this
  // 1. find minimal configuration needed to render a chart (AFAIK chart, series and xAxis is minimum)
  // 2. group similar charts by type (e.g. column and bar charts are same (?))
  // 3. all attributes should be private
  // 4. make "builder-pattern light" structure of all objects
  // 5. write some documentation

  private Chart chart;
  private XAxis xAxis = new XAxis();
  private List<Series> series = new ArrayList<Series>();

  public Highchart(Chart pChart) {
    chart = pChart;
  }

  public String toJson() {
    String json = "";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    json = gson.toJson(this);

    // dump JSON object
    System.out.println(json);

    return json;
  }

  public Chart getChart() {
    return chart;
  }

  public Highchart addSeries(Series... pSeries) {
    for (Series s : pSeries) {
      series.add(s);
    }
    return this;
  }

  public Highchart setSeries(Series... pSeries) {
    series.clear();
    addSeries(pSeries);
    return this;
  }
}