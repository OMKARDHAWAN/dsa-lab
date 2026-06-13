package com.demo.model;

public class MyBinaryTree {
  Node root;
  class Node{
	  int  data;
	  Node left;
	  Node right;
	  
	  public Node(int val){
		  data = val;
		  right = null;
		  left = null;
	  }
	  
  }

  public MyBinaryTree() {
	  root = null;
  }
  
  
  public void insertNode(int key) {
	  root = insertData(root,key);
  }


  private Node insertData(Node root, int key) {
	// TODO Auto-generated method stub
	Node newNode = new Node(key);
	
	if(root == null) {
		root = newNode;
		return root;
	}else {
		if(key < root.data) {
			root.left = insertData(root.left,key); 
		}else {
			root.right = insertData(root.right,key);
		}
	}
	
	
	return root;
  }
  
  public void deleteNode(int key) {
	  root = deleteData(root,key);
  }
  
  
  public Node deleteData(Node root,int key){
	  if(root == null){
		  return null;
	  }else {
		  if(key < root.data) {
			  root.left = deleteData(root.left,key);
		  }else if(key > root.data) {
			 root.right =  deleteData(root.right,key);
		  }else {
			  
//			  root is at leaf node
			  if(root.left == null && root.right == null) {
				  return null;
			  }
			  
//			  root element at left
			  if(root.left == null) {
				  return root.right;
			  }else if(root.right == null) {
				  return root.left;
			  }
			  
			  
			  root.data = minval(root.right,key);
			  
			  root.right = deleteData(root.right,root.data);
		  }
	  }
	  return root;
  }


  private int minval(Node right, int key) {
	// TODO Auto-generated method stub
	  int minval = root.data;
      while(root.left != null) {
    	   
    	   minval = root.left.data;
    	   root = root.left;
      }
	  return minval;
  }
  
   public void preOrder(){
	   preorderTraversal(root);
	   System.out.println();
   }
  
   public void preorderTraversal(Node root) {
	  if(root != null) {
		  System.out.println(root.data +" ");
		  preorderTraversal(root.left);
		  preorderTraversal(root.right);
	  }
   }

   public void postOrder() {
	  postOrderTraversal(root);
	  System.out.println();
   }
   
   public void postOrderTraversal(Node root) {
	  if(root != null) {
		  postOrderTraversal(root.left);
		  postOrderTraversal(root.right);
		  System.out.println(root.data + " ");
	  }
   }
   
   public void inOrder() {
		  inOrderTraversal(root);
		  System.out.println();
   }
	   
   public void inOrderTraversal(Node root) {
		  if(root != null) {
			  inOrderTraversal(root.left);
			  System.out.println(root.data + " ");
			  inOrderTraversal(root.right);
		  }
   }

   
   public Boolean search(int key) {
	  return searchBinaryTree(root,key);
   }


   private Boolean searchBinaryTree(Node root,int key) {
	// TODO Auto-generated method stub
	   if(root != null) {
		   
	    if(root.data == key) {
	    	 System.out.println("Element found!!");
	    	 return true;
	    }else if(key < root.data) {
	    	   return searchBinaryTree(root.left, key);
	    }else {
	    	   return searchBinaryTree(root.right, key);
	    }
	   
	   }
	   
	   System.out.println("Element not found");
	   return false;
   }
   
   
   
   
   
   
   
   
}
