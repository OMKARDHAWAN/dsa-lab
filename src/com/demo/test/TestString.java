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

	  String Word = "JohnTheDon";
	  int length = Word.length();
//	  for(int i = Word.length() - 1 ; i >= 0 ; i--) {
//		  System.out.print(Word.charAt(i)); 
//	  }
//	  
	  
	  //using stringbuilder;
	  
	  StringBuilder str = new StringBuilder(Word);
	  
	  System.out.print(str.reverse());
	  
   }
  
 public static boolean checkAngrom(String s , String t){
	 
	 if(s.length() != t.length()) return false;
	 
	 
	 HashMap<Character, Integer> map = new HashMap<>();
	 
	 for(char ch : s.toCharArray()) {
		 map.put(ch, map.getOrDefault(ch,0) + 1 );
	 }
	 
	 
	 
	 for(char ch : t.toCharArray()){
		 if(!map.containsKey(ch)) return false;
		 
		 map.put(ch, map.get(ch) - 1);
	  
		 if(map.get(ch) == 0){
			 map.remove(ch);
		 }
		 
	 }
	 
	 
	 
	 
	 return map.isEmpty();
 }
  
 
 
  
}

