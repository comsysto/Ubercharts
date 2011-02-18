package com.comsysto.insight;

import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.NumberSeries;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Date: Feb 18, 2011
 * Time: 10:29:26 PM
 *
 * @author Mohammed El Batya
 */
public class SerialisationTest extends TestCase {

  public void testSerialiseSeries() {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    ISeries a = new NumberSeries("Birnen").setData(Arrays.asList(7.0, 6.9, 9.5, 6.6, 8.2, 5.9));

    String json = gson.toJson(a);

    assertEquals(json, "{\n" +
      "  \"data\": [\n" +
      "    7.0,\n" +
      "    6.9,\n" +
      "    9.5,\n" +
      "    6.6,\n" +
      "    8.2,\n" +
      "    5.9\n" +
      "  ],\n" +
      "  \"name\": \"Birnen\",\n" +
      "  \"stack\": \"\",\n" +
      "  \"type\": \"line\",\n" +
      "  \"xAxis\": 0,\n" +
      "  \"yAxis\": 0\n" +
      "}");

    // dump JSON object
    System.out.println(json);


  }

}
