package com.divs;

import java.util.List;
import java.util.Objects;

public class Employe {
	
	private int id;
	private String name;
	private List<String> cities;
	
	

	public Employe(int id, String name, List<String> cities) {
		super();
		this.id = id;
		this.name = name;
		this.cities = cities;
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
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", cities=" + cities + "]";
	}
	
	

}
