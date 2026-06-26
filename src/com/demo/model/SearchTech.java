package com.demo.model;

public class SearchTech {
// sequential search
// non-recursive search 
//	recursive search

public int sequentialSearch(int [] arr, int data) {
	for(int i = 0 ; i < arr.length ; i++) {
		if(arr[i] == data) {
			return i;
		}
	}
	return -1;
}

//non-recursive binary
public static int binarySearchNonRecurssive(int[] arr,int searchnum) {
	int low = 0;
	int high = arr.length -1;
	int count = 0;
	
	while(low <= high) {
		int mid = (low + high)/2;
		count++;
		if(arr[mid] == searchnum) {			
			System.out.println("Count of comparison "+ count);
			return mid;
		}else  if(searchnum < arr[mid]){
			high = mid -1;
		}else {
			low = mid + 1;
		}
	}
	
	System.out.println("Count of comparison "+ count);
	return -1;
	
	
}

public static int binarySearchRecurssive(int[] arr,int searchnum,int low,int high) {
	System.out.println("Low" + low + " " +"high:" +" " + high );
    int mid = (low + high) / 2;
	while(low <= high) {
		if(arr[mid] == searchnum){
			return mid;
		}else if(arr[mid] > searchnum  ) {
			return binarySearchRecurssive(arr, searchnum, low, mid + 1);
		}else {
		  return binarySearchRecurssive(arr, searchnum, mid+1, high);
	}
	}
	return -1;
}


}