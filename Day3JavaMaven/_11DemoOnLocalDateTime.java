package com.example.Day3JavaMaven;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _11DemoOnLocalDateTime {
		public static void main(String[] args) {
			LocalDateTime dateTime=LocalDateTime.now();
			System.out.println(dateTime);
			
			System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
			
			//string in the format yyyy-MM-dd hh:mm:sec a
			//given timeDate is 2024-11-22 15:45:40 a;
			
			DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:sec a");
			LocalDateTime lt=LocalDateTime.of(2024, 11,22,15,45,40);
			String str=df.format(lt);
			System.out.println(str);
		}
}
