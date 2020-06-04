package com.revature.trms.domain;

import org.apache.log4j.Logger;

public class Employee {

	private static Logger log = Logger.getRootLogger();	
	
	//user variables	
	
	public String empName;	
	protected int empId;
	public String empPW;
	public String position;
	public String empInfo;
	public String fname;
	public String lname;
	public Employee() {};	
	
	public Employee(String name, String pw, String pos) {
		this.empPW= pw;
		this.empName = name;
		this.position = pos;
	}	
	
	public String getUserInfo() {
		return empName + position;
	}	
	
	//============get/set user name=============
	public String getUserName() {
		return fname + " " + lname;
	}
	
	public void setFirstName(String fname) {
		this.fname = fname;
	}
	
	public void setLastName(String lname) {
		this.lname = lname;
	}
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	//============get/set user ID===================
	public int getUserId() {
		return empId;
	}
	public void setUserId(int id) {
		this.empId = id;
	}
	//============get/set user PW===================
	public String getUserPW() {
		return empPW;
	}
	public void setUserPW(String pw) {
		this.empPW = pw;
	}
	
}
