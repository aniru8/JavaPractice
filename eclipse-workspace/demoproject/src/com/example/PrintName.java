package com.example;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		char choice='y';
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("Anirudha");
			System.out.println("Do you wanna repeat y/n");
			choice =sc.next().charAt(0);
			
		}
		while (choice!='n'); {
			System.out.println("Thank you..!");
		}
	}

}
