/*
 * Copyright 2012 comSysto GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.comsysto.ubercharts.api;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Item implements Serializable {

    public static Item newItem() {

        return new Item();

    }

    /**
     * Inner HTML or text for the label.
     * <p/>
     * Defaults to "".
     */
    public String html = "";

    /**
     * CSS styles for each label.
     * <p/>
     * To position the label, use left and top like this:
     * <pre>
     *  style: {
     *      left: '100px',
     *      top: '100px'
     * }
     * </pre>
     */
    public Map<String, String> style = new LinkedHashMap<String, String>();

    /**
     * Sets the text to be displayed on this label Item.
     *
     * @param text Text to be displayed
     * @return Item itself for each chaining.
     */
    public Item withText(String text) {

        html = text;
        return this;

    }

    /**
     * Defines the exact position of this label Item on a Chart.
     *
     * @param left left position of the Item in px.
     * @param top  top position of the Item in px.
     * @return Item itself for each chaining.
     */
    public Item placeAt(int left, int top) {

        style.put("left", String.valueOf(left));
        style.put("top", String.valueOf(top));
        return this;

    }
}
