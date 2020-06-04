package com.revature.trms.app;
import java.sql.*;
public class Main {

	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Benjosan@613");
			
			if(con!=null) {
				System.out.println("Connected!");
			} else {
				System.out.println("Failed...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
