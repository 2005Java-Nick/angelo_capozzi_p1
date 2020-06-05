package com.revature.trms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.trms.dao.EmployeeDAOPostgres;
import com.revature.trms.domain.Employee;
import com.revature.trms.util.ConnectionFactory;


public class EventFormDAOPostgres extends EventFormDAO {


	private static final String GET_FNAME = "select employee_firstname from employee where employee_id=1";
	public EventFormDAOPostgres() {};
	
	EmployeeDAOPostgres edp = new EmployeeDAOPostgres();
	public void getEmployeeName(String fname) throws Exception {
		Class.forName("com.example.jdbc.Driver");
		Connection conn = ConnectionFactory.getRemoteConnection();
		PreparedStatement pstmt;
		Employee emp = null;
		try {
			emp = new Employee();
			pstmt = conn.prepareStatement(GET_FNAME);
			pstmt.setString(1, fname );
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				emp.setFirstName(rs.getString("employee_firstname"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	
		
		
		
	}
}
