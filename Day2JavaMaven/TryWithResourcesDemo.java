package com.example.Day2JavaMaven;

public class TryWithResourcesDemo implements AutoCloseable {
	
	@Override
	public void close() throws Exception{
		System.out.println("resources closed successfully");
	}
	
	public static void main(String[] args)throws Exception {
		TryWithResourcesDemo demo =new TryWithResourcesDemo();
		try (demo){
			System.out.println("using demo resource");
			
		}
	}

}
