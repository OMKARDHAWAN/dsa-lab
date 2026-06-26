package com.demo.model;

import java.util.Arrays;

public class SortingTech {
	
   public int[] SelectionSort(int[] arr){
	   for(int i = 0; i < arr.length ; i++) {
		   int minpos = findMinVal(arr,i);
		   
		   int temp = arr[i];
		   arr[i] = arr[minpos];
		   arr[minpos] = temp;
	  
	   }
	   return arr;
   }

   private int findMinVal(int[] arr, int val) {
	// TODO Auto-generated method stub
	   int minpos = val;
	for(int i = val ; i < arr.length ; i++) {
		if(arr[minpos] > arr[i]) {
			minpos = i;
		}
	}
	return minpos;
   }
   
   public int [] SelectionSortDecending(int[] arr)
   {
	   for(int i = 0 ; i < arr.length ; i++) {
		   int maxPos = findNMax(arr,i);
		   
		   int temp = arr[i];
		   arr[i] = arr[maxPos];
		   arr[maxPos] = temp;
		   
		   
	   }
	   
	   return arr;
   }

   private int findNMax(int[] arr, int start) {
	// TODO Auto-generated method stub
	   int maxpos = start;
	   for(int i = start ;i < arr.length ; i++) {
           if(arr[maxpos] < arr[i]){
	  maxpos = i;
           }
	   }
	   
	return maxpos;
   }
   
   
   public int[] BubbleSort(int[] arr){
	   for(int i= 0 ; i < arr.length  ; i ++) {
		   for(int j = 1 ; j < arr.length - i ; j++ ) {			   
		   if(arr[j -1 ] > arr[j]) {
			   int temp = arr[j - 1];
			   arr[j - 1] = arr[j];
			   arr[j] = temp;
		   }
		   }
	   }
	   
	   return arr;
   }
 
   public int[] insertionSort(int[] arr){
	   
	   for(int i = 1 ; i < arr.length ; i++) {
		
	    int j = i - 1;
	    int key = arr[i];
	    while((j >= 0) && (arr[j]) > key) {
	    	  arr[j + 1] = arr[j];
	    	  j--;
	    }
		  
	    arr[j + 1] = key; 
	   }   
	   return arr;
   }
   
   
  public void quicksort(int [] arr ,int start, int end){ 
	  if(start < end) {
		  int p = partition(arr,start,end);
		  quicksort(arr,start,p-1);
		  quicksort(arr,p+1,end);
	  }
  }
  
  public int partition(int[] arr,int start,int end) {
	  int i = start;
	  int j = end;
	  int pivot = start;
	  
	  while(i < j){
		  
		  while((i < pivot) && (arr[i] < arr[pivot])) {
			 i++;
		  }
		  
		  
		  while((j > pivot) && (arr[j] > arr[pivot])) {
			 j--;
		  }
		  
		  if(i < j){
			  int temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
		  }
		  
	  }
	  
	  if(pivot != j) {
		  int temp = arr[pivot];
		  arr[pivot] = arr[j];
		  arr[j] = temp;
	  }
	  
	  System.out.println(Arrays.toString(arr));
	  System.out.println("Pivot position  : "+pivot+" pivot number : "+arr[pivot]);
	  System.out.println(arr[j]+"pivot number is swapped with "+arr[pivot]);
	  
	  return j;
	    
  }

 
  
  
  
  
  
   
   
   
}
