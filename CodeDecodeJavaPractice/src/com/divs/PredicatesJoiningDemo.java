package com.divs;

import java.util.function.Predicate;

public class PredicatesJoiningDemo {

	public static void main(String[] args) {
		Predicate<String> lengthCheck=s->s.length()>5;
		Predicate<String> evenCheck=s->s.length()%2==0;
		System.out.println(lengthCheck.and(evenCheck).test("HelloPrograms"));
		System.out.println(lengthCheck.or(evenCheck).test("HelloPrograms"));
		System.out.println(evenCheck.negate().test("HelloPrograms"));

	}

}
