package com.example.Day7.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChefExecutorService extends Thread{
	
	private String order;

	public ChefExecutorService(String order) {
		this.order=order;
	}
	
	public void run() {
		System.out.println(getName()+" is preparing "+order);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(getName()+" got interrupted");
		}
		System.out.println(getName()+" served "+order);
	}
	
	public static void main(String[] args) {
		
		ExecutorService manager =Executors.newFixedThreadPool(4);
		
		String[] menu= {"Veena Stores Masala Dose","Mallige Idly","Uddina Vade",
				"Davanagere Benne Masale","Fried Rice","Masala puri","Gobi","Bidadi Thatte Idly","DBC"};
		
		for(String item:menu) {
			ChefExecutorService chefThread=new ChefExecutorService(item);
			manager.submit(chefThread);
	}
		manager.shutdown();
   }
}