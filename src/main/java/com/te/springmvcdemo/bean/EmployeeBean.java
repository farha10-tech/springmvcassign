package com.te.springmvcdemo.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="empinfo")
public class EmployeeBean {
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private Date dob;
	@Column
	private String password;
	
}
