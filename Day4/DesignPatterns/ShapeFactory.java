package com.example.Day4.DesignPatterns;

public class ShapeFactory {
	public static Shape getShape(String type) {
		if(type.equals("circle"))
			return new Circle();
		if (type.equals("square"))
			return new Square();
	return null;
	}
}
