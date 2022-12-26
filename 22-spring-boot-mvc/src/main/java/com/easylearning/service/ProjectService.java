package com.easylearning.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.easylearning.entity.Project;

@Service
public class ProjectService {
	
	private List<Project> projects = new ArrayList<>();
	
	public ProjectService() {
		Project java=createNewProject("Java Project", "This is java project");
		Project js=createNewProject("Java Scruipt", "This is JS project");
		Project webMvc=createNewProject("Spring MVC Project", "This is Sprig MVC project");
		this.projects.addAll(Arrays.asList(java,js,webMvc));
	}
	
	public List<Project> findAll(){
		return projects;
	}
	
	public Project findById(Long id) {
		return projects.stream().filter(p->p.getProjectId().equals(id)).findAny().get();
	}
	
	public void addProject(Project project) {
		project.setProjectId(++id);
		projects.add(project);
	}
	
	
	
	private static long id=0;
	private Project createNewProject(String projectName, String desc) {
		Project project = new Project();
		project.setDescription(desc);
		project.setName(projectName);
		project.setProjectId(++id);
		return project;
	}

}
