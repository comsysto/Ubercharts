package com.comsysto.insight.model;

import com.comsysto.insight.model.charts.Chart;
import com.comsysto.insight.model.options.Title;
import com.comsysto.insight.model.options.XAxis;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

public class Highchart {

  // TODO: refactor this
  // 1. find minimal configuration needed to render a chart (AFAIK chart, series and xAxis is minimum)
  // 2. group similar charts by type (e.g. column and bar charts are same (?))
  // 3. all attributes should be private
  // 4. make "builder-pattern light" structure of all objects
  // 5. write some documentation


  private static Gson mGson = new GsonBuilder().setPrettyPrinting()
    .registerTypeAdapter(ISeries.class, new SeriesSerializer())
    .create();


  private Chart chart;
  private XAxis xAxis = new XAxis();
  private Title title;


  //private List<ISeries> series;
  private List<ISeries> series = new LinkedList<ISeries>();


  public Highchart(Chart pChart) {
    chart = pChart;
  }


  public String toJson() {


    String json = "";

    json = mGson.toJson(this);

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

  private static class SeriesSerializer implements JsonSerializer<ISeries> {

    private Gson mGson;
    private JsonParser mParser = new JsonParser();


    SeriesSerializer() {

      GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
      mGson = builder.create();

    }

    public JsonElement serialize(ISeries src, Type typeOfSrc, JsonSerializationContext context) {
      return mParser.parse(mGson.toJson(src));
    }
  }


}