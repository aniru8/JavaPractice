package com.example.Day2JavaMaven;

import java.util.Arrays;

public class DemoOnArrayUtilityClass {

	public static void main(String[] args) {
		int[] arr= {10,5,20,30,55,40,50};
		System.out.println(Arrays.toString(arr));
		String nums=Arrays.toString(arr);
		System.out.println(nums);
		Arrays.sort(arr);
		for(int ele:arr)
			System.out.println(ele);
		
		System.out.println(Arrays.binarySearch(arr, 40));
		
		int[] brr= {5,10,20,30,40,50,55};
		System.out.println(Arrays.equals(arr, brr));
		
		int[] crr= Arrays.copyOf(arr, 10);
		for(int ele:crr)
		System.out.println(ele);
		
		Arrays.fill(arr, 78);
		for(int ele:arr)
			System.out.println(ele);
	}

}