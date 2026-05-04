package com.demo.model;

import java.util.Arrays;

public class Sorting {
  public static void SelectionSort(int[] arr) {
	  
	   int min;
	   
	  
	   for(int i = 0 ; i < arr.length ; i ++){
//		   int minpos = findmin(arr,i);
		   int maxpos = findmax(arr,i);
		   
//		   swap element of array
		   
		   
//			  int temp = arr[i];
//			  arr[i] = arr[minpos];
//			  arr[minpos] = temp;
//		   

			  int temp = arr[i];
			  arr[i] = arr[maxpos];
			  arr[maxpos] = temp;
		   
		   
		   System.out.println(arr[i]);
		   
	   }

	 
  }
  
  public static int findmin(int []arr,int start){
	  int minpos = start;
	  
	  for(int i = start ; i < arr.length ; i++) {
		  if(arr[minpos] > arr[i]) {
			  minpos = i;
		  }
	  }
	  
	  return minpos;
  };
  
  
  public static int findmax(int []arr,int start){
	  int maxpos = start;
	  
	  for(int i = start ; i < arr.length ; i++) {
		  if(arr[maxpos] < arr[i]) {
			  maxpos = i;
		  }
	  }
	  
	  return maxpos;
  };
  
  
  //bubblesorting
  
public static void bubblesort(int [] arr){
	  
	  
	  for(int i = 0 ; i < arr.length ; i++) {
		  for(int j = 0 ; j < arr.length - 1 ; j ++) {
			  if(arr[j] > arr[j+1]) {
				  int temp = arr[j];
				  arr[j] = arr[j+1];
				  arr[j+1] = temp;
			  }
		  }
	  }
	  
	  
	  
//	  for(int i = 0 ; i < arr.length - 1 ; i ++) {
//		  System.out.print(arr[i] + " ");
//	  }
	  
	  System.out.println(Arrays.toString(arr));
	  
	  
  }
  

//insertion sorting

public static void InsertionSorting(int [] arr){ 
	
	
	for(int i = 1 ; i < arr.length ; i ++) {
		
		int j = i - 1;
		 int key = arr[i];
		 
		 while(j >= 0 && (arr[j]) > key) {
			 arr[j+1] = arr[j];
			 j--;
		 }
		 
		 arr[j+1] = key;
		
		
	}
	
	System.out.println(Arrays.toString(arr));
	
}


  public static void quicksort(int[] arr,int start ,int end) {
	  
   if(start < end) {
	   int p = partition(arr,start,end);
	   quicksort(arr,start,p-1);
	   quicksort(arr,p+1,end);
	   
   }
	  
	  
    	
  }
  
  
  public static int partition(int [] arr ,int start,int end) {
	  int i = start;
	  int j = end;
	  int pivot = start;
	  
	  
	  while(i<j) {
		
//		  check whether i is less than pivot;
		  while(i < end && arr[i] < arr[pivot]) {
			  i++;
		  }
		  
		  while(j > start && arr[j] > arr[pivot]) {
			  j--;
		  }
		  
		  
		  
		  if(i < j ) {
			  int temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
		  }
		  
		  
		  if(pivot != j) {
			  int temp = arr[pivot];
			  arr[pivot] = arr[j];
			  arr[j] = temp;
		  }
		  
		  
		  
		  
		  
	  }
	  
	   System.out.println(Arrays.toString(arr));
	   System.out.println("Pivot position  : "+j+" pivot number : "+arr[j]);
	   System.out.println(arr[j]+"pivot number is swapped with "+arr[pivot]);
	   System.out.println("-------------------------------------------------");
	  
	  return j;
	  
  }
  
  
  public static void countsort(int[] arr){
	  
	 //find max element
    int pos = 0;
	//find position of maximum element;
for(int i = 0 ; i < arr.length ; i ++) { 
     pos = findMax(arr,i);    
}

int maxpos = arr[pos];


int [] count = new int[maxpos + 1];    
	  

//initilise array with zero value
for(int i = 0 ; i < count.length ; i ++) {
	count[i] = 0;
}
System.out.println("Count array with zero : ");
System.out.println(Arrays.toString(count));
System.out.println(" ");

//find no of occurrence 

for(int i = 0 ; i < arr.length;i++) {
	int pos1 = arr[i];
	count[pos1]++;
}

System.out.println("count array with no of occurence  : ");
System.out.println(Arrays.toString(count));
System.out.println(" ");

for(int i=1;i<count.length;i++) {
	count[i]=count[i]+count[i-1];
}
System.out.println("count array with cumulative array  : ");
System.out.println(Arrays.toString(count));
System.out.println(" ");
    

int[] output = new int[arr.length];

for(int i = 0 ; i < arr.length ; i++ ){
	int pos2 = arr[i];
	count[pos2] = count[pos2] - 1;
	int idx = count[pos2];
	output[idx] = arr[i];
}





System.out.println("Sorted Array  : ");
System.out.println(Arrays.toString(output));
System.out.println(" ");
    


}
  
  public static int findMax(int [] arr , int start ) {
      int maxpos = start;
      
      for(int j = 0 ; j < arr.length - 1 ; j++){
    	  if(arr[maxpos] < arr[j]) {
    		  maxpos = j;
    	  }
      }
      
      
	  return maxpos;
  }
  
  
  public static void mergeSort(int[] arr,int start ,int end) {
      	  
	  if(start < end) {
		  int mid = (start + end) / 2 ;
		  mergeSort(arr,start,mid);
		  mergeSort(arr,mid + 1 , end);
		  
		 merge(arr,start,mid,end);
	  }
	  
	  
  }
  
  
  public static void merge(int [] arr , int start , int mid , int end) {
	  
	  int n1 = mid - start + 1;
	  int n2 = end - mid;
	  
	  int[] leftarr = new int[n1];
	  int[] rightarr = new int[n2];
	  
	  
	  //copy left array
	  for(int i = 0 ; i < n1 ; i ++) {
		  leftarr[i] = arr[start + i];
	  }
	  
//copy right array
	  for(int i = 0 ; i < n2 ; i ++) {
		  rightarr[i] = arr[mid + 1 + i];
	  }
	  
	  int i = 0;
	  int j = 0;
	  int k = start;
	  while( (i < n1) && (j < n2)){
		 
		  if(leftarr[i] < rightarr[j]) {
			  arr[k] = leftarr[i];
			  k++;
			  i++;
		  }else {
			  arr[k] = rightarr[j];
			  k++;
			  j++;
		  }
		  
		  
		  
		  
		  
		  
		  
	  }
	  
// copy left element in leftarray
	  while(i < n1) {
		  arr[k] = leftarr[i];
		  k++;
		  i++; 
	  }
	  
// copy left element in rightarray
	  while(j < n2) {
		  arr[k] = rightarr[j];
		  k++;
		  j++; 
	  }
	  
	  
	    System.out.println(start+"----"+mid+"------"+end);
		System.out.println(Arrays.toString(leftarr));
		System.out.println(Arrays.toString(rightarr));
		System.out.println("-----------------------------");	  
	    System.out.println(Arrays.toString(arr));
  }
}
