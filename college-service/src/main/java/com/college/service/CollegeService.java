package com.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.College;
import com.college.repository.CollegeRepository;

@Service
public class CollegeService {
	
	@Autowired
	private CollegeRepository cr;

	public College saveCollege(College college) {
		
		return cr.save(college);
	}

	public College findCollegeById(int c_id) {
		
		return cr.findById(c_id).orElse(null);
	}

	public List<College> getAllCollege() {
		List<College> college=cr.findAll();
		return college;
	}
}
