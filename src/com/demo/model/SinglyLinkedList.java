package com.demo.model;

public class SinglyLinkedList {
  public  Node head;
  
  class Node{
	  int data;
	  Node next;
      public Node(int val) {
		// TODO Auto-generated constructor stub
	  data = val;
	  next = null; 
      }	 
  
  }
  
  
  public SinglyLinkedList() {
	  head = null;
  }
  
  
//  add node at end
  public void addNode(int val) {
	  Node newNode = new Node(val);
	  
//	  list is empty
	  if(head == null){
		 head = newNode;
	  }else{
		 Node temp = head;
		 
		 while(temp.next != null) {
			 temp = temp.next;
		 }
		 
//		 add element at end;
		 
		 temp.next = newNode;
		 
	  }
	  
  }
  
  
  public void displayList(){
	  if(head == null) {
		  System.out.println("List is Empty!!!");
	  }else {
   for(Node temp =head;temp!=null ; temp=temp.next){
	   System.out.print(temp.data + "--->");
   }
   System.out.println("null");
	  }
  }
  
  
  
}
