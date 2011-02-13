package com.comsysto.insight.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Highcharts {

	// TODO: refactor this
	// 1. find minimal configuration needed to render a chart (AFAIK chart, series and xAxis is minimum)
	// 2. group similar charts by type (e.g. column and bar charts are same (?))
	// 3. all attributes should be private
	// 4. make "builder-pattern light" structure of all objects
	// 5. write some documentation

	public Chart chart = new Chart();
	public XAxis xAxis = new XAxis();
	public List<Series> series = new ArrayList<Series>();

	
	public String toJson() {
        String json = "";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        json = gson.toJson(this);

        // dump JSON object
        System.out.println(json);

        return json;
    }

}