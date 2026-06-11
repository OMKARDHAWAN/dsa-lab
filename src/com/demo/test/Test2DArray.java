package com.demo.test;

import java.util.Scanner;

import com.demo.model.My2dArray;



public class Test2DArray {
  public static void main(String[] args) {
	  int choice;
	  My2dArray md = new My2dArray();
	 Scanner sc = new Scanner(System.in);
	 
	 do { 
		 System.out.println("1.Add Element in matrix row wise \n 2.Sum of element rowwise \n 3.Find max element rowwise\n 4.Find minimum element rowwise \n 5.Shift Matrix upside \n 6.Shift Matrix downside");
		 System.out.println("7.Add Element in matrix column wise \n 8.Sum of element columnwise \n 9.Find max element columnwise\n 10.Find minimum element columnwise \n 11.Shift Matrix right \n 12.Shift Matrix left");
		 System.out.println("12.Display Matrix rowwise \n 13.Display Matrix Columnwise \n");
		 System.out.println("Enter Correct choice :");
		 choice = sc.nextInt();
         switch (choice) {
		case 1->{
            md.addElement();
		}
		case 2->{
			int[] sum = md.findSumByRow();
			for(int i = 0 ; i < sum.length ; i++) {
				System.out.print(sum[i] + " ");
				System.out.println(" ");
			}
		}
		case 3->{
			int [] max = md.findMaxByRow();
			for(int i = 0 ; i < max.length ; i++) {
				System.out.print(max[i] + " ");
				System.out.println(" ");
			}
		}
		case 4->{
			int [] min = md.findMaxByRow();
			for(int i = 0 ; i < min.length ; i++) {
				System.out.print(min[i] + " ");
				System.out.println(" ");
			}
		}
		case 5->{
			System.out.println("Enter how many time you want to rotate :");
		    int num = sc.nextInt();
			int [][] arr = md.rotateUpward(num);
			for(int i = 0 ; i < arr.length ; i++) {
				for(int j = 0 ; j < arr.length ; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println(" ");
			}
		}
		case 6->{
			System.out.println("Enter how many time you want to rotate :");
		    int num = sc.nextInt();
			int [][] arr = md.rotateDownward(num);
			for(int i = 0 ; i < arr.length ; i++) {
				for(int j = 0 ; j < arr.length ; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println(" ");
			}
		}
		case 7->{
            md.addElement();
		}
		case 8->{
			int[] sum = md.findSumByColumnwise();
			for(int i = 0 ; i < sum.length ; i++) {
				System.out.print(sum[i] + " ");
				System.out.println(" ");
			}
		}
		case 9->{
			int [] max = md.findMaxByColumn();
			for(int i = 0 ; i < max.length ; i++) {
				System.out.print(max[i] + " ");
				System.out.println(" ");
			}
		}
		case 10->{
			int [] min = md.findMinByColumn();
			for(int i = 0 ; i < min.length ; i++) {
				System.out.print(min[i] + " ");
				System.out.println(" ");
			}
		}
		case 11->{
			System.out.println("Enter how many time you want to rotate :");
		    int num = sc.nextInt();
			int [][] arr = md.rotateRightColumnWise(num);
			for(int i = 0 ; i < arr.length ; i++) {
				for(int j = 0 ; j < arr.length ; j++) {
					System.out.println(arr[i][j] + " ");
				}
				System.out.println(" ");
			}
		}
		
		case 12->{
        	 md.displayElementRowwise();
		}
		case 13->{
			md.displayElementColumnWise();
		}
		default->{
			System.out.println("Enter correct Choice!!!");
			sc.close();
			System.exit(0);
		}
		};		 
	 }while(choice != 14);	 
}
}
