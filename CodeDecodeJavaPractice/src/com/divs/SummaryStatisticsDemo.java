package com.divs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.divs.codingpractice.Employee;

public class SummaryStatisticsDemo {

	public static void main(String[] args) {
		List<Employee> empList=Arrays.asList(new Employee(1, "divs", 20,1000),
				new Employee(2, "priya", 26,5000),
				new Employee(3, "mouli", 31,3000),
				new Employee(4, "reka", 21,2500),
				new Employee(5, "suma", 30,6000));
		
		List<Integer> list=empList.stream().map(a->a.getAge()).collect(Collectors.toList());
		System.out.println(list.stream().mapToInt(a->a).summaryStatistics().getMax());
		System.out.println(list.stream().mapToInt(a->a).summaryStatistics().getAverage());

	}
}
