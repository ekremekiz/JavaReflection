package com.project.reflection004;

public class ShapeCreaterWithoutReflection {
	
	public static Shape getShape(String shapeName) {
		
		if (shapeName.equals("I"))
			return new I();
		else if (shapeName.equals("T"))
			return new T();
		else if (shapeName.equals("J"))
			return new J();
		
		
		return null;
		
	}

}
