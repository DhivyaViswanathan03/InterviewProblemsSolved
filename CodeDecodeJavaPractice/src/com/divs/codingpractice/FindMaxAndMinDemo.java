package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMinDemo {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		int maxEle=listOfIntegers.stream().mapToInt(a->a).summaryStatistics().getMax();
		System.out.println("Max ele is "+maxEle);
		int minEle=listOfIntegers.stream().mapToInt(a->a).summaryStatistics().getMin();
		System.out.println("Min ele is "+minEle);

	}

}
