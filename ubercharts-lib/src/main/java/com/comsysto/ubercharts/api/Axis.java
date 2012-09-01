package com.comsysto.ubercharts.api;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Bartl
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Axis implements Serializable {

    /**
     * If categories are present for the xAxis, names are used instead of numbers for that axis.
     * <p/>
     * Example:
     * categories: ['Apples', 'Bananas', 'Oranges']
     */
    public List<String> categories = new ArrayList<String>();

}
