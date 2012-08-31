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

package com.comsysto.insight.component;

import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.resource.HighchartsExportingModuleResourcesReference;
import com.comsysto.insight.resource.HighchartsResourcesReference;
import org.apache.wicket.Application;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.request.resource.ResourceReference;


public class HighchartsPanel extends Panel {

    private boolean jqueryProvided = false;
    private boolean highchartProvided = false;

    private WebMarkupContainer chartDiv;
    private IModel<Highchart> highchartsModel;

    public HighchartsPanel(String id, IModel<Highchart> highchartsModel) {
        super(id, highchartsModel);
        this.highchartsModel = highchartsModel;

        chartDiv = new WebMarkupContainer("highchart");
        chartDiv.setOutputMarkupId(true);

        add(chartDiv);

        /*
        * we inject the script in the component body and not as a header contribution
        * because the script needs to be called each time the component is refreshed using wicket
        * ajax support.
        */
        add(new Label("script", new LoadableDetachableModel<String>() {
            private static final long serialVersionUID = 1L;

            @Override
            public String load() {
                return generateHighchartsJS();
            }
        }).setEscapeModelStrings(false));

        setOutputMarkupId(true);
    }

    private String generateHighchartsJS() {
        // store ID into chart.renderTo
        highchartsModel.getObject().getChart().setRenderTo(chartDiv.getMarkupId());

        StringBuilder js = new StringBuilder();
        js.append("var ").append(chartDiv.getMarkupId()).append(";\n");
        js.append("$(document).ready(function() {\n");
        js.append(chartDiv.getMarkupId());
        js.append(" = new Highcharts.Chart(");

        js.append(highchartsObjectToJson(highchartsModel));

        js.append(" ); }); ");
        return js.toString();
    }

    protected String highchartsObjectToJson(IModel<Highchart> highchartsModel) {
        return highchartsModel.getObject().toJson();
    }

    @Override
    public void renderHead(IHeaderResponse response) {

        final ResourceReference jQueryReference =
                Application.get().getJavaScriptLibrarySettings().getJQueryReference();

        if (!jqueryProvided) {

            response.render(JavaScriptHeaderItem.forReference(jQueryReference));

        }

        if (!highchartProvided) {

            response.render(JavaScriptHeaderItem.forReference(HighchartsResourcesReference.get()));
            response.render(JavaScriptHeaderItem.forReference(HighchartsExportingModuleResourcesReference.get()));

        }
    }

    public HighchartsPanel setJQueryProvided(boolean jqueryProvided) {
        this.jqueryProvided = jqueryProvided;
        return this;
    }

    public HighchartsPanel setHighchartProvided(boolean highchartProvided) {
        this.highchartProvided = highchartProvided;
        return this;
    }
}