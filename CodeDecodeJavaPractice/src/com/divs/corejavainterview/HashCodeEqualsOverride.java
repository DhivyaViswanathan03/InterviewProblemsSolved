package com.divs.corejavainterview;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Emp{
	private Integer id;
	private String name;
	private Integer salary;
	
	public Emp(Integer id, String name, Integer salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name, salary);
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Emp other = (Emp) obj;
//		return Objects.equals(id, other.id) 
//				&& Objects.equals(name, other.name) 
//				&& Objects.equals(salary, other.salary);
//	}
//	
	@Override
	public int hashCode() {
		return Objects.hash(id,name,salary);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o)
			return true;
		else if(this.getClass()!=o.getClass())
			return false;
		else if(o==null)
			return false;
		else {
			Emp o1=(Emp)o;
			return Objects.equals(this.id,o1.id) 
					&& Objects.equals(this.name, o1.name)
					&& Objects.equals(this.salary, o1.salary);
		}
		
	}
	
	
}

public class HashCodeEqualsOverride {


	public static void main(String[] args) {
		
		Emp e1=new Emp(1, "divs", 5000);
		Emp e2=new Emp(1, "divs", 5000);
		
		Emp e3=new Emp(1, "priya", 5000);
		
		Set<Emp> set=new HashSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		System.out.println(set);
		
//		System.out.println(e1.equals(e2));

	}

	@Override
	public String toString() {
		return "HashCodeEqualsOverride []";
	}

}
