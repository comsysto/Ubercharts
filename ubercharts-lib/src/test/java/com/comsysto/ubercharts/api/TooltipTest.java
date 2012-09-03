package com.comsysto.ubercharts.api;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Daniel Bartl
 */
public class TooltipTest {

    @Test
    public void testDefaults() throws Exception {

        Tooltip tooltip = new Tooltip();

        assertEquals("#333333", tooltip.style.get("color"));
        assertEquals("9pt", tooltip.style.get("fontSize"));
        assertEquals("5px", tooltip.style.get("padding"));

        assertTrue(tooltip.enabled);
        assertFalse(tooltip.useHTML);

    }
}
