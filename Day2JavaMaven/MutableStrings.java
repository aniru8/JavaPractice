package com.example.Day2JavaMaven;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MutableStrings {

	
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer();
		StringBuffer buff1 = new StringBuffer();
		StringBuilder buff2 = new StringBuilder("Anirudha R Bhat");

		
//		buff.append("Anirudha ");
//		buff.append("Bhargav ");
//		buff.append("Jagan");
//		buff1.append("Anirudha ");
//		buff1.append("Bhargav");
//		buff1.append("Jagan");
//		System.out.println(buff);
//		System.out.println(buff.capacity());
//		System.out.println(buff.compareTo(buff1));
//		
//		System.out.println(buff2.reverse());
//		buff2.replace(7, 9, "*");
//		System.out.println((buff2));
		
		String str="apple,banana,orange,pineapple";
		StringTokenizer tokenizer=new StringTokenizer(str,",") ;
		while(tokenizer.hasMoreTokens())
			System.out.println(tokenizer.nextToken());
		
		StringJoiner sj=new StringJoiner(",");
		sj.add("Aradhya");
		sj.add("Manjula");
		sj.add("Sanjana");
		sj.add("Varshitha");
		System.out.println(sj);
		
		
		
		
		
	}

}
