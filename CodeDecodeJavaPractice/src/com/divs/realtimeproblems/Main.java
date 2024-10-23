package com.divs.realtimeproblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
         
//		//1.How many male and female employees are there in the organization
//		Map<String,Long> result=employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting()));
//		System.out.println(result);
		
//		studentList.Stream().collect(Collectors.groupingBy(s->s.getName(),)
		
		
//
//		System.out.println(employeeList.stream()
//		.collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting())));
		
//		//2.Print the name of all departments in the organization
	
		
//		System.out.println(employeeList.stream().map(e->e.getDepartment()).distinct()
//				.collect(Collectors.toList()));
//		
//		//3.What is the average age of male and female employees?
//		employeeList.stream().mapToInt(e->e.getAge()).summaryStatistics().getAverage();
//		employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingInt(e->e.getAge())))
//		
		
		
		
//		System.out.println(employeeList.stream()
//		.collect(Collectors.groupingBy(e->e.getGender(),
//				Collectors.averagingInt(e->e.getAge()))));
		
//		Employee emp=employeeList.stream()
//				.max(Comparator.comparingDouble(e->e.getSalary())).get();
//		System.out.println(emp.getName());
		
		
		
//		System.out.println(employeeList.stream()
//		.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge))));
//		
//		//4.Get the details of highest paid employee in the organization?
		
//		System.out.println(employeeList.stream()
//				.collect(Collectors.maxBy(Comparator.comparing(e->e.getSalary()))));
		
		
		
		
		
		
//		Optional<Employee> result = employeeList.stream()
//				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
//		System.out.println(result.get());
//		
//		//5.Get the names of all employees who have joined after 2015?
		
		
		
		
		
		
//		employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(a->a.getName())
//		.forEach(System.out::println);
//		
//        //6.Count the number of employees in each department?
//		Map<String,Long> result1=employeeList.stream()
//		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(result1);
		
//		System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
//				Collectors.averagingDouble(e->e.getSalary()))));
//		
//		//7.What is the average salary of each department?
//		System.out.println(employeeList.stream()
//		.collect(Collectors.groupingBy(e->e.getDepartment(),
//				Collectors.averagingDouble(e->e.getSalary()))));
		
		
//		System.out.println(employeeList.stream()
//		.collect(Collectors.groupingBy(Employee::getDepartment,
//				Collectors.averagingDouble(Employee::getSalary))));
//		
//		Employee emp=employeeList.stream().filter(e->e.getDepartment().equals("Product Development"))
//		.sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
//		System.out.println(emp.getName());
		
//		Employee emp=employeeList.stream().sorted((a,b)->a.getYearOfJoining()-b.getYearOfJoining()).findFirst()
//		.get();
//		System.out.println(emp);
		
		
//		//8.Get the details of youngest male employee in the product development department
		
//		System.out.println(employeeList.stream().sorted((a,b)->a.getAge()-b.getAge()).findFirst());
//		employeeList.stream().filter(e->e.getGender().equals("Male") 
//				&& e.getDepartment().equals("Product Development")).min(Comparator.comparing(Employee::getAge));
		
//		System.out.println(employeeList.stream().filter(e->e.getGender().equals("Male") 
//				&& e.getDepartment().equals("Product Development"))
//		.min(Comparator.comparing(Employee::getSalary)));
//		//9.Who has the most working experience in the organization?
		
//		employeeList.stream().
		
		
		
//		System.out.println(employeeList.stream().sorted((a,b)->a.getYearOfJoining()-b.getYearOfJoining())
//		.findFirst().get());
//		//10.How many male and female employees are there in the sales and marketing team?
//		
//		Map<Object, Long> rs = employeeList.stream().filter(e->e.getDepartment().equals("Sales And Marketing"))
//		.collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting()));
//		System.out.println(rs);
//		
//		//What is the average salary of male and female employees?
//		System.out.println(employeeList.stream()
//		.collect(Collectors.groupingBy(e->e.getGender(),
//				Collectors.averagingDouble(e->e.getSalary()))));
		//List down the names of all employees in each department?
//		
//		Map<Object, List<Employee>> result = employeeList.stream()
//				.collect(Collectors.groupingBy(e->e.getDepartment()));
//		
//		Set<Entry<Object, List<Employee>>> rs = result.entrySet();
//		
//		for(Entry<Object, List<Employee>> entry:rs) {
//			System.out.println("Employees in "+entry.getKey()+" department");
//			for(Employee e:entry.getValue()) {
//				System.out.println(e.getName());
//			}
//			System.out.println();
//		}
		//What is the average salary and total salary of the whole organization
		
//		System.out.println(employeeList.stream().mapToDouble(e->e.getSalary())
//				.summaryStatistics().getAverage());
//		System.out.println(employeeList.stream().mapToDouble(e->e.getSalary())
//				.summaryStatistics().getSum());
		//Separate the employees who are younger or equal to 25 years
		//from those employees who are older than 25 years.
		
//		Map<Boolean, List<Employee>> partitionEmployeesByAge=
//				employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
//		System.out.println(partitionEmployeesByAge);
//		
//		Set<Entry<Boolean,List<Employee>>> result=partitionEmployeesByAge.entrySet();
//		
//		for(Entry<Boolean,List<Employee>> rs:result) {
//			if(rs.getKey()) {
//				
//			}else {
//				
//			}
//			for(Employee e:rs.getValue()) {
//				System.out.println(e.getName());
//			}
//		}
		
		//Who is the oldest employee in the organization? 
		//What is his age and which department he belongs to?
//		Employee e=employeeList.stream()
//		.sorted((a,b)->b.getAge()-a.getAge()).findFirst().get();
//		System.out.println(e.getName());
//		System.out.println(e.getAge());
//		System.out.println(e.getDepartment());
		
		
//		Get Top 2 employees based on salary for each department

		   Comparator<Employee> bySalary = (a,b)->Double.compare(b.getSalary(), a.getSalary());
//		   employeeList.stream().sorted(bySalary)
//		      .collect(Collectors.groupingBy(e->e.getDepartment()))
//		      .entrySet().stream()
//		      .collect(Collectors.toMap(Map.Entry::getKey, 
//		                                v->v.getValue().subList(0, 2),(a,b) -> a))
//		                .forEach((k,v)->System.out.println("K "+k+" - V "+v));
		   
		   Map<String, List<Employee>> result = employeeList.stream().sorted(bySalary)
		      .collect(Collectors.groupingBy(e->e.getDepartment()));
		   
		 result.entrySet()
		   .stream()
		   .collect(Collectors.toMap(e->e.getKey(), e->e.getValue().subList(0, 2)))
		   .forEach((k,v)->System.out.println(k+" "+v));
		   
		   
		
		
		
		
		
		
		
	}

}
