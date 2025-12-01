package com.example.Day7.MultiThread;

//Java doesn't support multiple inheritance so thread can be created using two ways runnable and Thread

public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName()+" is running");
		for (int i=1;i<6;i++)
			System.out.println(Thread.currentThread().getName()+" value: "+i);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();

	}

}
