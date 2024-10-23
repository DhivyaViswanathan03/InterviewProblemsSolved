package com.divs.codingpractice;

public class MultiplyTwoNosUsingFuncInterface {

	public static void main(String[] args) {
		
		ICustomInterface cusInterface=(a,b)->a*b;
		System.out.println(cusInterface.multiply(11, 5));

	}

}
