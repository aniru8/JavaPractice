package com.example.Day3JavaMaven;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class _5DemoOnStaticMethodReference {
	
	//classname::methodname
	//objname::methodname
	
	static class NumberUtil{
		public static int squareNum(int num) {
			return num*num;
		}
		public static double log(double num) {
			return Math.log(num);
		}
		public static boolean isEven(int num){
			return num%2==0;
		}
//	static class StringUtil{	
//		public static String strLen(String name) {
//			
//		}
	}
	public static void main(String[] args) {
		Function<Integer, Integer>squareFunctionUsingLambda=(num)->NumberUtil.squareNum(num);
		Function<Integer, Integer> squareFunctionUsingMR=NumberUtil::squareNum;
		System.out.println(squareFunctionUsingLambda.apply(6));
		System.out.println(squareFunctionUsingMR.apply(8));
	
		Function<Double, Double> logUsingMR=NumberUtil::log;
		Function<Double,Double> logUsingLambda=(num)->NumberUtil.log(num);
		System.out.println(logUsingLambda.apply(614543153.0));
		System.out.println(logUsingMR.apply(614543153.0));
		
		Predicate<Integer> isEvenUsingLambda=(num)->NumberUtil.isEven(num);
		Predicate<Integer> isEvenUsingMR=NumberUtil::isEven;
		System.out.println(isEvenUsingLambda.test(33));
		System.out.println(isEvenUsingMR.test(14));
		
//		String name="Anirudha";
//		Supplier<String>strLenUsingLambda=()->StringUtil.strLen(name);
	}
  }
