package com.project.reflection004;

public abstract class Shape {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void reverse() {
		
		System.out.println(name + " is reverse...");
	}
	
}
