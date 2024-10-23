package com.divs.codingpractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayOfIntegers {

	public static void main(String[] args) {
		int[] a1= {5,7,1,9,2,8,5};
		IntStream.range(0, a1.length/2).forEach(i->{
			int temp=a1[i];
			a1[i]=a1[a1.length-i-1];
			a1[a1.length-i-1]=temp;
		});
		System.out.println(Arrays.toString(a1));

	}

}
