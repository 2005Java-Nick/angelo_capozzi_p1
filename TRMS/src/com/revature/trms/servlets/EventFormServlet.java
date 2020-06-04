package com.revature.trms.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.trms.domain.Employee;
import com.revature.trms.domain.EventForm;

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
		
		
		HttpSession sess = req.getSession(false);
		if(sess == null) {
			res.setStatus(401);
			return;
		}
		
		Employee emp = (Employee) sess.getAttribute("user");
		EventForm eventForm = new EventForm();
	}

}
