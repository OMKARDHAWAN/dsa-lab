package com.demo.test;

import com.demo.model.My2dArray;

public class Test2d {
  public static void main(String[] args) {
	My2dArray M = new My2dArray();
	
//	M.add();
	M.add();
	M.display();
//	M.shiftByRow(false, 2);
	M.rotateByCol(false,2);
	M.display();
}
  	
}
