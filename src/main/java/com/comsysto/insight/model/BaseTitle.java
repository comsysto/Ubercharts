package com.comsysto.insight.model;

import java.util.Map;

/**
 * Base class for Title, Subtitle and XAxis.Title
 * Not used yet.
 * 
 * @author omazic
 *
 */
public abstract class BaseTitle {

	private Align align;
	private String text;
	private Map<String, String> style;


	public Align getAlign() {
		return align;
	}
	public void setAlign(Align align) {
		this.align = align;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Map<String, String> getStyle() {
		return style;
	}
	public void setStyle(Map<String, String> style) {
		this.style = style;
	}

}