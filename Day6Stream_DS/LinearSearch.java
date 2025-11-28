package com.example.Day6Stream_DS;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	int arr[]= {18,3,45,23,8,23,87,20,49,13};
	System.out.println("Enter the key element to search: ");
	Scanner sc= new Scanner(System.in);
	int key=sc.nextInt();
	int i=0;
	for(;i<arr.length;i++)
		if(key==arr[i])
		{
			System.out.println("Element found at "+(i+1)+"th position");
			break;
		}
	if(i==arr.length)
			System.out.println("Element not found");
	}
}
