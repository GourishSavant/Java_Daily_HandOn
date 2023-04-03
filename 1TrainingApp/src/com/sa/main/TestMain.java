package com.sa.main;

import java.util.ArrayList;
import java.util.List;

import com.sa.entities.*;
import com.sa.entities.Module;

public class TestMain {

	public static void main(String[] args) {
		// Create the objects
		
		Organization org = new Organization("Pratian Technologies");
		
		//Adding org to trainer
		Trainer tr1 = new Trainer(1, "Bala", org);
		
		//Adding trainer to trainee
		Trainee t1 = new Trainee(1, "Ajay", tr1);
		Trainee t2 = new Trainee(2, "Sujay", tr1);
		Trainee t3 = new Trainee(3, "Keerthi", tr1);
		Trainee t4 = new Trainee(4, "Archana", tr1);
		
		List<Trainee> trainees = new ArrayList<Trainee>();
		trainees.add(t1);
		trainees.add(t2);
		trainees.add(t3);
		trainees.add(t4);
		
		//adding many trainees to trainer
		tr1.setTrainees(trainees);
		
		//adding trainer to training
		Training training = new Training(1, "Java Training", tr1);
		
		//adding many trainees to training
		training.setTrainees(trainees);
		
		Course c1 = new Course(1, "Core Java");
		
		//adding course to training
		training.setCourse(c1);
		
		Module m1 = new Module(1, "m1");
		Module m2 = new Module(2, "m2");
		
		List<Module> modules = new ArrayList<Module>();
		modules.add(m1);
		modules.add(m2);
		
		//adding many modules to course
		c1.setModules(modules);
		
		Unit u1 = new Unit(1, "u1", 15);
		Unit u2 = new Unit(2, "u2", 20);
		
		List<Unit> units = new ArrayList<Unit>();
		units.add(u1);
		units.add(u2);
		
		//adding many units to module
		m1.setUnits(units); //35
		m2.setUnits(units); //35
		
		Topic to1 = new Topic("to1");
		Topic to2 = new Topic("to2");
		
		List<Topic> topics = new ArrayList<Topic>();
		topics.add(to1);
		topics.add(to2);
		
		//adding topics to unit
		u1.setTopics(topics);
		u2.setTopics(topics);
		
		System.out.println("Number of Trainees : " + training.getNumberofTrainees());
		System.out.println("Training Org Name : " + training.getTrainingOrganizationName());
		System.out.println("Training Duration In Hrs : " + training.getTrainingDurationInHrs());
		
	}

}
