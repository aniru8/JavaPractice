package com.example.Day4.DesignPatterns;

public class MainDBConnection {

	public static void main(String[] args) {
		//Singleton
//		DBConnection conn1= DBConnection.getInstance();
//		System.out.println(conn1.hashCode());
//		DBConnection conn2=DBConnection.getInstance();
//		System.out.println(conn2.hashCode());
//		DBConnection conn3=DBConnection.getInstance();
//		System.out.println(conn3.hashCode());

		//Factory pattern
//		Shape s= ShapeFactory.getShape("square");
//		s.draw();
//		Shape s1=ShapeFactory.getShape("circle");
//		s.draw();
		
		//Abstract Factory Pattern
//		GUIFactory gui =new WinFactory();
//		Button button =gui.createButton();
//		CheckBox checkBox=gui.createCheckBox();
//		button.click();
//		checkBox.check();
//		
//		System.out.println();
//		
//		GUIFactory guii=new MacFactory();
//		Button button1=guii.createButton();
//		CheckBox checkBox1=guii.createCheckBox();
//		button1.click();
//		checkBox1.check();
		
		//Builder pattern
//		Pizza pizza=new Pizza.Builder("Large")
//				.cheese(true)
//				.olives(false)
//				.build();
//		System.out.println(pizza);
		
		//Template method design pattern
//		DrinkMaker tea =new TeaMaker();
//		tea.prepareDrink();
//		System.out.println();
//		DrinkMaker coffee=new CoffeeMaker();
//		coffee.prepareDrink();
		
		//Structural Pattern-Bridge pattern
//		Video youtubeHd=new YouTube(new HDProcessing());
//		youtubeHd.playVideo();
//		
//		Video youtube4k=new YouTube(new FourKQuality());
//		youtube4k.playVideo();
		
		//Proxy pattern
		Payment netBanking = new NetBanking();
		netBanking.pay(50000);
		
		Payment upi = new UpiPayment();
		upi.pay(3000);
		
		Payment cash = new CashPayment();
		cash.pay(10);
		
		
		
		
		
		
		
		
		
		
		
	}

}
