package com.demo.model;

import java.util.Scanner;

public class OperationOFMatrix {
  int[][] matrix1;
  int[][] matrix2;
  int[][] matrix3;
  Scanner sc = new Scanner(System.in);
  
public OperationOFMatrix() {
  matrix1 = new int[3][3];
  matrix2 = new int[3][3];
  matrix3 = new int[3][3];
}
//addition 
//subtraction
//multiplication
//transpose
//diagonal
//identity
  
  public void acceptMatrix1() {
	  System.out.println("Enter matrix element :");
	  for(int i = 0 ; i < matrix1.length; i++) {
		  for(int j = 0 ; j < matrix1.length ; j++) {
			  matrix1[i][j] = sc.nextInt();
		  }

	  }
  }
  
  
  
  public void acceptMatrix2() {
	  System.out.println("Enter matrix element :");
	  for(int i = 0 ; i < matrix2.length; i++) {
		  for(int j = 0 ; j < matrix2.length ; j++) {
			  matrix2[i][j] = sc.nextInt();
		  }

	  }
  }
  
  public void displayMatrix() {
	  System.out.println("Element in matrix 1 : ");
	  for(int i = 0 ; i < matrix1.length; i++) {
		  for(int j = 0 ; j < matrix1.length ; j++) {
			  System.out.print(matrix1[i][j] + " ");
		  }
         System.out.println(" ");
	  }
	  
	  System.out.println(" ");
	  System.out.println("Element in matrix 2 : ");
	  for(int i = 0 ; i < matrix2.length; i++) {
		  for(int j = 0 ; j < matrix2.length ; j++) {
			  System.out.print(matrix2[i][j] + " ");
		  }
System.out.println(" ");
	  }
	  
	  
  }

  
  public void addition(){
	  for(int i = 0 ; i < matrix1.length ; i++) {
		 for(int j = 0 ; j < matrix1[0].length ; j++) {
			 matrix3[i][j] = matrix1[i][j] + matrix2[j][i];
		 }
	  }
  }
  
  public void displayMatrix3() {
	  System.out.println("sum of matrix1 and matrix2 :");
	  for(int i = 0 ; i < matrix3.length; i++) {
		  for(int j = 0 ; j < matrix3.length ; j++) {
			  System.out.print(matrix3[i][j] + " ");
		  }
         System.out.println(" ");
	  }  
  }

  public void subtraction() {
	// TODO Auto-generated method stub
	  for(int i = 0 ; i < matrix1.length ; i++) {
			 for(int j = 0 ; j < matrix1[0].length ; j++) {
				 matrix3[i][j] = matrix1[i][j] - matrix2[j][i];
			 }
		  }
  }  
  
  
  public void multiplication() {
	  for(int i = 0 ; i < 3 ; i++) {
			 for(int j = 0 ; j < 3 ; j++) {
			for(int k = 0; k < 3 ; k++ ) {
				matrix3[i][j] += matrix1[i][k] * matrix2[k][j];				
			} 
			 }
		  }
  }
  
  public void transpose() {
	  for(int i = 0 ; i < 3 ; i++) {
			 for(int j = 0 ; j < 3 ; j++) {
			  System.out.print(matrix1[j][i] + " "); 
			 }
			 System.out.println(" ");
		  }
  }
 
  public void identity() {
	  for(int i = 0 ; i < 3 ; i++) {
			 for(int j = 0 ; j < 3 ; j++) {
			  if(i == j) {
                matrix1[i][j] = 1;
			  }else {
				  matrix1[i][j] = 0;
			  }
			 }
			 System.out.println(" ");
		  }
	  
	  System.out.println("Element in matrix 1 : ");
	  for(int i = 0 ; i < matrix1.length; i++) {
		  for(int j = 0 ; j < matrix1.length ; j++) {
			  System.out.print(matrix1[i][j] + " ");
		  }
         System.out.println(" ");
	  }
	  
	  
  }
  
  
}
