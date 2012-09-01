package com.comsysto.ubercharts.ui;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

/**
 * @author Daniel Bartl
 */
public class TestPageTest {

    @Test
    public void testRendering() throws Exception {

        WicketTester wicketTester = new WicketTester();

        wicketTester.startPage(TestPage.class);

        wicketTester.assertNoErrorMessage();

    }
}
