package com.example.Day6Stream_DS;

import java.util.Scanner;

public class BSearch {
    public static void main(String[] args) {
        
        int arr[] = {10,12,21,34,47,58,69,77,82,99};
        int low = 0, high = arr.length - 1, mid;
        
        System.out.println("Enter the key element to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean found = false;
        
        while(low <= high) {
            mid = (low + high) / 2;
            if(arr[mid] == key) {
                System.out.println("Element found at " + (mid+1) + "th position");
                found = true;
                break;
            } else if(arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if(!found) {
            System.out.println("Element not found");
        }
        
        sc.close();
    }
}
