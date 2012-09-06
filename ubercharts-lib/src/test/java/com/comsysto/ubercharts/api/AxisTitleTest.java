package com.comsysto.ubercharts.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Daniel Bartl
 */
public class AxisTitleTest {

    @Test
    public void testDefaults() throws Exception {

        AxisTitle title = new AxisTitle();

        assertEquals("#6D869F", title.style.get("color"));
        assertEquals("bold", title.style.get("fontWeight"));

    }
}
