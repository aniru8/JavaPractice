package com.example.Day8.JUnits;

public class JUCalculator {
	
	public int add(int a, int b) {
	return a+b;
	}
	
	public int sub(int a,int b) {
		if(a>b) {
			return a-b;
		}
		return b-a;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	
	public int mod(int a, int b){
		return a%b;
	}
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	
	public int[] checkArrays() {
		int arr[]= {1,2,3,4};
		return arr;
	}
	
		public static void main(String[] args) {
//		Calculator c=new Calculator();
//		System.out.println(c.add(5, 5));
		
		
	}
}