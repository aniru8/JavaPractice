package com.example.Day2JavaMaven;

//Array topic-Fruits
public class ArrayDemo {

	public static void main(String[] args) {
		Fruits fruitsArr[]=new Fruits[5];
		Fruits fruits1=new Fruits("Apple","Red",225.50);
		Fruits fruits2=new Fruits("Mango","Yellow",80.70);
		Fruits fruits3=new Fruits("Grapes","Green",60.35);
		Fruits fruits4=new Fruits("Banana","Yellow",10.25);
		Fruits fruits5=new Fruits("Orange","Orange",20.98);
		
		fruitsArr[0]=fruits1;
		fruitsArr[1]=fruits2;
		fruitsArr[2]=fruits3;
		fruitsArr[3]=fruits4;
		fruitsArr[4]=fruits5;

		for(int i=0;i<fruitsArr.length;i++) {
			System.out.println("Cost per dozen for "+fruitsArr[i].getFruitName()+ " is "+fruitsArr[i].calculateCostPerDozen());
		}
	}

}
