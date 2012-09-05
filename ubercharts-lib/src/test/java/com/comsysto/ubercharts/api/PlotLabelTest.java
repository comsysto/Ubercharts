package com.comsysto.ubercharts.api;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Daniel Bartl
 */
public class PlotLabelTest {

    @Test
    public void testHorizontal() throws Exception {

        PlotLabel plotLabel = PlotLabel.horizontal();
        Assert.assertEquals(Integer.valueOf(0), plotLabel.rotation);

    }

    @Test
    public void testVertical() throws Exception {

        PlotLabel plotLabel = PlotLabel.vertical();
        Assert.assertEquals(Integer.valueOf(90), plotLabel.rotation);

    }
}
