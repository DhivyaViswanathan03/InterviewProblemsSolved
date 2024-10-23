package com.divs;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate=(a,b)->(a+b)%2==0;
		System.out.println(biPredicate.test(2, 3));

	}

}
