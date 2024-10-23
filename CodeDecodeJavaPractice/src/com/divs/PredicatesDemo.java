package com.divs;

import java.util.function.Predicate;

public class PredicatesDemo {

	public static void main(String[] args) {
		//If length of the String >5 then return true 
		
		Predicate<String> predicate=(s)->s.length()>5;
		
		System.out.println(predicate.test("Hello Java Program"));

	}

}
