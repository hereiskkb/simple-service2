package com.eurofins.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement(name="student")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {
	
	@XmlElement(name="id")
	private int id;
	@XmlElement(name="name")
	private String name;
	
	public Student() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
