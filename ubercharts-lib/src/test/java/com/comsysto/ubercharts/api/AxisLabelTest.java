package com.comsysto.ubercharts.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Daniel Bartl
 */
public class AxisLabelTest {

    @Test
    public void testDefaults() throws Exception {

        AxisLabel label = new AxisLabel();

        assertEquals("#6D869F", label.style.get("color"));
        assertEquals("bold", label.style.get("fontWeight"));

    }
}
