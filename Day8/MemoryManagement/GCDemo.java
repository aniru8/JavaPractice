package com.example.Day8.MemoryManagement;

public class GCDemo {

	public static void main(String[] args) throws InterruptedException {
		Test test =new Test();
		test = null;
		System.out.println("GC Resquested manually");
		System.gc();
		
		Thread.sleep(1000);
		System.out.println("Completed");
	}

}

class Test{
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Garbage collected");
	}
}
