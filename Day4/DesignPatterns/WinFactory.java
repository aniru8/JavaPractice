package com.example.Day4.DesignPatterns;

public class WinFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new winButton();
	}
	
	@Override
	public CheckBox createCheckBox() {
		return new winCheckBox();
	}

}
