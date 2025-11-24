package com.example.Day2JavaMaven;

public class MyName {

	public static void main(String[] args) {
//		Name n=(String name)->System.out.println(name);
//		n.printName("Anirudha");
//	};
//	Name ni=(String str)->{
//		System.out.println(new StringBuffer(str).reverse().toString());
//	};
//	ni.stringReverse("Anirudha");
		String str1[]= {"swapna","amit","raj"};
		Name n=(String[] str)->{
			int length[]=new int[str.length];
			for (int i=0;i<str[i].length();i++) {
				length[i]=str[i].length();
			}
			return length;
		};
		n.findLength(str1);
}
}