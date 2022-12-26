package com.easylearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.easylearning.entity.Project;
import com.easylearning.service.ProjectService;

@RequestMapping("project")
@Controller
public class ProjectController {
	
	@Autowired
	public ProjectService projectService;
	
	
	@RequestMapping(value = "/add", method=RequestMethod.GET)
	public String addProject() {
		System.out.println("get method");
		return "project_add";
	}
	
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public String saveProject(@ModelAttribute Project project, Model model) {
		projectService.addProject(project);
		System.out.println(project);
		model.addAttribute("projects", projectService.findAll());
		return "projects";
	}
	
	
	@RequestMapping(value="/find")
	public String find(Model model) {
		model.addAttribute("projects", projectService.findAll());
		return "projects";
	}
	
	@RequestMapping(value="/{id}")
	public String findById(Model model, @PathVariable("id") Long id) {
		
		model.addAttribute("project", projectService.findById(id));
		return "project";
	}

}
