package com.divs.codingpractice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordInString {

	public static void main(String[] args) {
    String str = "Java Concept Of The Day";
String string=Stream.of(str).map(a->new StringBuffer(a).reverse()).collect(Collectors.joining(" "));
System.out.println(string);
    String result=Arrays.stream(str.split(" ")).map(a->new StringBuffer(a).reverse())
    .collect(Collectors.joining(" "));
    System.out.println(result);
	}

}
