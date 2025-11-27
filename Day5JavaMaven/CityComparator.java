package com.example.Day5JavaMaven;

import java.util.Comparator;

public class CityComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}

}
