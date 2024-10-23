package com.divs.corejavainterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Customer c1=new Customer(11, "divs", 10000);
		Customer c2=new Customer(2, "priya", 80000);
		Customer c3=new Customer(32, "revathi", 40000);
		Customer c4=new Customer(14, "mouli", 90000);
		Customer c5=new Customer(15, "divs", 30000);
		
		Map<String,Customer> map=new HashMap();
		map.put(c1.getName(), c1);
		map.put(c2.getName(), c2);
		map.put(c3.getName(), c3);
		map.put(c4.getName(), c4);
		map.put(c5.getName(), c5);
		
		Customer c6=new Customer(14, "mouli", 90000);
		Customer c7=new Customer(15, "divs", 30000);
		
		List<String> list=new ArrayList(map.keySet());
		
		Collections.sort(list);
		System.out.println(list);
		
		List<Customer> list1=new ArrayList(map.values());
		Collections.sort(list1,new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});
		System.out.println(list1);
		

	}

}
