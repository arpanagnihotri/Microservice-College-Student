package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int s_id;
	private String s_name;
	private String s_marks;
	
	private int c_id;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int s_id, String s_name, String s_marks, int c_id) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_marks = s_marks;
		this.c_id = c_id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_marks() {
		return s_marks;
	}

	public void setS_marks(String s_marks) {
		this.s_marks = s_marks;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_marks=" + s_marks + ", c_id=" + c_id + "]";
	}
	
	
}
