package com.comsysto.insight.model.options;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 08/03/2011
 * Time: 15:24
 * To change this template use File | Settings | File Templates.
 */
public class Navigation {

    private Map<String, String> mMenuStyle;
    private Map<String, String> mMenuItemStyle;
    private Map<String, String> mMenuItemHoverStyle;
    private ButtonOptions mButtonsOptions;

    public Map<String, String> getMenuStyle() {
        return mMenuStyle;
    }

    public Navigation setMenuStyle(Map<String, String> pMenuStyle) {
        mMenuStyle = pMenuStyle;
        return this;
    }

    public Map<String, String> getMenuItemStyle() {
        return mMenuItemStyle;
    }

    public Navigation setMenuItemStyle(Map<String, String> pMenuItemStyle) {
        mMenuItemStyle = pMenuItemStyle;
        return this;
    }

    public Map<String, String> getMenuItemHoverStyle() {
        return mMenuItemHoverStyle;
    }

    public Navigation setMenuItemHoverStyle(Map<String, String> pMenuItemHoverStyle) {
        mMenuItemHoverStyle = pMenuItemHoverStyle;
        return this;
    }

    public ButtonOptions getButtonsOptions() {
        return mButtonsOptions;
    }

    public Navigation setButtonsOptions(ButtonOptions pButtonsOptions) {
        mButtonsOptions = pButtonsOptions;
        return this;
    }
}
