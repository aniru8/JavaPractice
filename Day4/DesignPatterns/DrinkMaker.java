package com.example.Day4.DesignPatterns;

public abstract class DrinkMaker {
	public final void prepareDrink() {
		boilWater();
		makeDrink();
		addExtras();
		serve();
		
	}
	public void boilWater() {
		System.out.println("Water Boiled");
	}
	public void serve() {
		System.out.println("Drink served");
	}
	
	abstract void makeDrink();
	abstract void addExtras();
}