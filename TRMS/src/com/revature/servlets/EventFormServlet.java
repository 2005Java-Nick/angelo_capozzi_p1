package com.revature.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventFormServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String event = req.getParameter("event");
		String date = req.getParameter("date");
		String time = req.getParameter("time");
		String location = req.getParameter("location");
		String description = req.getParameter("description");
		String cost = req.getParameter("cost");
		
	}

}
