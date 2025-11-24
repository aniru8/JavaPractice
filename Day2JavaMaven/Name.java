package com.example.Day2JavaMaven;

//write a lambda expression to print ur name using a functional interface with a method print name
//Write a lambda to reverse a given string of a FactionalInterface having method stringReverse(String str)
//To check number is even or odd of FunctionalInterface having a method isEven(int num)
//square of every element of an array
//pass an array of string and return the array of lengths

//Name and MyName
@FunctionalInterface
public interface Name {
//	public void printName(String name);
//	public void stringReverse(String str);
	public int[] findLength(String[] str);

}
