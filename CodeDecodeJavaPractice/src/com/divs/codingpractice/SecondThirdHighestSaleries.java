package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondThirdHighestSaleries {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "divs", 20, 1000), new Employee(2, "priya", 26, 5000),
				new Employee(3, "mouli", 31, 3000), new Employee(4, "reka", 21, 2500),
				new Employee(5, "suma", 30, 6000));

		List<Integer> result = empList.stream().map(a -> a.getAge()).sorted().skip(1).limit(2)
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
