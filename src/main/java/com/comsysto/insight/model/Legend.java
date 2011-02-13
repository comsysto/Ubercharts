package com.comsysto.insight.model;

import java.util.Map;


public class Legend {

	private final Align align;
	private final String backgroundColor;
	private final String borderColor;
	private final Integer borderRadius;
	private final Integer borderWidth;
	private final Boolean enabled;
	private final Boolean floating;
	private final Map<String, String> itemHiddenStyle;
	private final Map<String, String> itemHoverStyle;
	private final Map<String, String> itemStyle;
	private final Integer itemWidth;
	private final Layout layout;
	
	// TODO: not supported yet
	// labelFormatter;

	private final Integer lineHeight;
	private final Integer margin;
	private final Boolean reversed;
	private final Boolean shadow;
	private final Map<String, String> style;
	private final Integer symbolPadding;
	private final Integer symbolWidth;
	private final VerticalAlign verticalAlign;
	private final Integer width;
	private final Integer x;
	private final Integer y;

	private Legend (Builder builder) {
		
		this.align = builder.align;
		this.backgroundColor = builder.backgroundColor;
		this.borderColor = builder.borderColor;
		this.borderRadius = builder.borderRadius;
		this.borderWidth = builder.borderWidth;
		this.enabled = builder.enabled;
		this.floating = builder.floating;
		this.itemHiddenStyle = builder.itemHiddenStyle;
		this.itemHoverStyle = builder.itemHoverStyle;
		this.itemStyle = builder.itemStyle;
		this.itemWidth = builder.itemWidth;
		this.layout = builder.layout;
		this.lineHeight = builder.lineHeight;
		this.margin = builder.margin;
		this.reversed = builder.reversed;
		this.shadow = builder.shadow;
		this.style = builder.style;
		this.symbolPadding = builder.symbolPadding;
		this.symbolWidth = builder.symbolWidth;
		this.verticalAlign = builder.verticalAlign;
		this.width = builder.width;
		this.x = builder.x;
		this.y = builder.y;
	}

	public Align getAlign() {
		return align;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Integer getBorderRadius() {
		return borderRadius;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public Boolean getFloating() {
		return floating;
	}

	public Map<String, String> getItemHiddenStyle() {
		return itemHiddenStyle;
	}

	public Map<String, String> getItemHoverStyle() {
		return itemHoverStyle;
	}

	public Map<String, String> getItemStyle() {
		return itemStyle;
	}

	public Integer getItemWidth() {
		return itemWidth;
	}

	public Layout getLayout() {
		return layout;
	}

	public Integer getLineHeight() {
		return lineHeight;
	}

	public Integer getMargin() {
		return margin;
	}

	public Boolean getReversed() {
		return reversed;
	}

	public Boolean getShadow() {
		return shadow;
	}

	public Map<String, String> getStyle() {
		return style;
	}

	public Integer getSymbolPadding() {
		return symbolPadding;
	}

	public Integer getSymbolWidth() {
		return symbolWidth;
	}

	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	public Integer getWidth() {
		return width;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}



	public static class Builder {
		// optional
		private Align align = Align.center;
		private String backgroundColor;
		private String borderColor = "#909090";
		private Integer borderRadius = 5;
		private Integer borderWidth = 1;
		private Boolean enabled = Boolean.TRUE;
		private Boolean floating = Boolean.FALSE;
		private Map<String, String> itemHiddenStyle;
		private Map<String, String> itemHoverStyle;
		private Map<String, String> itemStyle;
		private Integer itemWidth = null;
		private Layout layout = Layout.horizontal;
		private Integer lineHeight = 16;
		private Integer margin = 15;
		private Boolean reversed = Boolean.FALSE;
		private Boolean shadow = Boolean.FALSE;
		private Map<String, String> style;
		private Integer symbolPadding = 5;
		private Integer symbolWidth = 30;
		private VerticalAlign verticalAlign = VerticalAlign.bottom;
		private Integer width = null;
		private Integer x = 15;
		private Integer y = 0;

		public Builder() {
		}

		public Builder align(Align align) {
			this.align = align;
			return this;
		}

		public Builder backgroundColor(String backgroundColor) {
			this.backgroundColor = backgroundColor;
			return this;
		}

		public Builder borderColor(String borderColor) {
			this.borderColor = borderColor;
			return this;
		}

		public Builder borderRadius(Integer borderRadius) {
			this.borderRadius = borderRadius;
			return this;
		}

		public Builder borderWidth(Integer borderWidth) {
			this.borderWidth = borderWidth;
			return this;
		}

		public Builder enabled(Boolean enabled) {
			this.enabled = enabled;
			return this;
		}

		public Builder floating(Boolean floating) {
			this.floating = floating;
			return this;
		}

		public Builder itemHiddenStyle(Map<String, String> itemHiddenStyle) {
			this.itemHiddenStyle = itemHiddenStyle;
			return this;
		}

		public Builder itemHoverStyle(Map<String, String> itemHoverStyle) {
			this.itemHoverStyle = itemHoverStyle;
			return this;
		}

		public Builder itemStyle(Map<String, String> itemStyle) {
			this.itemStyle = itemStyle;
			return this;
		}

		public Builder itemWidth(Integer itemWidth) {
			this.itemWidth = itemWidth;
			return this;
		}

		public Builder layout(Layout layout) {
			this.layout = layout;
			return this;
		}

		public Builder lineHeight(Integer lineHeight) {
			this.lineHeight = lineHeight;
			return this;
		}

		public Builder margin(Integer margin) {
			this.margin = margin;
			return this;
		}

		public Builder reversed(Boolean reversed) {
			this.reversed = reversed;
			return this;
		}
		
		public Builder shadow(Boolean shadow) {
			this.shadow = shadow;
			return this;
		}

		public Builder style(Map<String, String> style) {
			this.style = style;
			return this;
		}

		public Builder symbolPadding(Integer symbolPadding) {
			this.symbolPadding = symbolPadding;
			return this;
		}

		public Builder symbolWidth(Integer symbolWidth) {
			this.symbolWidth = symbolWidth;
			return this;
		}

		public Builder verticalAlign(VerticalAlign verticalAlign) {
			this.verticalAlign = verticalAlign;
			return this;
		}

		public Builder width(Integer width) {
			this.width = width;
			return this;
		}

		public Builder x(Integer x) {
			this.x = x;
			return this;
		}

		public Builder y(Integer y) {
			this.y = y;
			return this;
		}

		public Legend build() {
			return new Legend (this);
		}
	}
}