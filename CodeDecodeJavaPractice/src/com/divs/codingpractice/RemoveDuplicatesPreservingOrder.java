package com.divs.codingpractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesPreservingOrder {

	public static void main(String[] args) {
		String[] a1= {"apple","banana","avacoda","grapes","fruitsjuice","apple"};
		Set<String> set=new LinkedHashSet();
		List<String> result=Arrays.stream(a1).filter(a->set.add(a))
		.peek(a->System.out.println(a))
		.collect(Collectors.toUnmodifiableList());
		System.out.println(result);
	}

}
