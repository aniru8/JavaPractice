package com.example.Day2JavaMaven;


//Lambda Function Calculator and Mycalculator
public class MyCalculator {
	public static void main(String[] args) {
//		Calculator ca = (int a, int b)-> a+b;
//		System.out.println(ca.add(2, 6));
		
//		Calculator cs=(int a,int b)-> System.out.println(a-b);
//		cs.sub(22, 20);
		
//		Calculator cm=()->{
//			int a=89,b=4;
//			System.out.println(a*b);
//		};
//		cm.mul();
		
		Calculator cd=()->{
			int a=5,b=3;
			return((float)a/b);
		};
		System.out.println(cd.div());
		
	}

}
