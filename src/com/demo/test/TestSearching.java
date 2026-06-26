package com.demo.test;

import com.demo.model.SearchTech;

public class TestSearching {
  public static void main(String[] args) {
	SearchTech S = new SearchTech();
	int[] arr = {10,20,30,40,50,60};
	
//	int pos = S.sequentialSearch(arr, 60);
//	if(pos != -1 ) {
//		System.out.println("Element found at :" + pos);
//	}else {
//		System.out.println("Element not found!!!");
//	}
	
	
//	int pos = S.binarySearchNonRecurssive(arr, 60);
//	if(pos != -1 ) {
//		System.out.println("Element found at :" + pos);
//	}else {
//		System.out.println("Element not found!!!");
//	}
	
	int high = arr.length - 1;
	int pos1 = S.binarySearchRecurssive(arr, 50, 0,high );
	if(pos1 != -1 ) {
		System.out.println("Element found at :" + pos1);
	}else {
		System.out.println("Element not found!!!");
	}
}
}
