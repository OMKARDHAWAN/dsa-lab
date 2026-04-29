package com.demo.model;

public class QuickSort {
  public static void QuickSorting(int[] arr,int start,int end) {
	if(start < end) {
		int p = partition(arr,start,end);
		QuickSorting(arr,start,p-1);
		QuickSorting(arr,p+1,end);
	}
  }
  
  
  public static partition(int arr[] , ){
	  
  }
}
