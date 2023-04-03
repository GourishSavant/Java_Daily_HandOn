package com.sa.entities;

import java.util.ArrayList;
import java.util.List;

public class Module {
	
	private long id;
	private String name;
	private List<Unit> units = new ArrayList<Unit>(); //Module has many Units
	
	public Module(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}
	
	

}
