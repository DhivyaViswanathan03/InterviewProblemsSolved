package com.divs.codingpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIncreasingOrderOfLength {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", 
				                     "Kotlin", "C++", "COBOL", "C");
//		List<String> result=listOfStrings.stream().sorted(Comparator.comparing(a->a.length())).collect(Collectors.toList());
		List<String> result=listOfStrings.stream().sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());
		System.out.println(result);
		System.out.println();
	}

}
