package com.revature.trms.domain;

import org.apache.log4j.Logger;

public class Employee {

	private static Logger log = Logger.getRootLogger();	
	
	//employee variables		
	protected int empID;
	public String empPW;
	public String position;	
	public String fname;
	public String lname;
	public String userName;
	public Employee() {
		super();
	}	
	
	public Employee(String userName, String empPW) {
		this.userName = userName;	
		this.empPW = empPW;			
	}	
	
	public Employee(Integer empID, String fname, String lname, String empPW, String position) {
		this.empID = empID;
		this.fname = fname;
		this.lname = lname;		
		this.empPW = empPW;		
		this.position = position;
	}	
	
	public Integer getEmpId() {
		return empID;		
	}
	
	public void setEmpId(Integer empID) {
		this.empID = empID;
	}	
	public String getFirstName() {
		return fname;
	}
	public void setFirstName(String fname) {
		this.fname = fname;
	}
	public String getLastName() {
		return lname;
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

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
