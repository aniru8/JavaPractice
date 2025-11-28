package com.example.Day6Stream_DS;

public class QuickSortApp {
	
	public static void quickSort(int arr[], int low, int high) {
	    if (low < high) {
	        int pivotIndex = partition(arr, low, high);
	        quickSort(arr, low, pivotIndex - 1);
	        quickSort(arr, pivotIndex + 1, high);
	    }
	}
 
	private static int partition(int[] arr, int low, int high) {
	    int pivot = arr[low];  
	    int i = low;
	    int j = high;
 
	    while (i < j) {
	        
	        while (i <= high && arr[i] <= pivot) {
	            i++;
	        }
	        
	        while (j >= low && arr[j] > pivot) {
	            j--;
	        }
	        
	        if (i < j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
 
	   
	    arr[low] = arr[j];
	    arr[j] = pivot;
 
	    return j; 
	}		
		
		
		
		
	public static void main(String[] args) {
		int arr[]= {18,3,45,23,8,23,87,20,49,13};
		
		int n=arr.length;
		System.out.println("-------Before Sorting-------");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		quickSort(arr,0,arr.length-1);
		System.out.println("--------After Sorting-------");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
