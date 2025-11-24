package com.example.Day2JavaMaven;

//Custom Exception-Person,AgeNotSufficientException.
public class PersonMain {

	public static void main(String[] args) throws AgeNotSufficientException {
		Person p= new Person("Anirudha",12,2);
		System.out.println(p);
		p.checkElegibility();
		
		System.out.println("Application closed");
		

	}

}
