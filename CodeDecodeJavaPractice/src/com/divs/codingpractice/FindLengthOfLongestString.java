package com.divs.codingpractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindLengthOfLongestString {

	public static void main(String[] args) {
		
		String[] a1= {"apple","banana","avacoda","grapes","fruitsjuice"};
		
		int result = Arrays.stream(a1).mapToInt(str->str.length())
		.peek((a)->System.out.println(a))
		.max().orElse(0);
		System.out.println(result);
		System.out.println();


		

	}

}
