package com.example.Day6Stream_DS;

public class StackUsingArrayImpl {
	
	private static int[] nums=new int[10];
	private static int top=-1;
	
	public static boolean isEmpty() {
		return top==-1;
	}
	
	public static boolean isFull() {
		return top==10;
	}
	
	public static void push(int ele) {
		if(isFull())
			System.out.println("Stack Overflow");
		else 
			nums[++top]=ele;
	}
	
	public static void pop() {
		if(isEmpty())
			System.out.println("Stack Underflow");
		else
			System.out.println(nums[top--]);
	}
	
	public static void display() {
		for(int i:nums)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		display();
		pop();
		display();
	}

}
