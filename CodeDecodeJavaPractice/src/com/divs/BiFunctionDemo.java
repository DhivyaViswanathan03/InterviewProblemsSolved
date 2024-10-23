package com.divs;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction=(a,b)->(a*b);
		System.out.println(biFunction.apply(2, 3));

	}

}
