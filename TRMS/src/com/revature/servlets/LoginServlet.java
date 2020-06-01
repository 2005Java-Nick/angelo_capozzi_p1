package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		String greeting = "Hello " + name + ", welcome to your app!";
		
		PrintWriter out = res.getWriter();
		
		out.println(greeting);
		
//		if(name == "Angelo" && password == "Pepper") {
//			out.println(greeting);
//		} else {
//			out.println("user unknown");
//		}
		 
		
	}
}
