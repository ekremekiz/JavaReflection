package com.project.reflection001;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {
	public static void main(String[] args) {
		try {
			Class calisan = Class.forName("com.project.reflection001.Calisan");
			Constructor[] constructors = calisan.getConstructors();
			Constructor[] declaredConstructors = calisan.getDeclaredConstructors();
			
			Field[] fields = calisan.getFields();
			Field[] declaredFields = calisan.getDeclaredFields();
			
			Method[] methods = calisan.getMethods();
			Method[] declaredMethods = calisan.getDeclaredMethods();
			
			for (Constructor c : constructors) {
				System.out.println("Constructors : " + c.getName());
			}
			for (Constructor c : declaredConstructors) {
				System.out.println("Declared Constructors : " + c.getName());
			}
			for (Field f : fields) {
				System.out.println("Fields : " + f.getName());
			}
			for (Field f : declaredFields) {
				System.out.println("Declared Fields : " + f.getName());
			}
			for (Method m : methods) {
				System.out.println("Methods : " + m.getName());
			}	
			for (Method m : declaredMethods) {
				System.out.println("Declared Methods : " + m.getName());
			}
			
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
