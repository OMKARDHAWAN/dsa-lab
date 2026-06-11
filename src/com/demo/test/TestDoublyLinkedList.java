package com.demo.test;

import com.demo.model.DoublyLinkedList;

public class TestDoublyLinkedList {
 public static void main(String[] args) {
	DoublyLinkedList list = new DoublyLinkedList();	
	list.addnode(10);	
	list.addnode(20);
	list.addnode(30);
	list.addnode(40);
	list.addByPos(3,60);
	list.addByPos(4,80);
	list.addByPos(10, 77);
	list.AddByNum(150,30);
	list.displaList();
	list.deleteByNum(150);
	list.displaList();
}
}
