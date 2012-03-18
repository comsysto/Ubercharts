package com.comsysto.insight;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zutherb
 */
public class HomePageTest {
    private WicketTester wicketTester;

    @Before
    public void setup(){
        wicketTester = new WicketTester(new WicketApplication());
    }

    @Test
    public void testRender(){
        wicketTester.startPage(HomePage.class);
        wicketTester.assertRenderedPage(HomePage.class);
    }
}
