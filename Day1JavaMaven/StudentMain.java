package com.example.Day1JavaMaven;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 =new Student(123,"Sanjay",98);
		Student.College c1 =s1. new College("abc college","Bengaluru",12344);
		
		Student s2 =new Student(134,"Ajay",90);
		Student.College c2 =s2. new College("xyz college","Bengaluru",87932);

	}

}
