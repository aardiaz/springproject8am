package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bway.springproject.model.Department;
import com.bway.springproject.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService  deptService;
	
	   @GetMapping("/add")
	  public String getDepartment() {
		  
		  return "DepartmentForm";
	  }

	  @PostMapping("/add")
	 public String postDepartment(@ModelAttribute Department  dept) {
		  
		  deptService.addDept(dept);
		  
		 return "DepartmentForm";
	 }
}
