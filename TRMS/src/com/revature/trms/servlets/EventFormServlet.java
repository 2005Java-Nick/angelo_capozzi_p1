package com.revature.trms.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.trms.dao.EventFormDAO;
import com.revature.trms.domain.EventForm;

@WebServlet("/list")
public class EventFormServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		eventList(req, res);
	}

	private void eventList(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		
		EventFormDAO dao = new EventFormDAO();
		
		try {
			
			List<EventForm> eventList = dao.list();
			req.setAttribute("eventList", eventList);
			
			RequestDispatcher dis = req.getRequestDispatcher("eventform.jsp");
			dis.forward(req, res);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {	
//		System.out.println("Event ID number?" + req.getParameter("event"));
		int eventID = 1; //Integer.parseInt(req.getParameter("event_type"));
			
		req.setAttribute("selectedEventId", eventID);
		eventList(req, res);
	}
}
