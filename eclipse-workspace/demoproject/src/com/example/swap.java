package com.example;

public class swap {

	public static void main(String[] args) {
		int a=2,b=3;
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		//swaping 3 numbers
		
		int i=2,j=3,k=4;
		
		i=i+j+k;
		j=i-j-k;
		k=i-j-k;
		i=i-j-k;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
