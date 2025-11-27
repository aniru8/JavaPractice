package com.example.Day5JavaMaven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoOnArrayList {

	public static void main(String[] args) {
//		ArrayList aList=new ArrayList();
//		aList.add(56);
//		aList.add("Anirudha");
//		aList.add(true);
//		aList.add(89.99);
//		Person p=new Person("Ani",23);
//		aList.add(p);
//		System.out.println(aList);
//		System.out.println(aList.get(2));
//		aList.add(56);
//		aList.add("Anirudha");
//		aList.add(true);
//		aList.add(89.99);
//		aList.add(p);
//		aList.add(null);
//		System.out.println(aList);
		
		
		//with generics
		
		ArrayList<String> namesList=new ArrayList<String>();
		namesList.add("Amith");
		namesList.add("Srinivas");
		namesList.add("Preethi");
		
		System.out.println(namesList);
		for(String name: namesList) {
			System.out.println(name);
		}
		System.out.println("Using Iterator");
		Iterator<String> itr=namesList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Using list Iterator");
		ListIterator<String> litr=namesList.listIterator();
		System.out.println("Forward");
		while(litr.hasNext())
			System.out.println(litr.next());
		System.out.println("Backward");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		
		System.out.println(namesList.contains("Preethi"));
		
		System.out.println("For each");
		namesList.forEach(name->System.out.println(name));//consumer using lambda
		namesList.forEach(System.out::println);//consumer using mr
//		System.out.println(namesList.remove(2)+" got removed.");
		
		//array to list-asList list to array-toArray
		Integer[] arr= {5,1,4,3,56,2};
		Integer[] brr= {9,66,31,7,4};
		List<Integer> numList1=new ArrayList (Arrays.asList(arr));
		List<Integer> numList2=new ArrayList (Arrays.asList(brr));
		numList1.retainAll(numList2);
		System.out.println(numList1);
		
		System.out.println(namesList);
		Collections.sort(namesList);
		System.out.println(namesList);
		
		ArrayList<String> cloneNamesList=(ArrayList<String>)namesList.clone();
		System.out.println(namesList.hashCode());
		System.out.println(cloneNamesList.hashCode());
		
		cloneNamesList.add("Anirudha");
		System.out.println(cloneNamesList);
		System.out.println(namesList.hashCode());
		System.out.println(cloneNamesList.hashCode());
		
		
		
		
	}
		
}
