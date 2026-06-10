package com.demo.model;


import java.util.Scanner;

public class My2dArray {
  int [][] matrix;
  Scanner sc = new Scanner(System.in);
  public My2dArray() {
	// TODO Auto-generated constructor stub
	  matrix = new int[3][3];
  }
  
  public int getLength(){
	  int length = matrix.length;	  
	  return length;
  }
  
  public void addElement(){
	  for(int i = 0 ; i < matrix.length ; i++) {
		  for(int j = 0 ; j < matrix.length ; j++ ) {
			  System.out.println("Enter Element at :" + i + " " + j);
			  matrix[i][j] = sc.nextInt();
		  }
	  }
	  
  }
  
  public void displayElementRowwise(){
	  for(int i = 0 ; i < matrix.length ; i++) {
		  for(int j = 0 ; j < matrix[0].length ; j++ ) {
			  System.out.print(matrix[i][j] + " ");
		  }
		  System.out.println(" ");
	  } 
  }

  public int[][] rotateUpward(int pos) {
	// TODO Auto-generated method stub
   int [] temp = new int[3];
     for(int i = 0 ; i < pos ; i++) {
         temp = matrix[0];
   	    for(int j = 0 ; j < matrix.length - 1; j++) {
   	        matrix[j] = matrix[j + 1];
    	  }
   	    matrix[matrix.length - 1] = temp;
     }
	return matrix;
  }
  
  public int[][] rotateDownward(int pos){
	// TODO Auto-generated method stub
   int [] temp = new int[3];
     for(int i = 0 ; i < pos ; i++) {
         temp = matrix[matrix.length - 1];
   	    for(int j = matrix.length - 1  ; j > 0 ; j--){
   	        matrix[j] = matrix[j - 1];
    	  }
   	    matrix[0] = temp;
     }
	return matrix;
  }

  public int[] findMaxByRow() {
	// TODO Auto-generated method stub
	  int max[] = new int[3];
	  
	  for(int i = 0 ; i < matrix.length; i++) {
		  for(int j = 0 ; j < matrix[0].length ;j++) {
			  max[i] = matrix[i][0];
			  if(max[i] < matrix[i][j]) {
				  max[i]=matrix[i][j];
			  }
		  }
	  }
	  return max;	  
  }
  
  
  public int[] findMinByRow(){
		// TODO Auto-generated method stub
		  int min[] = new int[3];
		  
		  for(int i = 0 ; i < matrix.length; i++) {
			  for(int j = 0 ; j < matrix[0].length ;j++) {
				  min[i] = matrix[i][0];
				  if(min[i] > matrix[i][j]) {
					  min[i]=matrix[i][j];
				  }
			  }
		  }
		  return min;	  
   }

  public int[] findSumByRow() {
	// TODO Auto-generated method stub
	  
	  int sum[] = new int[3];
	  
	  for(int i = 0 ; i < matrix.length; i++) {
		  for(int j = 0 ; j < matrix[0].length ;j++) {
			  sum[i] += matrix[i][j];
		  }
	  }
	  return sum;	 	  
  }

  public void addElementColumnWise() {
	// TODO Auto-generated method stub
	  System.out.println("Enter element  :");
	  int element = sc.nextInt();
	  for(int i = 0 ; i < matrix[0].length ; i++) {
		  for(int j = 0 ; j < matrix.length ; j++ ) {
			  System.out.println("Enter Element at :" + j + " " + i);
			  matrix[i][j] = sc.nextInt();
		  }
	  }
	
  }
  
  public void displayElementColumnWise(){
	  for(int i = 0 ; i < matrix[0].length ; i++) {
		  for(int j = 0 ; j < matrix.length ; j++ ) {
			  System.out.print(matrix[j][i] + " ");
		  }
		  System.out.println(" ");
	  } 
  }
  
  public int[] findMaxByColumn() {
		// TODO Auto-generated method stub
		  int max[] = new int[3];
		  
		  for(int i = 0 ; i < matrix[0].length; i++) {
			  for(int j = 0 ; j < matrix.length ;j++) {
				  max[i] = matrix[0][i];
				  if(max[i] < matrix[i][j]) {
					  max[i]=matrix[i][j];
				  }
			  }
		  }
		  return max;	  
	  }
  
  public int[] findMinByColumn() {
		// TODO Auto-generated method stub
		  int min[] = new int[3];
		  
		  for(int i = 0 ; i < matrix[0].length; i++) {
			  for(int j = 0 ; j < matrix.length ;j++) {
				  min[i] = matrix[0][i];
				  if(min[i] > matrix[i][j]) {
					  min[i]=matrix[i][j];
				  }
			  }
		  }
		  return min;	  
	  }

  public int[] findSumByColumnwise() {
	// TODO Auto-generated method stub
	  
	  int sum[] = new int[3];
	  
	  for(int i = 0 ; i < matrix[0].length; i++) {
		  for(int j = 0 ; j < matrix.length ;j++) {
			  sum[i] += matrix[i][j];
		  }
	  }
	  return sum;
  }

  public int[][] rotateRightColumnWise(int count) {
	// TODO Auto-generated method stub
     int temp[] = new int[3]; 
	 for(int i = 0 ; i < count ; i++) {
	  for(int j = 0 ; j < matrix[0].length ; j++) {
		  for(int k = 0 ; k < matrix.length ; k++) {
			  temp[i] = matrix[j][k];
			  matrix[j][k] = matrix[j+1][k+1];
			  matrix[matrix[0].length - 1][matrix[0].length - 1] = temp[i];
	  }
	 }
	  
  }
	 return matrix;

  

  }
  
	 
//Addition of two matrix 
int[][] matrix1 = new int[3][3];	 
int[][] matrix2 = new int[3][3];	
 
  
  
  
  
  
  
  
  
  }
