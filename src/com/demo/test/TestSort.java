package com.demo.test;

import java.util.Arrays;

import com.demo.model.MergeSort;
import com.demo.model.SortingTech;

public class TestSort {
 public static void main(String[] args) {
	 int[] arr = {};
	 int[] arr1 = {50,20,30,10,40,80,5,100};
	 
	 
	 
	SortingTech S = new SortingTech();


    
    MergeSort M = new MergeSort();
    M.mergeSort(arr1, 0, arr1.length-1);
    
}
}
