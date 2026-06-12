package com.demo.model;

public class CircularDoublyLinkedList {
  Node head;
  
  class Node {
	int data;
	Node next;
	Node prev;
	
	public Node(int val) {
		data = val;
		next = null;
		prev = null;
	}
  }
  
  public CircularDoublyLinkedList(){
	 head = null;
  }
  
  
  public void addNode(int val) {
   Node newNode = new Node(val);
//	add node when list is empty  
   if(head == null) {
		  head = newNode;
		  newNode.next = head;
		  newNode.prev = head;
	  }else {
		  Node temp = head.prev;

		  newNode.next = head;
		  temp.next = newNode;
		  newNode.prev = temp;
		 
	  }
  }
  
  public void addNodeByPos(int pos , int val) {
	  Node newNode = new Node(val);
	  
	  if(head == null) {
		  System.out.println("list is empty");
	  }else {
		  if(pos == 1) {
			  Node temp = head.prev;
			  newNode.next = head;
			  newNode.prev = temp;
			  head.prev = newNode;
			  head = newNode;
			  temp.next = newNode;
		  }else {
			  Node temp = head;
			  int i = 1;
			  for(;temp.next!=head  && i<=pos-2;i++) {
					temp=temp.next;
				}
			  if(i > pos - 2) {
				  newNode.prev = temp;
				  newNode.next = temp.next;
				  temp.next.prev = newNode;
				  temp.next = newNode;
			  }else {
				  System.out.println(pos+ "out of scope");
			  }
			  
			  
		  }
	  }
	  
	  
	  
	  
	
  }
  
  
  public void addAfterNum(int val) {
	  Node newNode = new Node(val); 
	  if(head == null) {
		  System.out.println("list is empty");
	  }else {
		  Node temp =head;
		  while(temp.next != head && temp.data != val) {
			  temp =temp.next;
		  }
		  
		  if(temp.data == val) {
			  newNode.prev=temp;
				newNode.next=temp.next;
				temp.next.prev=newNode;
				temp.next=newNode;
		  }else {
			  System.out.println(val+" not found");
		  }
		  
		  
	  }
  }
  
 public void DisplayNode(){
	 Node temp = head;
	 do {
		 System.out.print(temp.data + "---->");
		 temp = temp.next;
	 }while(temp!= head);
	 System.out.println();
	 
	 
 }
  
}

