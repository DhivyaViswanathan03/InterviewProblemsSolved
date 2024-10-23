package com.divs;

import java.util.function.Predicate;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
//        Predicate<String> predicate=(s)->s.length()>5;
		
		Predicate<String> predicate=MethodReferenceDemo::lengthCheck;
		
		System.out.println(predicate.test("Hello"));

	}
	
	static boolean lengthCheck(String s) {
		if(s.length()>5)
			return true;
		else
			return false;
	}

}
