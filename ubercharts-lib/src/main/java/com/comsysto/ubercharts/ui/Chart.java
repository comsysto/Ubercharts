/*
 * Copyright 2012 comSysto GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.comsysto.ubercharts.ui;

import com.comsysto.insight.resource.HighchartsExportingModuleResourcesReference;
import com.comsysto.insight.resource.HighchartsMoreResourcesReference;
import com.comsysto.insight.resource.HighchartsResourcesReference;
import com.comsysto.ubercharts.api.Highcharts;
import org.apache.wicket.Application;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebComponent;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.resource.ResourceReference;
import org.apache.wicket.util.template.PackageTextTemplate;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.introspect.JacksonAnnotationIntrospector;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Daniel Bartl
 */
public class Chart extends WebComponent {

    private final IModel<Highcharts> highchartsModel;

    public Chart(String id, IModel<Highcharts> highchartsModel) {

        super(id);

        this.highchartsModel = highchartsModel;

        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true);

    }

    @Override
    public void renderHead(IHeaderResponse response) {

        final ResourceReference jQueryReference =
                Application.get().getJavaScriptLibrarySettings().getJQueryReference();

        response.render(JavaScriptHeaderItem.forReference(jQueryReference));
        response.render(JavaScriptHeaderItem.forReference(HighchartsResourcesReference.get()));
        response.render(JavaScriptHeaderItem.forReference(HighchartsMoreResourcesReference.get()));
        response.render(JavaScriptHeaderItem.forReference(HighchartsExportingModuleResourcesReference.get()));

        response.render(OnDomReadyHeaderItem.forScript(chartScript()));

    }

    String chartScript() {

        highchartsModel.getObject().chart.renderTo = getMarkupId();

        StringBuilder js = new StringBuilder();

        js.append(String.format("var %s;\n", getMarkupId()));
        js.append(String.format("%s = new Highcharts.Chart(", getMarkupId()));

        js.append(toJSON(highchartsModel));

        js.append(" );");

        return js.toString();
    }

    private CharSequence toJSON(IModel<Highcharts> highchartsModel) {

        try {

            final String json = JsonObjectMapper.getInstance().writerWithDefaultPrettyPrinter().writeValueAsString(highchartsModel.getObject());
            System.out.println(json);
            return json;

        } catch (IOException e) {

            e.printStackTrace();

            Map<String, String> params = new HashMap<String, String>();
            params.put("markupId", highchartsModel.getObject().chart.renderTo);
            params.put("type", highchartsModel.getObject().chart.type.name());

            return new PackageTextTemplate(getClass(), "SampleChart.txt").asString(params);

        }

    }

    private static class JsonObjectMapper {

        private static ObjectMapper mapper;

        public static synchronized ObjectMapper getInstance() {

            if (mapper == null) {
                mapper = new ObjectMapper();
                mapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
            }

            return mapper;
        }

    }
}