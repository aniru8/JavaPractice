package com.example.Day3JavaMaven;

import java.util.function.Predicate;

import com.example.Day2JavaMaven.Employee;

public class _3DemoOnPredicate {

	public static void main(String[] args) {
		Predicate<Integer>isEven=(n)->n%2==0;
		System.out.println(isEven.test(55));
		
		if(isEven.test(35))
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		System.out.println(isEven.test(88)?"Even":"Odd");
		
		Predicate<String> checkLength=(str)->str.length()>7;
		System.out.println(checkLength.test("Ani"));
			
		Employee[] empArr = {
	            new Employee("Jagan",12, 65000),
	            new Employee("Anirudha",8, 70000),
	            new Employee("Bharghav",17, 60000),
	            new Employee("Pratheek",34,68000),
	            new Employee("Amavase",10,70000),
	            new Employee("Aadash",1,40000),
	            new Employee("Janani",22,50000)
	        };
		Predicate<Employee>checkSalary=(emp)->emp.getSalary()>=60000;
		for(Employee e:empArr)
			if(checkSalary.test(e))
				System.out.println(e);

	}

}
