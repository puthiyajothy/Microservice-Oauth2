package com.java.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="allocation1")
public class Allocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	Integer empid;
	Integer startdate;
	Integer enddate;
	String project;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public Integer getStartdate() {
		return startdate;
	}
	public void setStartdate(Integer startdate) {
		this.startdate = startdate;
	}
	public Integer getEnddate() {
		return enddate;
	}
	public void setEnddate(Integer enddate) {
		this.enddate = enddate;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
	
}
