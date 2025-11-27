package com.example.Day4.DesignPatterns;

public class DBConnection {
	private static DBConnection instance;
	private DBConnection() {
		System.out.println("Instance Created");
	}
	
	public static DBConnection getInstance() {
		if(instance!=null)
			return instance;
		else
			return instance= new DBConnection();
	}
}
