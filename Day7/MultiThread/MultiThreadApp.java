package com.example.Day7.MultiThread;

public class MultiThreadApp {
	
	
	
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread());
//		Thread thread = Thread.currentThread();
//		System.out.println(thread.getName());
//		
//		System.out.println(thread.getId());
//		System.out.println(thread.getPriority());
//		System.out.println(thread.getState());
//		System.out.println(thread.isAlive());
//		System.out.println(thread.isDaemon());
//		System.out.println(thread.isInterrupted());
		
		Thread t1=new Thread("thread1");
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		
		
	}

	

}
