package com.comsysto.ubercharts.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Daniel Bartl
 */
public class LabelsTest {

    @Test
    public void testDefaults() throws Exception {

        final Labels labels = new Labels();

        assertEquals(1, labels.style.size());
        assertEquals(labels.style.get("color"), "#3E576F");
        assertTrue(labels.items.isEmpty());

    }

    @Test
    public void testLabel() throws Exception {

        final Labels labels = new Labels();

        labels.label().withText("Test label").placeAt(10, 20);

        assertEquals(1, labels.items.size());
        assertEquals("Test label", labels.items.get(0).html);
        assertEquals("10", labels.items.get(0).style.get("left"));
        assertEquals("20", labels.items.get(0).style.get("top"));

    }

    @Test
    public void testClear() throws Exception {

        final Labels labels = new Labels();

        labels.label().withText("One");
        labels.label().withText("Two");
        labels.label().withText("Three");

        assertEquals(3, labels.items.size());

        labels.clear();

        assertTrue(labels.items.isEmpty());

    }
}
