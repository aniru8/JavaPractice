package com.example.Day6Stream_DS;

public class SelectSort {

	public static void main(String[] args) {
		int arr[]= {18,3,45,23,8,23,87,20,49,13};
		int n=arr.length;
		for(int i=0;i<n;i++){
				int  mi=i;
				for(int j=i+1;j<n;j++)
					if(arr[j]<arr[mi])
						mi=j;
				int temp=arr[i];
				arr[i]=arr[mi];
				arr[mi]=temp;				
			}
				
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

}
