package com.student.VO;

import com.student.entity.Student;

public class ResponseTemplateVo {
	
	private College college;
	private Student student;
	public ResponseTemplateVo() {
		super();
	}
	public ResponseTemplateVo(College college, Student student) {
		super();
		this.college = college;
		this.student = student;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
