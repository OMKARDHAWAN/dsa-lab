package com.demo.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestString {
	
	

  public static boolean Ispalindrome(String word) {
	  int start = 0;
	  int end = word.length() - 1;
	  while(start < end){
			
			if(word.charAt(start) != word.charAt(end)){
				return false;
			}
			start++;
			end--;
			return true;
		}
	  
	  
	  return false;
  }
  public static void main(String[] args) {
	String name = "Hello world!!";
	
	//  string reversing 
    //	string letter counting
	
//	String word = "madamadam";
//	int start = 0;
//	int end = word.length();
//	
//	
//	boolean palindrome = Ispalindrome(word);
//	if(palindrome) {
//		System.out.println("Palindrome!!!");
//	}else {
//		System.out.println("Not palindrome");
//	}
//	
//	
	
	
//	word reverse
	String sentence  = "Hello This is Omkar Dhawan";
	
	String[] array = sentence.split(" ");
	
	StringBuilder st = new StringBuilder();
	
	for(int i = array.length - 1 ; i >= 0 ; i--){
		System.out.print(array[i]);
	}
//	
	String str = "Hello World Java";

    String[] words = str.split(" ");

    for (int i = words.length - 1; i >= 0; i--) {
        System.out.print(words[i] + " ");
    }
	
}
  
}

