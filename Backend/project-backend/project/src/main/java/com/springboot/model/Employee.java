package com.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_SEQ")
    @SequenceGenerator(sequenceName = "emp_seq", initialValue = 1, allocationSize = 1, name = "EMP_SEQ")
	@Column(nullable = false)
	private Long id;
	private String name, email, jobTitle, phone,img;
	@Column(nullable = false)
	private String empcode;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name, String email, String jobTitle, String phone, String img, String empcode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.img = img;
		this.empcode = empcode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getEmpcode() {
		return empcode;
	}

	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", phone="
				+ phone + ", img=" + img + ", empcode=" + empcode + "]";
	}
	
	

}
