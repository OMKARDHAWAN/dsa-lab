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
	list.addAtPos(50, 1);
	list.displayList();
	list.addAtPos(60, 3);
	list.displayList();
	list.addAtNum(80,10);
	list.displayList();
	list.deleteByVal(60);
	list.displayList();
	list.deleteByPos(2);
	list.displayList();
}
}
