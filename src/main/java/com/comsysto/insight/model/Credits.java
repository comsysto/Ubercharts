package com.comsysto.insight.model;

import java.util.HashMap;
import java.util.Map;


public class Credits {

	private final Boolean enabled;
	private final Position position;
	private final String href;
	private final Map<String, String> style;
	private final String text;
	
	private Credits (Builder builder) {
		this.enabled = builder.enabled;
		this.position = builder.position;
		this.href = builder.href;
		this.style = builder.style;
		this.text = builder.text;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public Position getPosition() {
		return position;
	}

	public String getHref() {
		return href;
	}

	public Map<String, String> getStyle() {
		return style;
	}

	public String getText() {
		return text;
	}

	public static class Builder {

		private Boolean enabled = Boolean.TRUE;
		private Position position;
		private String href = "http://www.highcharts.com";
		private Map<String, String> style;
		private String text = "Highcharts.com";

		public Builder() {
			style = new HashMap<String, String>();
			style.put("cursor", "pointer");
			style.put("color", "#909090");
			style.put("fontSize", "10px;");
			
			Position.Builder positionBuilder = new Position.Builder();
			position = positionBuilder.build();
		}

		public Builder enabled(Boolean enabled) {
			this.enabled = enabled;
			return this;
		}

		public Builder href(String href) {
			this.href = href;
			return this;
		}

		public Builder text(String text) {
			this.text = text;
			return this;
		}
		
		public Builder position(Position position) {
			this.position = position;
			return this;
		}

		public Builder style(Map<String, String> style) {
			this.style = style;
			return this;
		}
		
		public Credits build() {
			return new Credits(this);
		}
	}

}