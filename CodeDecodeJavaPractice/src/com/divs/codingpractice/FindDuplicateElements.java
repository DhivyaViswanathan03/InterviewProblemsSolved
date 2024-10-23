package com.divs.codingpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		List<Integer> lists=Arrays.asList(10,30,20,80,30,10,70,80,10);
		Set<Integer> set = new HashSet();
		//using distinct
		//lists.stream().filter(a->!set.add(a)).distinct().forEach(System.out::println);
	    //using collect
//		System.out.println();
		lists.stream().filter(a->!set.add(a)).collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println();
		
		List<Employe> empList=Arrays.asList(new Employe(1, "code", Arrays.asList("pune","delhi")),
				new Employe(2, "code_decode", Arrays.asList("chennai","noida","pune")),
				new Employe(3, "code", Arrays.asList("bengaluru","mumbai")),
				new Employe(4, "decode", Arrays.asList("noida","mumbai")),
				new Employe(5, "decode", Arrays.asList("pune","mumbai")),
				new Employe(6, "decode", Arrays.asList("chennai","mumbai")));
		
		List<String> names=empList.stream().map(e->e.getName()).collect(Collectors.toList());
		Set<String> nameSet = new HashSet();
//		System.out.println(names);
		Set<String> result=names.stream().filter(e->!nameSet.add(e)).collect(Collectors.toSet());
		System.out.println(result);
		System.out.println(nameSet);
		
	}

}
