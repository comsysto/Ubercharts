package com.comsysto.insight.model;

import com.comsysto.insight.model.charts.Chart;
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


  static Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(ISeries.class, new DeepSeriesSerializer<ISeries>(true)).create();

  private Chart chart;
  private XAxis xAxis = new XAxis();


  //private List<ISeries> series;
  private List<ISeries> series = new LinkedList<ISeries>();


  public Highchart(Chart pChart) {
    chart = pChart;
  }


  public String toJson() {


    String json = "";

    json = gson.toJson(this);

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

  private static class DeepSeriesSerializer<T> implements JsonSerializer<T> {

    private Gson mGson;
    private JsonParser mParser = new JsonParser();


    DeepSeriesSerializer(boolean pGoDeeper) {

      GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
      if (pGoDeeper) {
        builder.registerTypeAdapter(Object[].class, new DeepSeriesSerializer<Object[]>(false));
      }
      mGson = builder.create();

    }

    public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context) {
      return mParser.parse(mGson.toJson(src));
    }

  }


}