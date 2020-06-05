package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.trms.domain.EventForm;

public class EventFormDAO {

	 
	 String dbName = "postgres";
	 String username = "postgres";
	 String password ="Benjosan@613";
	 String hostname = "localhost";
//     int port = 5432;
     String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + 5432 + "/" + dbName + "?user=" + username + "&password=" + password;
     
     public List<EventForm> list() throws SQLException {
    	 List<EventForm> eventList = new ArrayList<> ();
    	 
    	 try (Connection con = DriverManager.getConnection(jdbcUrl)){
    		 System.out.println("Connected!");
    		 String psql = "select * from events order by event_reimval";
    		 Statement stmt = con.createStatement();
    		 ResultSet rs = stmt.executeQuery(psql);
    		 
    		 while (rs.next()) {
    			 int id = rs.getInt("event_id");
    			 String name = rs.getString("event_type");
    			 String reim = rs.getString("event_reimval");
    			 EventForm event = new EventForm(id, name, reim);
    			 
    			 eventList.add(event);
    		 }
    		 
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    		 throw e;
    	 }
    	 
    	 return eventList;
     }
     
     
}
