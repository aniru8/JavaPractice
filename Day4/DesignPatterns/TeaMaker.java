package com.example.Day4.DesignPatterns;

public class TeaMaker extends DrinkMaker{

	@Override
	void makeDrink() {
		System.out.println("Making a tea");
		
	}

	@Override
	void addExtras() {
		System.out.println("Adding ginger");
		
	}
	

}
