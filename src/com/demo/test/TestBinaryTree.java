package com.demo.test;

import java.util.Scanner;

import com.demo.model.MyBinaryTree;

public class TestBinaryTree {
public static void main(String[] args) {
	MyBinaryTree tree= new MyBinaryTree();
	tree.insertNode(20);
	tree.insertNode(30);
	tree.insertNode(10);
	tree.insertNode(40);
	tree.insertNode(50);
	tree.deleteNode(10);
	tree.preOrder();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter key to search:");
	int key = sc.nextInt();
    tree.search(key);	
	

}
}
