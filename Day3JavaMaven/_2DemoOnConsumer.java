package com.example.Day3JavaMaven;

import java.util.Arrays;
import java.util.function.Consumer;

import com.example.Day2JavaMaven.Employee;

public class _2DemoOnConsumer {

	public static void main(String[] args) {
		Consumer<Integer>squareConsumer=(num1)->{
			System.out.println(num1*num1);
		};
		squareConsumer.accept(5);
		
		Consumer<Integer[]>sortConsumer=(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		};
		Integer[] arr= {21,432,54,32,3};
		sortConsumer.accept(arr);
		
		Employee[] empArr = {
	            new Employee("Jagan",12, 65000),
	            new Employee("Anirudha",8, 70000),
	            new Employee("Bharghav",17, 60000),
	            new Employee("Pratheek",34,68000),
	            new Employee("Amavase",10,70000),
	            new Employee("Aadash",1,40000),
	            new Employee("Janani",22,50000)
	        };
		Consumer<Employee[]>printEmpl=(empA)->{
			for(Employee e:empA)
			System.out.println(e.getEmpName());
		};
		printEmpl.accept(empArr);
	}

}
