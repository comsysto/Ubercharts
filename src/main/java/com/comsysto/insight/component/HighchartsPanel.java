package com.comsysto.insight.component;

import com.comsysto.insight.model.Highchart;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.AbstractReadOnlyModel;


public class HighchartsPanel extends Panel implements IHeaderContributor {

  public HighchartsPanel(String id, final Highchart highcharts) {
    super(id);

    final WebMarkupContainer chartDiv = new WebMarkupContainer("highchart");
    chartDiv.setOutputMarkupId(true);

    add(chartDiv);

    // store ID into chart.renderTo
    highcharts.getChart().setRenderTo(chartDiv.getMarkupId());

    /*
    * we inject the script in the component body and not as a header contribution
    * because the script needs to be called each time the component is refreshed using wicket
    * ajax support.
    */
    add(new Label("script", new AbstractReadOnlyModel<String>() {
      private static final long serialVersionUID = 1L;

      @Override
      public String getObject() {
        StringBuffer js = new StringBuffer();
        js.append("var ").append(chartDiv.getMarkupId()).append(";\n");
        js.append("$(document).ready(function() {\n");
        js.append(chartDiv.getMarkupId());
        js.append(" = new Highcharts.Chart(");

        js.append(highcharts.toJson());

        js.append(" ); }); ");

        return js.toString();
      }
    }).setEscapeModelStrings(false));
  }

  public void renderHead(IHeaderResponse response) {
    response.renderJavascriptReference(new ResourceReference(this.getClass(), "jquery-1.4.4.min.js"));
    response.renderJavascriptReference(new ResourceReference(this.getClass(), "highcharts.js"));
    response.renderJavascriptReference(new ResourceReference(this.getClass(), "exporting.js"));
  }

}