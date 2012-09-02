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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * HTML labels that can be positioned anywhere in the chart area.
 *
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Labels implements Serializable {

    /**
     * A list of all labels to be placed in the chart area.
     */
    public List<Item> items = new ArrayList<Item>();

    /**
     * Shared CSS styles for all labels.
     * <p/>
     * Defaults to:
     * <pre>
     *  style: {
     *      color: '#3E576F'
     *  }
     * </pre>
     */
    public Map<String, String> style = new LinkedHashMap<String, String>();

    public Labels() {

        style.put("color", "#3E576F");

    }

    /**
     * Creates new label Item and includes it into the List of labels to be displayed.
     *
     * @return newly created label Item for easy chaining.
     */
    public Item label() {

        final Item item = Item.newItem();
        items.add(item);
        return item;

    }

    /**
     * Removes all label Items defined and included previously.
     */
    public void clear() {

        items.clear();

    }


}
