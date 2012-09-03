package com.comsysto.ubercharts.api;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Daniel Bartl
 */
public class PaneTest {


    @Test
    public void testDefaultValues() throws Exception {

        Pane pane = new Pane();

        Assert.assertEquals("50%", pane.getXOfCenter());
        Assert.assertEquals("50%", pane.getYOfCenter());

    }

    @Test
    public void testCenterWithPx() throws Exception {

        Pane pane = new Pane();

        pane.center(10, 20);

        Assert.assertEquals("10", pane.getXOfCenter());
        Assert.assertEquals("20", pane.getYOfCenter());

    }

    @Test
    public void testCenterWithPercent() throws Exception {

        Pane pane = new Pane();

        pane.center("10%", "20%");

        Assert.assertEquals("10%", pane.getXOfCenter());
        Assert.assertEquals("20%", pane.getYOfCenter());

    }
}
