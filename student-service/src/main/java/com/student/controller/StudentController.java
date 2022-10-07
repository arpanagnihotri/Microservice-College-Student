package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.VO.ResponseTemplateVo;
import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@PostMapping("/insert")
	public Student saveStudent(@RequestBody Student student) {
		return ss.saveStudent(student);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVo getStudentWithCollege(@PathVariable("id") int s_id) {
		return ss.getStudentWithCollege(s_id);
	}
	
	@GetMapping("/")
	public List<Student> getAllStudent(){
		return ss.getAllStudent();
	}
}
