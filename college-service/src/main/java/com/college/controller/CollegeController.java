package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.College;
import com.college.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {
	
	@Autowired
	private CollegeService cs;
	
	@PostMapping("/insert")
	public College saveCollege(@RequestBody College college) {
		return cs.saveCollege(college);
	}
	
	@GetMapping("/{id}")
	public College findCollegeById(@PathVariable("id") int c_id) {
		return cs.findCollegeById(c_id);
	}
	
	@GetMapping("/")
	public List<College> getAllCollege(){
		return cs.getAllCollege();
	}
	
}
