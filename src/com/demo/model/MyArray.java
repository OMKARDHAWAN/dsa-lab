package com.demo.model;

import java.util.Arrays;

public class MyArray {
  private int[] arr;
  private int count;
 
  public MyArray() {
	arr = new int[5];
	count = 0;
  }
  public MyArray(int size, int count) {
	this.arr = new int[size];
	this.count = count;
  }
  
  //retrive array length 
  public int getCapacity() {
	return arr.length;
  }
  
  //retrive no of elements in array  
  public int getCount() {
	return count;
  }
  
  
//  insert at end
  public void add(int x) {
	  if(count < arr.length) {
		  arr[count] = x;
		  count++;
		  System.out.println("Element added successfully!!!");
	  }else {
		  System.out.println("Array length is full");
	  }
  }
  
  public void display() {
	  for(int i = 0 ; i < count ; i++) {
		 System.out.println("Array Element :" + arr[i]);
	  }
  }
  public boolean addBetween(int x,int pos){
	// TODO Auto-generated method stub
	  count=3;
	  if((count < arr.length) && (pos<count)) {
	  
	  for(int i = count ; i > pos ; i--) {
		  arr[i] = arr[i-1];
	  }
	  arr[pos] = x;
	  count++;
	  return true;
	  }else {
		  return false;
	  }
  }
  public int searchByPos(int pos) {
	// TODO Auto-generated method stub
	  
	  for(int i = 0 ; i < arr.length ; i++ ) {
		  if(i == pos) {
			 return arr[i];
		  }
	  }
	  
	return -1;
  }
  public boolean deleteByPos(int pos) {
	// TODO Auto-generated method stub
	  if(pos < count) {
		  for(int i = 0 ; i < count ; i++) {
			  if(i == pos) {
				arr[i] = arr[i+1];
			  }
		  }
		  count--;
		  return true;
	  }
	  
	  
	return false;
  }
  public boolean searchByValue(int value) {
	// TODO Auto-generated method stub
	  
	for(int i = 0 ; i < arr.length; i++) {
		if(arr[i] == value) {
			return true;
		}
	}
	return false;
  }
  
  public int[] rotatebyRight( int pos) {
	// TODO Auto-generated method stub
	  int temp = 0;
	  
		for(int i = 0 ; i < pos; i++) {
			  temp = arr[count-1];
			  for(int j = count - 1 ; j > 0 ; j--){
				  arr[j] = arr[j-1];
			  }
			  arr[0]=temp;
		}
	
	  
	  return arr;
  }

  
  public int[] rotatebyLeft( int pos) {
		// TODO Auto-generated method stub
		  int temp = 0;
		for(int i = 0 ; i < pos; i++) {
			  temp = arr[0];
			  for(int j = 0; j < count -1 ; j++){
				  arr[j] = arr[j+1];
			  }
			  arr[count - 1] = temp;
		} 		  	  
		  return arr;
	  }
  
  
  
  
  public int findMax() {
	// TODO Auto-generated method stub
	int max = arr[0];  
	  
	for(int i = 1 ; i < arr.length ; i++ ) {
		if(max < arr[i]) {
			max = arr[i];
		}
	}
	
	return max;

  }
  public int findMin() {
	// TODO Auto-generated method stub
	  int min = arr[0];  
	  
		for(int i = 1 ; i < arr.length ; i++ ) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
  }
  
  public int totalSum() {
	  int sum = 0;
	  for(int i = 0 ; i < arr.length ; i++ ) {
			sum +=arr[i];
		}
		return sum;
  }
  
 
  
  
  
  
}
