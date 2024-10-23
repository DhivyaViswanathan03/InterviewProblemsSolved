package com.divs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.divs.codingpractice.Employe;

public class FrequencyDemo {

	public static void main(String[] args) {
		List<Employe> empList=Arrays.asList(new Employe(1, "code", Arrays.asList("pune","delhi")),
				new Employe(2, "code_decode", Arrays.asList("chennai","noida","pune")),
				new Employe(3, "code", Arrays.asList("bengaluru","mumbai")),
				new Employe(4, "decode", Arrays.asList("noida","mumbai")),
				new Employe(5, "decode", Arrays.asList("pune","mumbai")),
				new Employe(6, "decode", Arrays.asList("chennai","mumbai")));
		
		List<String> namesList=empList.stream().map(e->e.getName()).peek(name->System.out.println(name)).collect(Collectors.toList());
		System.out.println(namesList);
		System.out.println();
		Set<String> result=namesList.stream().filter(name->Collections.frequency(namesList, name)>1).peek(name->System.out.println(name)).collect(Collectors.toSet());
		System.out.println(result);
	}

}
