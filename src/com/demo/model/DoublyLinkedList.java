package com.demo.model;

public class DoublyLinkedList {
   Node head;
	
   
	class Node{
	   Node next;
	   Node prev;
	   int data;
	   
	   public Node(int val) {
		   data  = val;
		   next = null;
		   prev = null; 
	   }
   
	}
	
public DoublyLinkedList(){	
	head = null;
}

//add at end


public void addnode(int val) {
	// TODO Auto-generated method stub

	Node newNode = new Node(val);
	
//case 1 : check wheater list is empty 
	if(head == null) {
		head = newNode;
	}else {
		Node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.prev =temp;
		
	}
	
	
	
	
	
	
}

public void displaList() {
	// TODO Auto-generated method stub
	for(Node temp = head ; temp != null ; temp = temp.next ) {
		System.out.print(temp.data + "----->");
	}
	System.out.println("null");
}

public void addByPos(int pos, int val) {
	// TODO Auto-generated method stub
	Node newNode = new Node(val);
	if(pos == 1) {
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}else {
	    Node temp = head;
	    
	    for(int i = 1 ; temp != null && i <= pos - 2; i++) {
	    	  temp = temp.next;
	    }
	    
	    if(temp != null) {
	    	  
	    	   newNode.next = temp.next;
	    	   newNode.prev = temp;
	    	   
	    	   if(temp.next != null) {
	    		   temp.next.prev = newNode;
	    	   }
	    	   temp.next = newNode;
	    }else{
	    	  System.out.println("Position is out of scope!!!");
	    }
	    
	    
	    
	}
	
	
  
	
	
	
}

public void AddByNum(int val,int num){
	  
	  Node newNode = new Node(val);
	  if(head == null){
		  head = newNode;
	  }else {
		  Node temp = head;
		  
		  while(temp != null && temp.data != num) {
			  temp = temp.next;
		  }
		  
		  if(temp != null) {
			  newNode.next = temp.next;
			  newNode.prev = temp;
			  
			  if(temp.next != null) {
				  temp.next.prev = newNode;
			  }
			  
			  temp.next = newNode;
			  
		  }else {
			  System.out.println("Number not found :" + num);
		  }
		  
		  
		  
		  
	  }
	  
	  
	  
}

public void deleteByPos(int pos) {
	// TODO Auto-generated method stub
	Node temp = head;
	if(pos == 1) {
		head = head.next;
		temp.next = null;
		head.prev = null;
	}else {
		for(int i = 1 ; temp != null && i <= pos - 2 ; i++){
			temp = temp.next;
		}
		
		if(temp != null){
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}else {
			System.out.println("Position is out of scope!!!");
		}
		
		
		
	}
}

public void deleteByNum(int val){
	// TODO Auto-generated method stub
	Node temp = head;
	if(head.data == val) {
		head = head.next;
		head.prev = null;
		temp.next = null;
	}else {
	Node prev = null;
	while(temp != null && temp.data != val){
		prev = temp;
		temp =temp.next;
	}
	
	if(temp != null) {
	    prev.next = prev.next.next;
	    prev.next.prev = prev;
	}else {
		System.out.println("Number not found!!!");
	}
	
	}
}

public void DisplayReverse(){
	if(head == null) {
		System.out.println("List is Empty!!!");
	}else{
       Node temp = head;
       while(temp.next !=null) {
    	   temp = temp.next;
       }
       for(;temp!=null;temp=temp.prev) {
			System.out.print(temp.data+"--->");
		}
       System.out.println("null");
	}
}


}
