package com.divs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.divs.codingpractice.Employee;

public class GroupingByDemo {

	public static void main(String[] args) {
		List<Employee> empList=Arrays.asList(new Employee(1, "divs", 31,1000),
				new Employee(2, "priya", 26,5000),
				new Employee(3, "mouli", 31,3000),
				new Employee(4, "reka", 20,2500),
				new Employee(5, "suma", 30,6000),
				new Employee(6, "reka", 20,2500));
		
//		Employe e1=new Employe(1, "code", Arrays.asList("pune","chennai","bengalure"));
//		Employe e2=new Employe(2, "Decode", Arrays.asList("pune","hydrabad","noida"));
//		Employe e3=new Employe(3, "code_decode", Arrays.asList("bengaluru","mumbai","delhi"));
//		Employe e4=new Employe(1, "code1", Arrays.asList("chennai","bengalure"));
//		
//		List<Employe> list=new ArrayList<Employe>();
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
		
		//Map<Object, List<Employe>> values = list.stream().collect(Collectors.groupingBy(a->a.getId()));
		System.out.println();
		
		 Map<Object, Set<Employee>> values = empList.stream().collect(Collectors.groupingBy(a->a.getAge(),Collectors.toSet()));
		System.out.println(values);

	}

}
