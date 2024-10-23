package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JoinStrWithDelimeter {

	public static void main(String[] args) {
		List<String> listOfStrings = 
				Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String result = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(result);
		System.out.println();
		

	}

}
