package com.demo.model;

import java.util.Arrays;

public class MergeSort {

	
	public static void mergeSort(int[] arr,int start,int end) {
		if(start<end) {
			//calculate mid position
			int mid=(start+end)/2;
			//left tree sorting
			mergeSort(arr,start,mid);
			//right tree sorting
			mergeSort(arr,mid+1,end);
			//merge 2 sorted array
			merge(arr,start,mid,end);
		}
		

	}


	
//	
	public static void merge(int[]arr, int start , int mid , int end){
		
	
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int [] leftarr = new int[n1];
		int [] rightarr = new int[n2];
		
//		copy left arr into left arr
		for(int i = 0 ; i < n1 ; i++) {
			leftarr[i] = arr[start + i];
		}
		
//		copy left arr into right arr		
		for(int i = 0 ; i < n2 ; i++) {
			rightarr[i] = arr[mid+1+i];
		}
		
		
		int i = 0;
		int j = 0;
		int k = start;
		
		while((i<n1) && (j < n2)){
			if(leftarr[i] < rightarr[j] ) {
				arr[k] = leftarr[i];
				k++;
				i++;
			}else {
			 arr[k] = rightarr[j];
			 k++;
			 j++;
			}
		//copy remaing element of left array 
			while(i < n1) {
				arr[k] = leftarr[i];
				k++;
				i++;
			}
			
			while(j < n2) {
				arr[k] =  rightarr[j];
				k++;
				j++;
			}
			System.out.println(Arrays.toString(leftarr));
			System.out.println(Arrays.toString(rightarr));
			System.out.println("-----------------------------");
	
			System.out.println(Arrays.toString(arr));
			
		}
		
		
	}
		
		
		
		
		
		
		
		
		
	}
 
 

