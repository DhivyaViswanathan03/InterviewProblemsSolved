package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Top3SaleriedEmployee {

	public static void main(String[] args) {
		List<Employee> empList=Arrays.asList(new Employee(1, "divs", 20,1000),
				new Employee(2, "priya", 26,5000),
				new Employee(3, "mouli", 31,3000),
				new Employee(4, "reka", 21,2500),
				new Employee(5, "suma", 30,6000));
		
		List<Employee> result=empList.stream().sorted((a,b)->(b.getSalary()-a.getSalary())).limit(3).collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println();
		
		//less than third highest salary
		List<Employee> result1=empList.stream().sorted((a,b)->(b.getSalary()-a.getSalary())).skip(3).collect(Collectors.toList());
		System.out.println(result1);
		
	}

}
