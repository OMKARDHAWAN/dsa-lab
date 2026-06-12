package com.demo.test;

import com.demo.model.CircularLinkedList;

public class TestSingleCircularLinkedList {
public static void main(String[] args) {
	CircularLinkedList clist = new CircularLinkedList();
	
	
	clist.addNode(10);
	clist.addNode(20);
	clist.addNode(30);
	clist.addNode(40);
	clist.addNode(50);
	clist.displayList();
	clist.deleteByPos(2);
	clist.displayList();
	clist.delteByVal(50);
	clist.displayList();
	
	
}
}
