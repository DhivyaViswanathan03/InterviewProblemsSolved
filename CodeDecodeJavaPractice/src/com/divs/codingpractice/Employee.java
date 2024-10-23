package com.divs.codingpractice;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	

	private int id;
	private String name;
	private int age;
	private int salary;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	

	@Override
	public int compareTo(Employee o) {
		int age1=this.getAge();
		int age2=o.getAge();
		if(age1<age2)
			return -1;
		else if(age1>age2)
			return 1;
		else
			return 0;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(name, other.name);
//	}
//	




}
