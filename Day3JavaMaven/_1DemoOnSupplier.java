package com.example.Day3JavaMaven;

import java.util.function.Supplier;

public class _1DemoOnSupplier {

	public static void main(String[] args) {
		String name= "Anirudha";
		Supplier<String> supplier=()->name.toUpperCase();
		System.out.println(supplier.get());
		
		Supplier<Integer> apple=()->{
			return (int) Math.round(Math.random()*10000);
		};
		System.out.println(apple.get());
		
		int a=3,b=22;
		Supplier<Integer> ban=()->{
			return(a>b?a:b);
		};
		System.out.println(ban.get());
	}

}
