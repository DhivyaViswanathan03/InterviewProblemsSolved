package com.divs.codingpractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstTemnEvenNumbers {

	public static void main(String[] args) {
		IntStream.range(1, 10).map(i->i*2).forEach(System.out::println);

	}

}
