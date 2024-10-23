package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNoOfOccuranceOfWordsInString {

	public static void main(String[] args) {
		
		String str="Welcome to java welcome to Hello World";
		str=str.toLowerCase();
		List<String> lists=Arrays.asList(str.split(" "));
		Map<String,Long> map=lists.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
	}

}
