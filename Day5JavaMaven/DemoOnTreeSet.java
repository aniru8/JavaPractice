package com.example.Day5JavaMaven;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
 
public class DemoOnTreeSet {
 
	public static void main(String[] args) {
		TreeSet<Integer> treeSet =  new TreeSet<Integer>();
		treeSet.add(34);
		treeSet.add(12);
		treeSet.add(90);
		treeSet.add(11);
		System.out.println(treeSet);
		
		//methods
		System.out.println(treeSet.ceiling(89)); //return ceiling value nearest to 89 gives 90
		System.out.println(treeSet.floor(89));  //returns floor value nearest to 89 its 39
		
		//iterator
		Iterator<Integer> itr = treeSet.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		System.out.println(treeSet.headSet(90));  // returns what's all ahead of 90 -> [11,12,34]
		System.out.println(treeSet.tailSet(90));  // gives same 90 itself bcz its at last and has no elements after it
		
		
		TreeSet<Student> studentTree= new TreeSet<Student>();
		studentTree.add(new Student(213,"Anirudha",23,92,"Bengaluru"));
		studentTree.add(new Student(211,"Swathi",20,32,"Ahemadabad"));
		studentTree.add(new Student(214,"Nithya",22,72,"Kolkata"));
		studentTree.add(new Student(210,"Krishna",23,52,"Delhi"));
		studentTree.add(new Student(212,"Chandrakala",24,82,"Chennai"));
		for(Student s:studentTree)
		System.out.println(s);
		
 
	}
 
}
 
 