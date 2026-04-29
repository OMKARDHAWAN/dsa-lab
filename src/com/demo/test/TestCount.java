package com.demo.test;

import com.demo.model.CountSort;

public class TestCount {
public static void main(String[] args) {
	int arr[] = {5,1,7,8,3,2,4,5,6,9,8,2,1,5,4,7};
	
	CountSort C = new CountSort();
	C.Countsort(arr);
}
}
