package com.demo.test;

import java.util.Arrays;

import com.demo.model.MergerSort;
import com.demo.model.SortingTech;

public class TestSort {
 public static void main(String[] args) {
//	int[] arr1 = {50,20,30,10,40,80,5,100};
//	
//	SortingTech S = new SortingTech();
//    
//	int [] arr = S.SelectionSort(arr1);
//	
//	for(int i = 0 ; i < arr.length ; i ++) {
//       System.out.println(arr[i]);
//	}
//	 System.out.println(" ");
//		int [] arrd = S.SelectionSortDecending(arr1);
//		
//		for(int i = 0 ; i < arrd.length ; i ++) {
//	       System.out.println(arrd[i]);
//		}
//	    
//	System.out.println(" ");
//		
//  int [] SortedArrayBubble = S.BubbleSort(arr1);
//  for(int i = 0 ; i < arrd.length ; i ++) {
//	       System.out.println(SortedArrayBubble[i]);
//  }
//  
//  
//  System.out.println("Insertion sort :");
//  int [] insertionArray = S.insertionSort(arr1);
//  for(int i = 0 ; i < insertionArray.length ; i ++) {
//      System.out.println(insertionArray[i]);
//}
//  
//  S.quicksort(arr1, 0, arr1.length - 1);
  int newarr[] = {50,10,30,20,40};
  MergerSort Mobj = new MergerSort();
  Mobj.MergeSort(newarr, 0, newarr.length -1);
  System.out.println(Arrays.toString(newarr));
 
}
}
