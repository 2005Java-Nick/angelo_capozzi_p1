package com.revature.trms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectionFactory {

private static Logger logger = Logger.getRootLogger();
	
	private static String hostname;
	private static String username;
	private static String password;
	private static String dbName; 
	private static int port;
	
	public static Connection getRemoteConnection() {
		//System.out.println("Running");
	   
	      try {
	      System.out.println("Connecting...");
	      Class.forName("org.postgresql.Driver");
	      dbName = "postgres";
	      username = "postgres";
	      password ="Benjosan@613";
	      hostname = "localhost";
	      port = 5432;
	      String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + username + "&password=" + password;
	      logger.trace("Getting remote connection with connection string from environment variables.");
	      Connection con = DriverManager.getConnection(jdbcUrl);
	      logger.info("Remote connection successful.");
	      System.out.println("Connected!");
	     
	      return con;
	    } catch (ClassNotFoundException e) { 
	    	logger.warn(e.toString());
	    } catch (SQLException e) {
	    	logger.warn(e.toString());
	    }
	    
	    
	    return null;
	  }
}
