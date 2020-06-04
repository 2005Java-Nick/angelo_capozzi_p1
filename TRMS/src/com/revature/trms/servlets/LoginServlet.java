package com.revature.trms.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.trms.dao.EmployeeDAOPostgres;
import com.revature.trms.util.ConnectionFactory;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		HttpSession sess = req.getSession(true);
		Connection conn = ConnectionFactory.getRemoteConnection();
		
		EmployeeDAOPostgres emp = new EmployeeDAOPostgres();
		
		sess.setAttribute("username", emp);
		res.setHeader("Access-Control-Allow_Origin","http://localhost:4200");
		res.setHeader("Access-Control-Allow-Credentials", "true");
		res.getWriter().write(new ObjectMapper().writeValueAsString(emp));
		
		
	}
}
