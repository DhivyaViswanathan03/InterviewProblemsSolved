package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int[] a = { 5, 2, 8, 3, 1, 1 };
		int result = Arrays.stream(a).distinct().sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("no elements"));
//		System.out.println(result);
		System.out.println(Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

	}

}
