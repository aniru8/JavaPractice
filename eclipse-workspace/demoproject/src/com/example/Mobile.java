package com.example;

import java.util.Scanner;

public class Mobile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mobileNumber=sc.next();
		if(mobileNumber.matches("[6-9]\\d{9}"))
			System.out.println("valid mobile number");
		else
			System.out.println("Not a vaild mobile number");
	}

}
