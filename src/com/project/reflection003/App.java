package com.project.reflection003;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws Exception {
		
		Product productClass = new Product();
		
		String classPath = productClass.getClass().toString().split(" ")[1];
		System.out.println(classPath);
		
		Class cls = Class.forName(classPath);
		
		Object obj = cls.newInstance();
		
		Product product1 = (Product) obj;
		
		product1.getCategory();
		product1.getParts();
		product1.getPrice();
		product1.getProductName();
		product1.getId();
		
		product1.setCategory("Gamer");
		product1.setParts(new ArrayList<String>());
		product1.setPrice(100D);
		product1.setProductName("Computer");
		product1.setId(10L);
		
		System.out.println("\n*** Invoke Methods (setCategory, getCategory) ***");
		Class[] cArgs = new Class[1];
		cArgs[0] = String.class;
		
		Method method1 = cls.getMethod("setCategory", cArgs);
		method1.invoke(obj, "Business");
		
		Method method2 = cls.getMethod("getCategory");
		System.out.println(method2.invoke(obj));
		
		Method[] allMethods = cls.getDeclaredMethods();
		System.out.println("\n*** All Methods ***");
		for (Method method : allMethods)
			System.out.println(method.toString());
		
		Field[] allFields = cls.getDeclaredFields();
		System.out.println("\n*** All Fields ***");
		for (Field field : allFields)
			System.out.println(field.toString());
		
		System.out.println("\n*** The Superclass of Product");
		System.out.println(cls.getSuperclass());
	}
}
