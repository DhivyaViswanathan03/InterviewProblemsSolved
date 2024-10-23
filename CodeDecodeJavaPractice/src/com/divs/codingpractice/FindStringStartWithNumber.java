package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringStartWithNumber {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		List<String> result = listOfStrings.stream().filter(a -> Character.isDigit(a.charAt(0)))
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
