package com.demo.model;

import java.util.Scanner;

public class My2dArray {
  private int[][] Array;
  Scanner sc = new Scanner(System.in);
  
  public My2dArray() {
      Array = new int[3][3];
  }
  
  public My2dArray(int[][] array) {
	Array = array;
  }
  
  public My2dArray(int[][] array,int row ,int col) {
		Array = new int[row][col];
	    Array = array;
  }
  
  public void add(){
	  System.out.println("Enter the element in array :");
	  for(int row = 0 ; row < Array.length ; row++) {
		  for(int col = 0 ; col < Array[0].length ; col++) {
			 Array[row][col] = sc.nextInt();
		  }
	  }
	  System.out.println(" ");
  }
  
  
  public void addByCol(){
	  System.out.println("Enter the element in array :");
		  for(int col = 0 ; col < Array[0].length ; col++) {
			  for(int row = 0 ; row < Array.length ; row++) {
			 Array[row][col] = sc.nextInt();
		  }
	  }
	  System.out.println(" ");
  }

  
  public void shiftByRow(boolean flag,int num){
	 
	       
	       
if(flag) {
	for(int i = 0 ; i < num ; i ++) {
		int temp[] = Array[0];
		for(int j = 0 ; j < Array.length - 1; j ++) {
			Array[j] = Array[j + 1 ];
		}
		Array[Array.length - 1 ] = temp;
		
	}
}else {
	for(int i = 0 ; i < num ; i ++) {
		int temp[]  = Array[Array.length - 1 ];
		for(int col = Array.length - 1 ; col >0 ; col --) {
			Array[col] = Array[col - 1 ];
		}
		Array[0] = temp;
		
	}
}
	       
	       
		
  }
  
  
  public void rotateByCol(boolean flag , int num) {
if(flag){
	int[] temp = new int[Array.length];
	//save last col into temp array;
	
	for(int it = 0 ; it < num ; it ++) {
		for(int i = 0 ; i < temp.length ; i ++){
			temp[i] = Array[i][Array.length - 1];
		}
		
	    //shift remaning two col	
		for(int col = 0 ; col < Array.length ; col++){
			for(int row = Array.length - 1 ; row > 0 ; row-- ) {
				Array[col][row] = Array[col][row - 1];
			}
		}
		
		//save col which is save in temp variable at index 0;
		for(int i = 0 ; i < temp.length ; i ++){
			Array[i][0] = temp[i];
		}
	}
	
}else {
	
	//save last col into temp array;
	int[] temp = new int[Array.length];
	for(int it = 0 ; it < num ; it ++) {
		for(int i = 0 ; i < temp.length ; i ++){
			temp[i] = Array[i][0];
		}
		
	    //shift remaning two col	
		for(int col = 0 ; col < Array.length ; col++){
			for(int row = 0; row < Array.length - 1 ; row++) {
				Array[col][row] = Array[col][row + 1];
			}
		}
		
		//save col which is save in temp variable at index 0;
		for(int i = 0 ; i < temp.length ; i ++){
			Array[i][2] = temp[i];
		}
	}
}
  }
  
  
public void sumByRow(){
	int sum[] = new int[Array.length];
	
	
	for(int row = 0 ; row < Array.length ; row++){
		for(int col = 0 ; col < Array[0].length ; col++ ){
			sum[row] += Array[row][col];
		}
	}
	
	for(int row = 0 ; row < Array.length ; row++){
		System.out.println("Sum by row : " + sum[row]);		
	}
	
	
}
  
  
  
  
  
  
public void display() {
	System.out.println("Array : ");
	  for(int row = 0 ; row < Array.length ; row++) {
		  for(int col = 0 ; col < Array[0].length ; col++) {
	 System.out.print(Array[row][col] + "\t");
		  }
		  System.out.println(" ");
	  }
}
 
  
  
  
  
  
}
