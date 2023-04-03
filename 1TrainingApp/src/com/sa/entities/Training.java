package com.sa.entities;

import java.util.ArrayList;
import java.util.List;

public class Training {
	
	private long id;
	private String name;
	private Trainer trainer; //Training has one Trainer
	private List<Trainee> trainees = new ArrayList<Trainee>(); //Training has many trainees
	private Course course; //Training has one Course
	
	public Training(long id, String name, Trainer trainer) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
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

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public int getNumberofTrainees() {
		return trainees.size();
	}
	
	public String getTrainingOrganizationName() {
		return trainer.getOrg().getName();	
	}
	
	public int getTrainingDurationInHrs() {
		List<Module> modules = new ArrayList<Module>();
		modules = course.getModules();
		int durationInHrs = 0;
		for(Module module : modules) {
			for(Unit unit : module.getUnits()) {
				durationInHrs += unit.getDurationInHrs();
			}
		}
		return durationInHrs;
	}
}
