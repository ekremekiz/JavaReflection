package com.project.reflection003;

public class ProductBase {
	
	private long id;
		
	public ProductBase() {
		
		
	}
	
	public ProductBase(long id) {
		
		this.id = id;
	}
	
	public Long getId() {
		
		return id;
	}
	
	public void setId(Long id) {
		
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "ProductBase {" + "id = " + id +"}";
	}
	

}
