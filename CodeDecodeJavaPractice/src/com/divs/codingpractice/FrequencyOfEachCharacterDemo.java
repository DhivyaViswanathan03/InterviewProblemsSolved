package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterDemo {

	public static void main(String[] args) {
		 String inputString = "Java Concept Of The Day";
		 List<String> strList=Arrays.asList(inputString.split(""));
		 Map<String, Long> result = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(result);
		 Entry<String, Long> a = result.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		 result.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		 System.out.println(a);
	}

}
