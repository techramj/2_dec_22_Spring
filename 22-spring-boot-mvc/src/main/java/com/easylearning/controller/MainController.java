package com.easylearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easylearning.entity.Project;

@Controller
public class MainController {
	
	@RequestMapping(value = "test")
	@ResponseBody
	public String test() {
		return "test";
	}
	
	@RequestMapping(value="sample")
	public String samplePage() {
		return "sample";
	}
	
	@RequestMapping(value= {"/", "/home"})
	public String homepage(Model model) {
		
		Project project = new Project();
		project.setName("MVC Project");
		project.setSponsor("Seed Infotech");
		project.setDescription("Help to implement the project management project");
		model.addAttribute("currentProject", project);
		return "home";
	}

}
