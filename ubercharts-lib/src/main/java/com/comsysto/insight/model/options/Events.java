package com.comsysto.insight.model.options;

import org.codehaus.jackson.annotate.JsonRawValue;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * @author zutherb
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Events implements Serializable {

    @JsonRawValue
    private String click;
    @JsonRawValue
    private String mouseOver;
    @JsonRawValue
    private String mouseOut;
    @JsonRawValue
    private String remove;
    @JsonRawValue
    private String select;
    @JsonRawValue
    private String unselect;
    @JsonRawValue
    private String update;
    @JsonRawValue
    private String load;

    @JsonRawValue
    private String legendItemClick;

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

    public String getMouseOver() {
        return mouseOver;
    }

    public void setMouseOver(String mouseOver) {
        this.mouseOver = mouseOver;
    }

    public String getMouseOut() {
        return mouseOut;
    }

    public void setMouseOut(String mouseOut) {
        this.mouseOut = mouseOut;
    }

    public String getRemove() {
        return remove;
    }

    public void setRemove(String remove) {
        this.remove = remove;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getUnselect() {
        return unselect;
    }

    public void setUnselect(String unselect) {
        this.unselect = unselect;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public String getLegendItemClick() {
        return legendItemClick;
    }

    public void setLegendItemClick(String legendItemClick) {
        this.legendItemClick = legendItemClick;
    }
}
