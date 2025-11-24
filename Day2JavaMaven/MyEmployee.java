package com.example.Day2JavaMaven;

import java.util.Arrays;

public class MyEmployee {

	public static void main(String[] args) {
		Employee[] empArr = {
	            new Employee("Jagan",12, 65000),
	            new Employee("Anirudha",8, 70000),
	            new Employee("Bharghav",17, 60000),
	            new Employee("Pratheek",34,68000),
	            new Employee("Amavase",10,70000),
	            new Employee("Aadash",1,40000),
	            new Employee("Janani",22,50000)
	        };
 
	        // Lambda implementing EmployeeComparator
//	        EmployeeInterface comparator = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
 
	        // Use Arrays.sort with a lambda that delegates to our comparator
//	        Arrays.sort(empArr, comparator::compare);
 
			Arrays.sort(empArr,(e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));
	        System.out.println("Sorted by salary ascending:");
	        for (Employee e : empArr) {
	            System.out.println(e);
	        }
	 }

}
