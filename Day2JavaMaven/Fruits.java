package com.example.Day2JavaMaven;

public class Fruits {
	
	private String fruitName;
	private String fruitColor;
	private double fruitPrice;
	
	public Fruits(String fruitName, String fruitColor, double fruitPrice) {
		super();
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
		this.fruitPrice = fruitPrice;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}

	public double getFruitPrice() {
		return fruitPrice;
	}

	public void setFruitPrice(double fruitPrice) {
		this.fruitPrice = fruitPrice;
	}
	
	
	public double calculateCostPerDozen() {
		return this.fruitPrice*12;
	}
	
	
	

}
