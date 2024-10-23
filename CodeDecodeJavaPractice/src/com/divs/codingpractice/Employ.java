package com.divs.codingpractice;

public class Employ {
	
	private Integer eid;
	private String name;
	private String dept;
	private Integer salary;
	
	
	public Employ(Integer eid, String name, String dept, Integer salary) {
		this.eid = eid;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employ [eid=" + eid + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	

}
