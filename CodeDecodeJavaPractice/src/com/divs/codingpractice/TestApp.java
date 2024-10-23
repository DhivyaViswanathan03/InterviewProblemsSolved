package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TestApp {

	public static void main(String[] args) {
		 List<Employ> empList=Arrays.asList(new Employ(1,"divs","dev",17000),
		    		new Employ(4,"priya","qa",9000),
		    		new Employ(5,"mouli","dev",8000),
		    		new Employ(11,"suma","qa",72000),
		    		new Employ(10,"viswa","tes",5000));
		System.out.println(empList.stream()
		 .collect(Collectors.groupingBy(e->e.getDept(),
				 Collectors.reducing(BinaryOperator
						 .maxBy((a,b)->a.getSalary()-b.getSalary())))));
	}
}
