package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;

public class DiffInLimitAndSkip {

	public static void main(String[] args) {
		List<Integer> lists=Arrays.asList(10,30,20,80,30,10,70,80,10);
		lists.stream().limit(5).forEach(System.out::println);
		System.out.println();
		lists.stream().skip(5).forEach(System.out::println);

	}

}
