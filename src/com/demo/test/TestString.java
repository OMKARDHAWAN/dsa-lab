package com.demo.test;

import java.nio.charset.CharacterCodingException;
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
//      hashmap
//	
	String word = "john";
	
	HashMap<Character , Integer> map = new HashMap<>();
	
    for(Character ch : word.toCharArray() ) {
    	  if(map.containsKey(ch)){
    		  System.out.println("Duplicate found!!!");
    		  break;
    	  }
    	  map.put(ch, 1);
    }
	
    
	
}
  
 
  
  
}

