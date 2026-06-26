package com.demo.model;

import java.util.Arrays;

public class MergerSort {
  public void MergeSort(int [] arr,int start,int end) {
	if(start < end) {
		 int mid = (start + end) / 2;
		 MergeSort(arr,start,mid);
		 MergeSort(arr,mid+1,end);
		 merge(arr,start,mid,end);
	}
  }
  
  public void merge(int [] arr,int start,int mid,int end) {
	  int n1 = mid - start + 1;
	  int n2 = end - mid;
	  
	  int[] leftarr = new int[n1];
	  int[] rightarr = new int[n2];
	  
//	  copy left array
	  for(int i = 0 ; i < n1 ; i++) {
		  leftarr[i] = arr[start + i];
	  }
	  
//	  copy right array 
	  for(int i = 0 ; i < n2 ;i++){
		rightarr[i] = arr[mid+1+i];  
	  }
	  int i = 0;
	  int j = 0;
	  int k = start;
	  
	  while((i < n1) && (j < n2)) {
		  if(leftarr[i] < rightarr[j]){
			  arr[k] = leftarr[i];
			  k++;
			  i++;
		  }else {
			  arr[k] = rightarr[j];
			  k++;
			  j++;
		  }
	  }
	  
//	  copy remaning part of array
	  while(i < n1){
		  arr[k] = leftarr[i];
		  k++;
		  i++;
	  }
	  
//	  copy remaining part of array
	  while(j < n2) {
		  arr[k] = rightarr[j];
		  k++;
		  j ++;
	  }
	  
	  
	  System.out.println(start + "------------" + mid + "-------" + end);
	  System.out.println(Arrays.toString(leftarr));
	  System.out.println(Arrays.toString(rightarr));
	  System.out.println("----------------");
	  
	  
	  
	  
	  
  }
  
  
  
}
