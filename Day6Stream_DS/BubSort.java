package com.example.Day6Stream_DS;

public class BubSort {

	public static void main(String[] args) {
		int arr[]= {18,3,45,23,8,23,87,20,49,13};
		int n=arr.length;
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

}
