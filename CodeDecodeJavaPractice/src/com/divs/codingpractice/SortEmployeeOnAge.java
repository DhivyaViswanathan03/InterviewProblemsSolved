package com.divs.codingpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortEmployeeOnAge {

	public static void main(String[] args) {
		
		List<Employee> empList=Arrays.asList(new Employee(1, "divs", 20),
				new Employee(2, "priya", 26),
				new Employee(3, "mouli", 31),
				new Employee(4, "reka", 21),
				new Employee(5, "suma", 30));
		
		
		
		TreeSet<Employee> set=new TreeSet();
		set.add(new Employee(1, "divs", 20));
		set.add(new Employee(2, "priya", 26));
		set.add(new Employee(3, "mouli", 31));
		set.add(new Employee(4, "reka", 21));
		set.add(new Employee(5, "suma", 30));
		
		
		System.out.println(set);
		
		System.out.println();
		
//		Collections.sort(empList, new MyComparator());
//		System.out.println(empList);
		
		//Using stream API
		
//		List<Employee> result=empList.stream().sorted(new MyComparator()).collect(Collectors.toList());
		List<Employee> result=empList.stream().sorted((a,b)->a.getAge()-b.getAge()).collect(Collectors.toList());
		System.out.println(result);
		
		

	}

}
class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int age1=o1.getAge();
		int age2=o2.getAge();
		if(age1>age2)
			return -1;
		else if(age1<age2)
			return 1;
		else
			return 0;
	}
	
}
