package com.example.Day5JavaMaven;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(213,"Anirudha",23,92,"Bengaluru"));
		studentList.add(new Student(211,"Swathi",20,32,"Ahemadabad"));
		studentList.add(new Student(214,"Nithya",22,72,"Kolkata"));
		studentList.add(new Student(210,"Krishna",23,52,"Delhi"));
		studentList.add(new Student(212,"Chandrakala",24,82,"Chennai"));
		
		studentList.add(new Student(215,"Anirudha",23,91,"Bengaluru"));
		studentList.add(new Student(216,"Swathi",20,31,"Ahemadabad"));
		studentList.add(new Student(217,"Sachin",22,71,"Kolkata"));
		studentList.add(new Student(218,"Krishna",23,51,"Delhi"));
		studentList.add(new Student(219,"Pushpa",24,81,"Chennai"));
		
		studentList.add(new Student(220,"Shwetha",23,90,"Bengaluru"));
		studentList.add(new Student(221,"Gnanesh",20,30,"Ahemadabad"));
		studentList.add(new Student(224,"Sachin",22,70,"Kolkata"));
		studentList.add(new Student(226,"Pooja",23,50,"Delhi"));
		studentList.add(new Student(222,"Chandrakala",24,80,"Chennai"));
		
//		Collections.sort(studentList);
//		for(Student name:studentList)
//			System.out.println(name);
//		 
		studentList.sort(new CityComparator().thenComparing(new NameComparator()));
		for(Student name:studentList)
			System.out.println(name);
	}

}
