package com.demo.model;

import java.util.Arrays;

public class SortingTech {
 public void BubbleSort(int [] arr ){
  	 for(int i = 0 ; i < arr.length ; i ++) {
  		 for(int j = 1 ; j < arr.length - i ; j++ ) {
  			 if(arr[j-1] > arr[j]) {
  				int temp = arr[j - 1 ];
  	  			 arr[j - 1] = arr[j];
  	  			 arr[j] = temp;
  			 }
  		 }
  	  }
  	 
  	System.out.println(Arrays.toString(arr));
 }
 
 
 public void ImprovedBubbleSort(int [] arr) {
	 
	for(int i = 0 ; i < arr.length ; i ++) {
		int count = 0 ; 
		boolean flag = false;
		
		for(int j = 1 ; j < arr.length - i ; j ++){
           	if(arr[j-1] > arr[j]) {
           		count++;
           		flag = true;
           		int temp = arr[j-1];
           		arr[j-1] = arr[j];
           		arr[j] = temp;
           	}
		}
		 System.out.println("Number of iteration "  + i + "swap count " + count);
         System.out.println(Arrays.toString(arr));
		
         if(!flag) {
 			break;
 		 }
		
	}
	 
	
	 
 }
 
 
 public void selectionSort(int[] arr) {
//	
	 for(int i = 0 ; i < arr.length ; i ++){
		 int min = arr[0];
         for(int j = 1 ; j < arr.length - 1 ; j++ ) {
        	 if(min > arr[j]) {
        		 int temp = arr[j];
        		 arr[j] = min;
        		 min = temp;
        	 }
         }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
 
 
 
 
 

}
