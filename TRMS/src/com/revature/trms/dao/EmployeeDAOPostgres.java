package com.revature.trms.dao;

import com.revature.trms.domain.Employee;
import com.revature.trms.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class EmployeeDAOPostgres implements EmployeeDAO {

	private static final String CREATE_NEW_EMP = "insert into employee (employee_username, epmloyee_password) values(?,?)";
	private static final String GET_EMP_INFO = "select * from employee e where e.employee_name = ? and e.employee_password = ?";
//	private static final String GET_HOBBY = "select * from userprofile where userprofile_hobbies = ? ";
//	private static final String SET_NEW_HOBBY = "insert into userprofile (userprofile_hobbies) values(?)";
	private static final String GET_FNAME = "select employee_firstname from employee where employee_id=1";
	
	private static Logger log = Logger.getRootLogger();
	
	
	
	public void createNewEmployee(Employee emp) {
		Connection conn = ConnectionFactory.getRemoteConnection();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(CREATE_NEW_EMP);
			pstmt.setString(1, emp.getUserName());
		
			
			pstmt.executeUpdate();
		} catch(SQLException e) {
			log.error("UserDAOPostgres:createNewUser: failed to create new user");
			
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	

	public Employee getEmployee(String empName, String position) {
		Connection conn = ConnectionFactory.getRemoteConnection();
		PreparedStatement pstmt;
		Employee emp = null;
		try {
			emp = new Employee();
			pstmt = conn.prepareStatement(GET_EMP_INFO);		
			pstmt.setString(1, empName);
			pstmt.setString(2, position);			
			
			ResultSet res = pstmt.executeQuery();
			
			if(res.next()) {
				emp.setFirstName(res.getString("employee_fname"));
				emp.setLastName(res.getString("employee_lanme"));
				//System.out.println("user name = " + user.getUserName() + user.getUserPW());
			} 
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
			finally {
		try {
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
			}
		}
		
		
		
		return emp;
	}	
	
//	public UserData getHobbyName(String hobbyName) {
//		Connection conn = JDBCConnection.getRemoteConnection();
//		PreparedStatement pstmt;
//		UserData hob = null;
//		try {
//			hob = new UserData();
//			pstmt = conn.prepareStatement(GET_HOBBY);		
//			pstmt.setString(1, hobbyName);
//					
//			
//			ResultSet res = pstmt.executeQuery();
//			
//			if(res.next()) {
//				hob.setHobbyName(res.getString("userprofile_hobbies"));
//				
//				System.out.println("user hobby = " + hob.getHobbyName());
//			} 
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		} 
//			finally {
//		try {
//			conn.close();
//		} catch(SQLException e) {
//			e.printStackTrace();
//			return null;
//			}
//		}
//		
//		
//		
//		return hob;
//	}
//
//	public UserData setHobbyName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void setNewHobby(UserData nh) {
//		Connection conn = JDBCConnection.getRemoteConnection();
//		PreparedStatement pstmt;
//		try {
//			pstmt = conn.prepareStatement(SET_NEW_HOBBY);
//			pstmt.setString(1, nh.getHobbyName());
//			
//			//pstmt.setString(3, nu.getHobbyName());
//			
//			pstmt.executeUpdate();
//		} catch(SQLException e) {
//			log.error("UserDAOPostgres:createNewUser: failed to create new user");
//			
//			e.printStackTrace();
//		} finally{
//			try {
//				conn.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
//
//	@Override
//	public void saveEmployee(Employee emp) {
//		// TODO Auto-generated method stub
//		
//	}
}
