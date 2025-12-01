package com.example.Day8.MemoryManagement;

public class MyResource implements AutoCloseable{
	
	@Override
	public void close() throws Exception{
		System.out.println("Resource closed");
	}
	
	public static void main(String[] args) throws Exception {
		MyResource rs= getResource();
		System.out.println(rs.hashCode());
		System.out.println("Requesting gc");
		System.gc();
	}
	
	public static MyResource getResource() throws Exception{
		try(MyResource resource= new MyResource();){
			System.out.println("Resouce using");
			return resource;
		}
	}
	
}
