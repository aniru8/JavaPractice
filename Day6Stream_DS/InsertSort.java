package com.example.Day6Stream_DS;

public class InsertSort {

	public static void main(String[] args) {
		int arr[]= {18,3,45,23,8,23,87,20,49,13};
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i],j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

}
