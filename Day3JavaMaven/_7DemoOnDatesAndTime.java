package com.example.Day3JavaMaven;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _7DemoOnDatesAndTime {

	public static void main(String[] args) throws ParseException {
		Date currentDate= new Date();
		System.out.println(currentDate);
		
		long ms =System.currentTimeMillis();
		System.out.println(ms);
		Date currentDateOfMS=new Date(ms);
		System.out.println(currentDateOfMS);
		
		long msl=9578387509476l;
		Date myDate=new Date(msl);
		System.out.println(myDate);
		
		Date newDate= new Date(2003,8,7);
		System.out.println(newDate);
		
		System.out.println(currentDate.getDate());
		
		Date date2=new Date(2025,01,24);
		Date date1=new Date(2003,8,8);
		System.out.println(date1.after(date2));
		
		String str="24-11-2025";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(currentDate));
		
		
		Date d=sdf.parse(str);
		System.out.println(d);
		
		Date dob=new Date (2003-1900,07,8);
		Date today = new Date();
		int ageInYears=today.getYear()-dob.getYear();
		System.out.println(ageInYears + " Years");
		
		System.out.println(today.toString());
		
	}

}
