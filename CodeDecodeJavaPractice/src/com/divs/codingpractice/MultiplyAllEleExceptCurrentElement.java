package com.divs.codingpractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MultiplyAllEleExceptCurrentElement {

	public static void main(String[] args) {
		int[] a1= {5,4,2,1};
		int except=4;
		
		int result = Arrays.stream(a1).filter(a->a!=except)
		.reduce((a,b)->a*b).getAsInt();
		System.out.println(Arrays.stream(a1).reduce((a,b)->(a*b)).getAsInt());

		System.out.println(result);

	}

}
