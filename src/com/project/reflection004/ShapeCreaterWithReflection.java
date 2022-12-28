package com.project.reflection004;

public class ShapeCreaterWithReflection {
	
	public static final String PACKAGE_PATH = "com.project.reflection004.";
	
	public static Shape getShape(String shapeName) throws Exception {
		
		Class cls = Class.forName(PACKAGE_PATH + shapeName);
		
		return (Shape) cls.newInstance();
	}

}
