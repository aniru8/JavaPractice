package com.example.Day2JavaMaven;

public class DemoOnException {

//	public static void main(String[] args) {
//		int a=3,b=2;
//		String s=null;
//		String s2="Joshwa";
//		
//		try {
//		System.out.println(s.equals(s2));
//		}
//		catch(NullPointerException np) {
//			System.out.println("Your string is null");
//		}
//		//long start = System.currentTimeMillis();
//		try {
//			//System.out.println(a/b);
//		}
//		catch(ArithmeticException ae) {
//			ae.printStackTrace();
//			System.out.println("Dividing by zero");
//			System.out.println("Exaception handled");
//		}
//		System.out.println("Application closed successfully");
//		long end = System.currentTimeMillis();
//		long timeTaken = end - start;
//		System.out.println(start);
//		System.out.println(end);
//		System.out.println(timeTaken);

		//throw the exception
		public static void checkMethod(int a, int b[]) {
			for (int i =0;i<b.length;i++) {
				if(b[i]==0)
					throw new ArithmeticException();
					else if(i>=b.length) 
						throw new ArrayIndexOutOfBoundsException();
					else
						System.out.println(a/b[i]);
					
				}
			
		}
		
		
			
			public static void main(String[] args) {
				int a=3,b[]= {};
		
		
		
	}

}
