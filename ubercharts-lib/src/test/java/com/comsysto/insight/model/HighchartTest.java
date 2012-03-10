package com.comsysto.insight.model;

import org.junit.Test;

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
}
