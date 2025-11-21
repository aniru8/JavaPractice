package com.example.Day1JavaMaven;

public class Calculator implements ScientificCalculatorInterface {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public int substract(int a,int b) {
		return a-b;
	}
	public int substract(int a,int b,int c) {
		return a-b-c;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public float substract(float a, float b) {
		return a-b;
	}
	public void add(long l,double d) {
		System.out.println(l+d);
	}
	public void add(double d,long l) {
		System.out.println(l+d);
	}
	public void add(String s1,String s2) {
		System.out.println(s1+s2);
	}
	
	@Override
	public double power(double m, double n) {
		return Math.pow(m, n);
	}
	@Override
	public double squareRoot(double m) {
		return Math.sqrt(m);
	}
	@Override
	public double logValue(double m) {
		return Math.log(m);
	}
	
//	public void add(ComplexNumbers c1,ComplexNumbers c2) {
//		ComplexNumbers c3= new ComplexNumbers(0, 0);
//		c3.real=c1.real+c2.real;
//		c3.imag=c1.imag+c2.imag;
//		System.out.println(c3.real+"+i"+c3.imag);
//	}
	
	public static void main(String[] args) {
		Calculator ca=new Calculator();
		ca.add(394890571, 3.0);
		
		//System.out.println(ca.add(394890571, 3.0));
		Calculator c1=new Calculator();
		Calculator c2=new Calculator();
		
	}
	

}