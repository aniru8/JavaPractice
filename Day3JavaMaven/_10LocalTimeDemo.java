package com.example.Day3JavaMaven;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _10LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalTime t1= LocalTime.of(9, 30);
		System.out.println(t1);
		
		LocalTime t2=LocalTime.of(22, 13, 10);
		System.out.println(t2);
		
		LocalTime t3=LocalTime.of(18, 23, 45, 55);
		System.out.println(t3);
		
		//use isBefore and isAfter
		//code for comparing two times
		
		//converting string to localtime using parse method
		String strTime= "11:43:53";
		LocalTime convertedTime= LocalTime.parse(strTime);
		System.out.println(convertedTime);
		
		//converting to specific format
		DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss a");
		String formattedTime=time.format(df);
		System.out.println(formattedTime);
		
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);
		
	}

}
