package org.btm.LifeCycleApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{
	
	public FirstServlet() {

	System.out.println("Default Constructor");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Object is initialized");
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		
		PrintWriter out=res.getWriter();
		out.println("<html><body><h1> Welcome Mr. "+fname+" "+lname+"</h1></body></html>");
		out.close();
		
		System.out.println("Service() executed");
	}
	
	
	@Override
	public void destroy() {

		System.out.println("Close all costly resources");
	}
	
	

}
