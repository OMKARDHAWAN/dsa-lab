package com.demo.model;

public class CircularLinkedList {
  Node head;
  public CircularLinkedList() {
	  head = null;
  }
  
  class Node{
	 int data;
	 Node next;

	 
	 public Node(int val){
		 data = val;
		 next = null;
	 }	 
  }
  
  public void addNode(int val){
	  Node newNode = new Node(val);
	  if(head == null) {
		  head = newNode;
	  }else {
		  Node temp = head;
          
		  while(temp.next != head) {
			  temp = temp.next;
		  }
		  
		  temp.next = newNode;
		  
		  
	  }
	  newNode.next = head;
  }
  
  
  public void addbyPos(int val , int pos){
	  

	  
	  if(head == null) {
		  System.out.println("List is empty!!!");
	  }else {
	    Node temp = head;
		Node newNode = new Node(val);
		  
	  if(pos == 1){
		  while(temp.next != head) {
			  temp = temp.next;
		  }  
		  newNode.next = head;
		  head = newNode;
		  temp.next = newNode;
	  }else {
		  int i = 1;
		  
		  for(; temp.next != head && i <= pos - 2 ; i++) {
			  temp = temp.next;
		  }
		  
		  if(i > pos - 2) {
			  newNode.next=temp.next;
		    	temp.next=newNode;
		  }else {
			  System.out.println(pos + "is beyond the limit!!!");
		  }
		  
		  
		  
	  }
	  }
	  
	  
  }
  
  public void addafterByNum(int val , int num){
	  Node newNode = new Node(val);
	  if(head == null) {
		  head = newNode;
	  }else {
		  Node temp = head;
		  if(head.data == num) {
			newNode.next = head.next;
			head = newNode;			
		  }else{
			  do{
				temp = temp.next;  
			  }
			  while(temp.next != head  && temp.data != num);
			  
			  if(temp != head) {
				  newNode.next = temp.next;
				  temp.next =newNode;
			  }
		  }
	  }
	  
	  
  }
   
  
  public void deleteByPos(int pos){
	if(head == null) {
		System.out.println("List is empty!!!");
	
	}else {
		
		if(pos == 1) {
      //	delete first node if list contain only one element
			if(head.next == head) {
				head = null;
			}else {
           //	delete first element if list contain element more than one
				Node temp = head;
				Node tail = head;
				
			// place tail at last node;
				while(tail.next != head) {
					tail = tail.next;
				}
				
				head = temp.next;
				
				tail.next = head;
				temp.next = null;			
			}
		}else {
        // delete element in middle and end if list contain more than one element
			Node temp = head;
			Node prev = null;
			int i = 1;
			
			for( ; temp.next != head && i <= pos - 1 ; i++) {
				prev = temp;
				temp =temp.next;
			}
			
			if(i > pos - 1){
              prev.next = temp.next;
              temp.next = null;
			}else {
				System.out.println(pos + "beyond the limit");
			}
			
			
		}
		
		
		
		
		
	}
  
  }
  
  
  public void delteByVal(int val) {
	  
	  if(head == null ) {
		  System.out.println("List is Empty !!!!");
	  }else {
//		  element is at first position
		  
		  if(head.data == val) {
      // element is at first position but list has only one value
			  if(head.next == head) {
			    	  head = null;
			  }else {
      // element is at first position but list has two or more element 	  
				Node temp = head;
				Node tail = head;
			
				while(tail.next != head){
					tail = tail.next;
				}
			    	
				if(tail.next != head){
					head = head.next;
					tail.next = head;
					temp.next = null;
				}else {
					System.out.println("Value not Found!!");
				}		  
			  }
		  }else {
//			  value is at middle or at end
			  Node temp = head;
			  Node tail = null;
			  
			  do {
				  tail = temp;
				  temp =temp.next;
			  }while(temp != head && temp.data != val);
			  
//			  10-->20-->30-->40-->50
			  
			  if(temp.data == val){
				  tail.next = temp.next;
				  temp.next = null;
			  }else {
				  System.out.println(val + "not found!!!");
			  }
			  
			  
			  
			  
			  
		  }
		  
	  }
	  
	  
	  
	  
  }

  public void displayList() {  
	  Node temp=head;
		do {
			System.out.print( temp.data+"---->");
			temp=temp.next;
		}while(temp!=head);
		System.out.println("null");
}
}