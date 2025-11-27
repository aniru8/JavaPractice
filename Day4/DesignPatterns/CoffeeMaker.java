package com.example.Day4.DesignPatterns;

public class CoffeeMaker extends DrinkMaker{

	@Override
	void makeDrink() {
		System.out.println("Making coffee");
		
	}

	@Override
	void addExtras() {
		System.out.println("Adding sugar");
		
	}

}
