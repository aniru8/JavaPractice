package com.example;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		int a,b;
		char op;
		Scanner sc =new Scanner(System.in);
		System.out.println("First number: ");
		a= sc.nextInt();
		System.out.println("Second number");
		b=sc.nextInt();
		System.out.println("Enter an arithmetic operator ");
		op=sc.next().charAt(0);
		switch (op) {
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		default: 
			System.out.println("Not a vaild operation");
	}

}
}