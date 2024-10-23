package com.divs.codingpractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindFirstElementStartingWithSpecificChar {

	public static void main(String[] args) {
		
		String[] str= {"apple","banana","grapes","blueberry"};
		Arrays.stream(str).filter(a->a.startsWith("b"))
		.forEach(System.out::println);

	}

}
