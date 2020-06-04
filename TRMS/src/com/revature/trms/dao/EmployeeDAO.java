package com.revature.trms.dao;

import com.revature.trms.domain.Employee;

public interface EmployeeDAO {

    public void createNewEmployee(Employee emp);
	
	public Employee getEmployee(String employeeName, String position);
}
