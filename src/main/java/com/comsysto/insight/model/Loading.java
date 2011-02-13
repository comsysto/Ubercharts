package com.comsysto.insight.model;

import java.util.Map;

public class Loading {

	private final Integer hideDuration;
	private final Map<String, String> labelStyle;
	private final Integer showDuration;
	private final Map<String, String> style;
	
	private Loading(Builder builder) {
		this.hideDuration = builder.hideDuration;
		this.labelStyle = builder.labelStyle;
		this.showDuration = builder.showDuration;
		this.style = builder.style;
	}

	public Integer getHideDuration() {
		return hideDuration;
	}

	public Map<String, String> getLabelStyle() {
		return labelStyle;
	}

	public Integer getShowDuration() {
		return showDuration;
	}

	public Map<String, String> getStyle() {
		return style;
	}


	public static class Builder {
		private Integer hideDuration = 100;
		private Map<String, String> labelStyle;
		private Integer showDuration = 100;
		private Map<String, String> style;

		public Builder() {
		}

		public Builder hideDuration(Integer hideDuration) {
			this.hideDuration = hideDuration;
			return this;
		}

		public Builder labelStyle(Map<String, String> labelStyle) {
			this.labelStyle = labelStyle;
			return this;
		}

		public Builder showDuration(Integer showDuration) {
			this.showDuration = showDuration;
			return this;
		}

		public Builder style(Map<String, String> style) {
			this.style = style;
			return this;
		}

		public Loading build() {
			return new Loading (this);
		}
	}

}