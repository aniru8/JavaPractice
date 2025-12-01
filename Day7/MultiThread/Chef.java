package com.example.Day7.MultiThread;

//Implement a scenario that uses multithreading assuming no. of checks as threads and the chefs to complete the orders of the restaurant

public class Chef extends Thread{

	private final String[] orders;
	public Chef(String... orders) {
		this.orders=orders;
	}
	@Override
	public void run() {
		for(String item: orders) {
			System.out.println(getName()+" is preparing "+item);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName()+" got interrupted");
			}
			System.out.println(getName()+" served "+item);
		}
	}
	public static void main(String[] args) {
		Chef c1=new Chef("Veena Stores Masala Dose","Mallige Idly","Uddina Vade");
		Chef c2=new Chef("Davanagere Benne Masale","Fried Rice");
		Chef c3=new Chef("Masala puri","Gobi");
		Chef c4=new Chef("Bidadi Thatte Idly","DBC");
		
		c1.setName("Chef-1");
		c2.setName("Chef-2");
		c3.setName("Chef-3");
		c4.setName("Chef-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
	}

}
