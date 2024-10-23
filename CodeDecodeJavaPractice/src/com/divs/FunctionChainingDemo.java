package com.divs;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> function=i->i*2;
		Function<Integer, Integer> cubefunction=i->i*i*i;
		System.out.println(function.andThen(cubefunction).apply(2));
		System.out.println(function.compose(cubefunction).apply(2));

	}

}
