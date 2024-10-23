package com.divs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFlatMapDemo {

	public static void main(String[] args) {

		Employe e1 = new Employe(1, "code", Arrays.asList("pune", "chennai", "bengalure"));
		Employe e2 = new Employe(2, "Decode", Arrays.asList("pune", "hydrabad", "noida"));
		Employe e3 = new Employe(3, "code_decode", Arrays.asList("bengaluru", "mumbai", "delhi"));

		List<Employe> empList = new ArrayList();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

//		empList.stream().collect(Collectors.groupingBy(Employe::getName, Employe::getCities));
//		System.out.println(empList);

		Map<String, List<List<String>>> result = empList.stream().collect(
				Collectors.groupingBy(Employe::getName, Collectors.mapping(Employe::getCities, Collectors.toList())));
System.out.println(result);
//		Set<String> result = empList.stream().flatMap(e -> e.getCities().stream()).collect(Collectors.toSet());
//		System.out.println(result);
	}

}
