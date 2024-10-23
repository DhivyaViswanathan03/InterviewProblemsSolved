package com.divs.corejavainterview;

import java.io.Serializable;

public class Employe implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}
	
	

}
