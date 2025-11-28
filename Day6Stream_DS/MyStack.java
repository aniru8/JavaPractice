package com.example.Day6Stream_DS;

import java.util.Scanner;

public class MyStack {
	 private static Node top=null;
	 
	 public static boolean isEmpty() {
		 return top==null;
	 }
	 
	 public static Node createNode() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a value: ");
		 int data=sc.nextInt();
		 return new Node(data);
		 
	 }
	 
	 public static void push() {
		 Node newNode=createNode();
		 if(top==null)
			 top=newNode;
		 else
			 newNode.setNext(top);
		 top=newNode;
		 System.out.println("Value "+newNode.getData()+" added sucessfully");
	 }
	 
	 public static void pop() {
		 if(isEmpty())
			 System.out.println("Stack Underflow");
		else 
		{
			System.out.println(top.getData()+" is poped");
			Node temp=top;
			top=top.getNext();
			temp.setNext(null);
		}
	 }
	 
	 public static void display() {
		 if(isEmpty())
			 System.out.println("Stack Underflow");
		else { 
			Node temp =top;
			while (temp!=null) {
				System.out.print(temp.getData()+"--->");
				temp=temp.getNext();
			}
			System.out.println();
		
		}
	 }
}
