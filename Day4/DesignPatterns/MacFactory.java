package com.example.Day4.DesignPatterns;

public class MacFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}
	
	@Override
	public CheckBox createCheckBox() {
		return new MacCheckBox();
	}
	

}
