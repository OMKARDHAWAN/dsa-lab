package com.demo.test;

import java.util.Scanner;

import com.demo.model.MyArray;

public class TestArray {
public static void main(String[] args) {
	MyArray arr = new MyArray();
	Scanner sc = new Scanner(System.in);
    int choice = 0;
    do {
    	System.out.println("\n1.get array length \n 2.get array count \n 3.add element in end \n 4.add at between \n 5.search by pos ");
    	System.out.println(" 6.delete by pos \n 7.search by value \n 8.rotate by right \n 9.rotate by left \n 10.find max element \n 11.find min element");
       	System.out.println(" 12.find sum of element \n 13.Display all element");
        System.out.println("Enter correct choice: ");
       	choice = sc.nextInt();
       	
       	switch(choice) {
       	case 1->{
       		int length = arr.getCapacity();
       		System.out.println("Length of array is :" + length);
       	}
       	case 2->{
       	    int count = arr.getCount();
       	    System.out.println("Count of Array is :" + count);
       	}
       	case 3->{
       		System.out.println("Enter element :");
       		int x = sc.nextInt();
       		arr.add(x);
       	}
       	case 4->{
       		System.out.println("Enter element :");
       		int x = sc.nextInt();
       		System.out.println("Enter position :");
       		int pos = sc.nextInt();
       		boolean status = arr.addBetween(x,pos);
       		if(status) {
       			System.out.println("Element added successfully!!!");
       		}else {
       			System.out.println("Element not added!!!");
       		}
       	}
       	case 5->{
       		System.out.println("Enter position :");
       		int pos = sc.nextInt();
       		int x = arr.searchByPos(pos);
       		if(x != -1) {
       			System.out.println("Element at position :" + x);       			
       		}else {
       			System.out.println("Element not found!!!");
       		}
       		
       		
       		
       	}
       	case 6->{
       		System.out.println("Enter position :");
       		int pos = sc.nextInt();
       		boolean status = arr.deleteByPos(pos);
       		
       		
       		if(status){
       			System.out.println("Element Deleted Successfully!!!");       			
       		}else {
       			System.out.println("Element not Deleted!!!!");
       		}
       		
       		
       		}
       	
       	case 7->{
       		System.out.println("Enter value to search :");
       		int value = sc.nextInt();
       		boolean status = arr.searchByValue(value);
       		
       		if(status){
       			System.out.println("Element found!!!");
       		}else {
       			System.out.println("Element not found!!!");
       		}
       		
       	}
       	case 8->{
       		System.out.println("how many position you want to rotate:");
       		int pos = sc.nextInt();
       		int[] newarr = arr.rotatebyRight(pos);
       		
       		for(int i = 0 ; i < newarr.length ; i++) {
       			System.out.print(newarr[i] + " ");
       		}	
       	}
       	
       	case 9->{
       		System.out.println("how many position you want to rotate:");
       		int pos = sc.nextInt();
       		int[] newarr = arr.rotatebyLeft(pos);
       		for(int i = 0 ; i < newarr.length ; i++) {
       			System.out.print(newarr[i] + " ");
       		}
       	}
       	case 10->{
       		int num = arr.findMax();
       		System.out.println("Maximum element :" + num);
       		
       	}
       	case 11->{
       		int num = arr.findMin();
       		System.out.println("Minimum element :" + num); 
       	}
       	case 12->{
       		int sum = arr.totalSum();
       		System.out.println("Sum of Element :" + sum);
       	}
       	case 13->{
            arr.display();
       	}
       	default->{
       		System.out.println("Please enter correct choice!!!!");
       		sc.close();
       		System.exit(0);
       	}
       	}
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
    }while(choice!=14);

}
}
