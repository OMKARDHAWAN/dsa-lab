package com.demo.model;

import java.util.Arrays;

public class CountSort {
	
	public static void Countsort(int arr[]) {
		
		int max = findMax(arr);
		
//  step 1 : create count array initialise with 0 
		int count[] = new int[max + 1];

		for(int i = 0 ; i < count.length   ; i++ ) {
			count[i] = 0;
		}
		
//	step 2 : count no occurence in array 
		for(int j = 0 ; j < arr.length ; j++) {
      		int pos = arr[j];
      		count[pos]++;
		}
		
//		for(int i = 0 ; i < count.length ; i++ ) {
//			System.out.print(count[i] + "\t");
////			count[i] = 0;
//		}
		
		System.out.println("");
//	step 3 : find cumulative sum
for(int k = 1 ; k < count.length ; k++){
	count[k] = count[k] + count[k-1];
}


//	step 4 : pick one element from array and minus no and then place that no at postion
int [] output = new int[arr.length];
for(int i = 0 ; i < arr.length ; i++ ) {
	int pos = arr[i];
	count[pos] = count[pos] - 1 ;
	int idx = count[pos];
	output[idx] = arr[i];
}
System.out.println(Arrays.toString(output));






	}		
		
		
		
		
	
	
	
	public static int findMax(int [] arr) {
		
		int max = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 1 ; j < arr.length ; j++) {
				if(arr[j] > max) {
					int temp = arr[j];
					arr[j] = max;
					max = temp;
				}
			}
			return max;
		}
		
		
		return max;
	}
	
	
} 
 