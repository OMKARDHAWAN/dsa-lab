package com.demo.test;

import com.demo.model.MyArray;

public class TestArray {
public static void main(String[] args) {
	MyArray M = new MyArray(5);
	M.add(10);
	M.add(20);
	M.add(80);
	M.add(60);
	M.add(70);
	M.display();
	System.out.println(" ");
	
	M.reverseArray(false);
	M.display();
	
	System.out.println(" ");
	

}
}
