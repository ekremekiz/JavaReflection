package com.project.reflection002;

class Test {

	private String s;
	
	// 1. Constructors (Public)
	public Test() {
		
		s = "Java Reflection";
	}
	
	// 2. Constructors (No Arguments) 
	public void method1() {
		
		System.out.println("The String is " + s);
	}
	
	// 3. Constructors (int as Arguments)
	public void method2(int n) {
		
		System.out.println("The Number is " + n);
	}
	
	// 4. Constructors (Private Method)
	private void method3() {
		System.out.println("Private Method Invoked!");
	}
}
