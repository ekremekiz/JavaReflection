package com.project.reflection004;

public class AppForShapeCreaterWithReflection {
	
	public static void main(String[] args) throws Exception {
		
		I i = (I) ShapeCreaterWithReflection.getShape("I");
		i.reverse();
		System.out.println("***********************");
		
		J j = (J) ShapeCreaterWithReflection.getShape("J");
		j.reverse();
		System.out.println("***********************");
		
		T t = (T) ShapeCreaterWithReflection.getShape("T");
		t.reverse();
		System.out.println("***********************");
	}
	
	

}
