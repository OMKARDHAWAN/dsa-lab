package com.demo.test;

import com.demo.model.SinglyLinkedList;

public class TestNode {
 public static void main(String[] args) {
	SinglyLinkedList list = new SinglyLinkedList();
	list.displayList();
	list.addNode(10);
	list.addNode(20);
	list.addNode(30);
	list.displayList();
	
}
}
