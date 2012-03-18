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

import com.comsysto.insight.model.options.PlotOption;
import com.comsysto.insight.model.options.PlotOptions;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

/**
 * @author zutherb
 */
public class HighchartTest {

    @Test
    public void testToJson() throws Exception {
        Highchart highchart = new Highchart();
        assertNotNull(highchart.toJson());
    }

    @Test
    public void testDisableAllAnimations(){
        Highchart highchart = new Highchart();
        highchart.disableAllAnimations();
        PlotOptions plotOptions = highchart.getPlotOptions();
        assertNotNull(plotOptions);
        List<PlotOption> plotOptionList = plotOptions.getPlotOptions();
        assertFalse(plotOptionList.isEmpty());
        for (PlotOption option : plotOptionList){
            assertFalse(option.getAnimation());
        }
    }
}
