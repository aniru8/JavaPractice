package com.example;

import java.util.Scanner;

public class Checkprime {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++)
			if(num%i==0) {
				count++;
				break;
								
			}
		//System.out.println("Number is not a prime");
		if(count!=0) 
			System.out.println("Number is not a prime");
		else 
				System.out.println("Number is a prime");
		}

	}


