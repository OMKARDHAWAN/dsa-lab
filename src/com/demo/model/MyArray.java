package com.demo.model;

import java.util.Arrays;

public class MyArray {
  private int[] array;
  private int count;

  
  
  
  //default constructor;
 public MyArray() {
	this.array = new int[10];
	this.count = 0;
 }

 
// paramterised constructor
 public MyArray(int size){
  this.array = new int[size];
  this.count = 0;
 }
 


 
 
public MyArray(int[] array, int count) {
	this.array = array;
	this.count = count;
	
}

//addition of array
public boolean add(int val){
	if(count < array.length){
		array[count] = val;
	    count++;
		return true;
	}
	return false;
}


public boolean addByPos(int pos,int val){
	
//	check whether count is less than array length and pos is less than count
	if((count < array.length)&&(pos < count)) {
		for(int i = count ; i >= pos ; i--) {
			array[count] = array[count - 1];
		}
		array[pos] = val;
		count++;
		return true;
	}
	
	
	
	return false;

}

//search by index;

public int searchByPos(int val){
	for(int i = 0 ; i < count - 1 ; i++) {
	  if(array[i] == val) {
		  return i;
	  }
	}	
	return -1;
}


//deleteBypos

public boolean deleteByPos(int pos){
	if(pos < count){
	  for(int i = pos + 1 ; i < count ; i++) {
		  array[i - 1] = array[i];
	  }
	  count--;
	  return true;
	}
	return false;
}
//
public boolean deleteByVal(int val){
	int pos = searchByPos(val);
	
	if(pos != -1) {
		
		for(int i = pos +1 ; i < count ; i++) {
			array[i - 1] = array[i];
		}
		count--;
		return true;
	}else {
		return false;		
	}
	
	
}

public void rotateArray(boolean flag , int num) {
	
	if(flag) {
		for(int i = 0 ; i < num ; i++) {
			int temp = array[count -1];
		for(int j = count - 1 ; j > 0 ; j--) {
		  	array[j] = array[j-1];
		}
		array[0] = temp;
		}
		
	}else {
		for(int i = 0 ; i < num ; i++) {
			int temp = array[0];
		for(int j = 0 ; j < count -1 ; j++) {
		  	array[j] = array[j+1];
		}
		array[count-1] = temp;
		}
		
	}
	
}

public void reverseArray(boolean flag) {
	
	if(flag){
		for(int i = 0,j = count - 1 ; i < j ; i++ , j--){

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;

		}
	}else {
		
		int[] arr1 = new int[count];
		
		for(int i = count - 1,j = 0 ; i >= j ; i-- , j++){
			
				arr1[j] = array[i];
			
		}
	}
}

public void display() {
	for(int i = 0 ;i < count; i ++) {
		System.out.print(array[i] + "\t");
	}
}







  
}
