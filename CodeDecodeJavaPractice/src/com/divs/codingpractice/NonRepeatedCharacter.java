package com.divs.codingpractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day";
		Map<String, Long> result = Arrays.stream(inputString.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		String str = result.entrySet().stream().filter(a->a.getValue()>1).map(a->a.getKey()).findFirst().get();
		System.out.println(str);
		
		
		List<String> a1=  result.entrySet().stream()
				.filter(a->a.getValue()==1).map(a->a.getKey()).collect(Collectors.toList());
		System.out.println(a1);
	}

}
