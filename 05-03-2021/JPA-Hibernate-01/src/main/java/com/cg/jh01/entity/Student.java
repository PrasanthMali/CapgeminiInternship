package com.cg.jh01.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.jh01.model.StudentIdentity;

@Entity
@Table(name = "students")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private StudentIdentity sid;

	@Column(name = "stud_name")
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(StudentIdentity sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public StudentIdentity getSid() {
		return sid;
	}

	public void setSid(StudentIdentity sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("sid=%s, name=%s", sid, name);
	}

}