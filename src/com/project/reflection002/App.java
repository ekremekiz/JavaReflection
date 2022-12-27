package com.project.reflection002;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {
	public static void main(String[] args) throws Exception {
		Test obj = new Test();
		
		Class cls = obj.getClass();
		
		System.out.println("The Name of Class is " + cls.getName());
		
		Constructor constructors = cls.getConstructor();
		
		System.out.println("The Name of Constructors is " + constructors.getName());
		
		System.out.println("The Public Methods of Class are : ");
		
		Method[] methods = cls.getMethods();
		
		for (Method m : methods)
			System.out.println(m.getName());
		
		Method methodCall1 = cls.getDeclaredMethod("method2", int.class);
		
		methodCall1.invoke(obj, 19);
		
		Field field = cls.getDeclaredField("s");
		
		field.setAccessible(true);
		
		field.set(obj, "JAVA");
		
		Method methodCall2 = cls.getMethod("method1");
		
		methodCall2.invoke(obj);
		
		Method methodCall3 = cls.getDeclaredMethod("method3");
		
		methodCall3.setAccessible(true);
		
		methodCall3.invoke(obj);
	}
}
