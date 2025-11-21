package com.example.Day1JavaMaven;

public class Class1 implements Interface1,Interface2{

	@Override
	public void sayHello() {
		Interface1.super.sayHello();
		System.out.println("Hellooooo");
		
	}
	
	
}

