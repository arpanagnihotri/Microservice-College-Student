package com.college.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int c_id;
	private String c_name;
	private String c_place;
	
	public College() {
		super();
	}
	public College(int c_id, String c_name, String c_place) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_place = c_place;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_place() {
		return c_place;
	}
	public void setC_place(String c_place) {
		this.c_place = c_place;
	}
	@Override
	public String toString() {
		return "College [c_id=" + c_id + ", c_name=" + c_name + ", c_place=" + c_place + "]";
	}
}
