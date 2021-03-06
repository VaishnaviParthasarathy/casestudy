package com.target.myRetail.ProductItem;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductItem {
	
	@Id
	@JsonProperty("product_id")
	private String productId;
	private String name;
	@JsonProperty("current_price")
	private Price price;
	
	
	
	public ProductItem() {
		super();
	}
	public ProductItem(String productId, String name, Price price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	
	
	
	

}
