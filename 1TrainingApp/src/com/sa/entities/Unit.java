package com.sa.entities;

import java.util.ArrayList;
import java.util.List;

public class Unit {
	
	private long id;
	private String name;
	private int durationInHrs;
	private List<Topic> topics = new ArrayList<Topic>(); //Unit has many Topics
	
	public Unit(long id, String name, int durationInHrs) {
		super();
		this.id = id;
		this.name = name;
		this.durationInHrs = durationInHrs;
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

	public int getDurationInHrs() {
		return durationInHrs;
	}

	public void setDurationInHrs(int durationInHrs) {
		this.durationInHrs = durationInHrs;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	

}
