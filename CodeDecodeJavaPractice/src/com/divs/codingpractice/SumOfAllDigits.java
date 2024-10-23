package com.divs.codingpractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfAllDigits {

	public static void main(String[] args) {
		int i = 15623;
		long result=Arrays.stream(String.valueOf(i).split("")).mapToInt(a->Integer.parseInt(a)).summaryStatistics().getSum();
        System.out.println(result);
	}

}
