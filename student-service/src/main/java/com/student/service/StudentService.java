package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.student.VO.College;
import com.student.VO.ResponseTemplateVo;
import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository sr;
	
	@Autowired
	private RestTemplate restTemplate;

	public Student saveStudent(Student student) {
		return sr.save(student);
	}

	public ResponseTemplateVo getStudentWithCollege(int s_id) {
		ResponseTemplateVo vo=new ResponseTemplateVo();
		Student student=sr.findById(s_id).get();
		
		College college=restTemplate.getForObject("http://localhost:6000/college/"+student.getC_id(), College.class);
		
		vo.setStudent(student);
		vo.setCollege(college);
		return vo;
		
	}

	public List<Student> getAllStudent() {
		List<Student> student=sr.findAll();
		return student;
	}
	
}
