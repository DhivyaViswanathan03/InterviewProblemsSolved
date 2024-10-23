package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class First10PrimeNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
		List<Integer> result=numbers
				.stream()
				.filter(First10PrimeNumber::isPrime)
				.collect(Collectors.toList());
		System.out.println(result);
		System.out.println();
		
		IntStream.range(2, 30)
		.filter(number->IntStream.range(2, number/2).noneMatch(i->number%i==0))
		.forEach(System.out::println);
		
		
		}
	public static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	

}
