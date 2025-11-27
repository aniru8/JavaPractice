package com.example.Day5JavaMaven;

public class AppMain {
	public static void main(String[] args) {
		
		//Immutable class creation
		System.out.println("1.class need to be final"+"\n2.properties need to be final"+"\n3.properties need to get value through constructor"+"\n4.No setters to modify data");
		Person p1=new Person("Anirudha R Bhat",234);
		System.out.println(p1);
	}
}