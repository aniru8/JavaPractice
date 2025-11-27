package com.example.Day4.JavaMaven;

import java.util.Arrays;

//Container, Student, Pair, Order are generic type used in this main function to execute

public class _1DemoOnGenerics {
	public static <T> void display(T data) {
		System.out.println("Data is "+data);
	}
	public static <T extends Number,U extends Number> void add(T t1,U u1) {
		System.out.println(t1); 
		System.out.println(u1);
		System.out.println(t1.doubleValue()+u1.doubleValue());
	}
	public static void main(String[] args) {
//		Container<String> c1=new  Container<String>();
//		c1.setItem("Anirudha");
//		System.out.println(c1.getItem());
//		
//		Container<Student> c2= new Container<Student>();
//		Student s=new Student();
//		c2.setItem(s);
//		System.out.println(c2.getItem());
//		
//		Container<Integer> c3=new Container<Integer>();
//		c3.setItem(67);
//		System.out.println(c3.getItem());
//		
//		Container<Integer[]> c4=new Container<Integer[]>();
//		Integer[] irr= {45,55,23,56,76};
//		c4.setItem(irr);
//		System.out.println(Arrays.toString(c4.getItem()));

//		Pair<String,Double> p1=new Pair<String,Double>("Distance in km",7.5);
//		System.out.println(p1);
//		
//		Pair<String,Double> p2=new Pair<String,Double>("weight in kg",6.5);
//		System.out.println(p2);
//		
//		Pair<Integer,String> p3=new Pair<Integer,String>(213,"Laptop");
//		System.out.println(p3);
//		
//		Student s=new Student(234,"Amith","Java");
//		Pair<Integer, Student> p4=new Pair<Integer, Student>(1,s);
//		System.out.println(p4);
//		System.out.println(p4.getValue());
		
		Order<String> o1=new Order<String>("Laptop");
		Order<String> o2=new Order<String>("Moblie");
		System.out.println(o1);
		System.out.println(o2);
		
		Item item =new Item(12,"Laptop",90000);
		Order<Item> o3=new Order<Item>(item);
		System.out.println(o3);
		
		Item[] itemArr = new Item[3];
		itemArr[0] = new Item(1,"Laptop", 1200.00);
        itemArr[1] = new Item(2,"Mouse", 25.50);
        itemArr[2] = new Item(3,"Keyboard", 45.00);
        
        Order<Item[]> o4=new Order<Item[]>(itemArr);
		System.out.println(Arrays.toString(o4.getItem()));
		
		Integer nums[]= {1,2,3,4,5,6};
		String strs[]= {"str1","str2","str3","str4"};
		ArrayPrinter<Integer> ap1=new ArrayPrinter<>(nums);
		ArrayPrinter<String> ap2=new ArrayPrinter<>(strs);
		System.out.println(ap1);
		System.out.println(ap2);
		
		display("Shanthi");
		display(34);
		display(true);
		Item it=new Item(11,"Mobile",300030);
		display(it);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
