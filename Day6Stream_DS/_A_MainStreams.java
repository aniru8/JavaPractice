package com.example.Day6Stream_DS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _A_MainStreams {
	public static void main(String[] args) {
		
		Integer arr[]= {23,43,64,12,8,45,34,78,16,78,91,72};
		//Few important Terminal operators
		Arrays.stream(arr).forEach(System.out::println);//prints the array elements in separate lines
		List<Integer>iList=Arrays.stream(arr).collect(Collectors.toList());//prints the array in a single line like list
		System.out.println(iList);
		Integer min=Arrays.stream(arr).min((a,b)->a-b).get();//minimum value in the array
		System.out.println(min);
		min=Arrays.stream(arr).min(Integer::compare).get();//minimum value in the array
		System.out.println(min);
		
		long count=Arrays.stream(arr).count();//number of elements in the array
		System.out.println(count);
		
		//sum of array using reduce
		int sum=Arrays.stream(arr).reduce(0, (a,b)->a+b);
		System.out.println("Sum of the elements in the array: "+sum);
		System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b));//minimum value in the array
		System.out.println(Arrays.stream(arr).reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b));//maximum value in the array
		
		/*Intermediate operations, 
		consumers can't be intermediate operation as it doesn't return anything we can use functions, predicate and supplier*/
		//1.filter
		Stream.of(arr).filter(num->num%2==0).forEach(System.out::println);
		//2.Map
		Stream.of(arr).map(num->num+10).forEach(System.out::println);
		//3.Limit and skip
		Stream.of(arr).limit(5).forEach(System.out::println);
		Stream.of(arr).skip(5).forEach(System.out::println);
		//4.Distinct
		System.out.println(Stream.of(arr).distinct().count());
		System.out.println();
		//5.anyMatch
		System.out.println(Stream.of(arr).anyMatch(num->num<25));
		//6.findFirst
		System.out.println(Stream.of(arr).filter(num->num>25).findFirst().get());

		Integer[] nums= {23,543,543,654,215,879,569,870,756,26};
		List<Integer>numsList=Arrays.asList(nums);
		numsList.stream().filter(num->num%3==0)//finding 3 multiple, removes duplicate, skips first 2 elements, extracts only 2 elements
		.distinct().skip(2).limit(2).forEach(System.out::println);// prints result
		System.out.println();
		numsList.stream().sorted().forEach(System.out::println);
		numsList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		//Stream of Strings
		String[] names= {"Kaveri","Shimsha","Sharavathi","Netravathi","Seetha","Tunga","Bhadra","Gataprabha","Malaprabha"};
//		Arrays.stream(names).filter(name->name.length()>=5).forEach(System.out::println);
//		Arrays.stream(names).filter(name->name.length()>=5).filter(name->name.startsWith("S")).forEach(System.out::println);
		Arrays.stream(names).sorted().forEach(System.out::println);
		Arrays.stream(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);
				
		//streams of user defined object collection
		Employee emp1 = new Employee(123, "Shanthi", 709000, "Trainer", "Training");
		Employee emp2 = new Employee(124, "Arun", 550000, "Developer", "IT");
		Employee emp3 = new Employee(125, "Meena", 620000, "Analyst", "Business");
		Employee emp4 = new Employee(126, "Ravi", 480000, "Support Engineer", "Customer Support");
		Employee emp5 = new Employee(127, "Priya", 800000, "Manager", "Operations");
		Employee emp6 = new Employee(128, "Karthik", 900000, "Architect", "IT");
		Employee[] empList= {emp1,emp2,emp3,emp4,emp5,emp6};
		
		ArrayList<Employee> eList=new ArrayList<Employee>(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6));
		//eList.stream().filter(emp->emp.getSalary()>650000).forEach(System.out::println);
		eList.stream().filter(emp->emp.getDesg().equals("Manager")).forEach(System.out::println);
		eList.stream().filter(emp->emp.getSalary()>50000).sorted((e1,e2) -> e1.getEmpName().compareTo(e2.getEmpName())).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
