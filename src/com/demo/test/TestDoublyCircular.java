package com.demo.test;

import com.demo.model.CircularDoublyLinkedList;

public class TestDoublyCircular {
public static void main(String[] args) {
	CircularDoublyLinkedList list = new CircularDoublyLinkedList();
	list.addNode(10);
	list.addNodeByPos(2, 20);
	list.addNodeByPos(3, 30);
	list.addNodeByPos(2, 60);
	list.DisplayNode();
}
}
