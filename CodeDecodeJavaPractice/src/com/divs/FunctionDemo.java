package com.divs;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> function=i->i*2;
		System.out.println(function.apply(2));

	}

}
