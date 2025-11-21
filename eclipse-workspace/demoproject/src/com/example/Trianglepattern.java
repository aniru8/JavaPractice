package com.example;

public class Trianglepattern {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++) {
			for(int k=1;k<=40-i;k++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println(" ");
		}
		for (i=3;i>=1;i--) {
			for(int k=1;k<=40-i;k++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println(" ");
		}
	}

}
