package com.sa.entities;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
	
	private long id;
	private String name;
	private Organization org; //Trainer has one Organization
	private List<Trainee> trainees = new ArrayList<Trainee>(); //Trainer has many trainees
	private List<Training> trainings = new ArrayList<Training>(); //Trainer has many trainings
	
	public Trainer(long id, String name, Organization org) {
		super();
		this.id = id;
		this.name = name;
		this.org = org;
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

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	public List<Training> getTrainings() {
		return trainings;
	}

	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}
	
	

}
