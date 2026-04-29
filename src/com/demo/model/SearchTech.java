package com.demo.model;

public class SearchTech {
// sequential search
// non-recursive search 
//	recursive search

public int sequential(int[] arr,int val){
   for(int i = 0 ; i < arr.length;i++) {
	   if(arr[i] == val) {
		   return i;
	   }else {
		   return -1;
	   }
   }
   return -1;
}
	

//non-recursive binary
public static int binarySearchNonRecurssive(int[] arr,int searchnum) {
	int  low=0;
	int high=arr.length-1;
	int cnt=0;
	while(low<=high) {
		
		int mid=(low+high)/2;
		System.out.println("low: "+low+" high: "+high+" mid: "+mid);
		cnt++;
		if(arr[mid]==searchnum) {
			System.out.println("number of comparisons : "+cnt);
			return mid;
		}else if(searchnum<arr[mid]) {
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	System.out.println("number of comparisons : "+cnt);
	return -1;
}

public static int binarySearchRecurssive(int[] arr,int searchnum,int low,int high) {
	System.out.println("binary search called low: "+low+" High: "+high);
	if(low<=high) {
		int mid=(low+high)/2;
		if(arr[mid]==searchnum) {
			
			return mid;
		}else if(searchnum<arr[mid]) {
			return binarySearchRecurssive(arr,searchnum,low,mid-1);
		}else {
			return binarySearchRecurssive(arr,searchnum,mid+1,high);
		}
	}
	return -1;

}




}