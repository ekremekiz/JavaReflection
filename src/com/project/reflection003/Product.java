package com.project.reflection003;

import java.util.ArrayList;
import java.util.List;

public class Product extends ProductBase {
	
	private String productName;
	private String category;
	private Double price;
	private List<String> parts = new ArrayList<String>();
	
	public Double discount(Double ratio) {
		
		return price*100/ratio;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the parts
	 */
	public List<String> getParts() {
		return parts;
	}

	/**
	 * @param parts the parts to set
	 */
	public void setParts(List<String> parts) {
		this.parts = parts;
	}
	
	public Product() {
		
		
	}

	/**
	 * @param productName
	 * @param category
	 * @param price
	 * @param parts
	 */
	public Product(String productName, String category, Double price, List<String> parts) {
		super();
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.parts = parts;
	}
	
	public String toString() {
		
		return "Product{" +
		"id = " + super.getId() + "\n" +
		"productName = " + productName + "\n" +
		"category = " + category + "\n" +
		"price = " + price + "\n" +
		"parts = " + parts +
		"}";
	}
	
}
