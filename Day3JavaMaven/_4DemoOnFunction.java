package com.example.Day3JavaMaven;

import java.lang.reflect.Array;
import java.util.function.Function;

import com.example.Day2JavaMaven.Employee;

public class _4DemoOnFunction {

	public static void main(String[] args) {
		Function<Integer,Integer>squareFunction=(num)->num*num;
		int arr[]= {3,2,5,7,1,9,12};
		for(int i=0;i<arr.length;i++)
			System.out.println(squareFunction.apply(arr[i]));
		
		Employee[] empArr = {
	            new Employee("Jagan",12, 65000),
	            new Employee("Anirudha",8, 70000),
	            new Employee("Bharghav",17, 60000),
	            new Employee("Pratheek",34,68000),
	            new Employee("Amavase",10,70000),
	            new Employee("Aadash",1,40000),
	            new Employee("Janani",22,50000)
	        };
		Function<Employee, String>upperCaseFunction=(e)-> e.getEmpName().toUpperCase();	
		for(Employee e1:empArr)
			System.out.println(upperCaseFunction.apply(e1));
		
		Function<Integer,Integer>add20=(num)->num+20;
		System.out.println(squareFunction.andThen(add20).apply(4));
		
		
	}

}
