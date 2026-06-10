package com.demo.test;

import com.demo.model.OperationOFMatrix;

public class TestOpearation {
public static void main(String[] args) {
	OperationOFMatrix op = new OperationOFMatrix();
	op.acceptMatrix1();
	op.acceptMatrix2();
	op.displayMatrix();
//	op.addition();
//	op.displayMatrix3();
//	op.subtraction();
//	op.displayMatrix3();
//	op.multiplication();
//	op.displayMatrix3();
	op.transpose();
	op.identity();
	
}
}
