package org.btm.ServletLifeApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(value = "/btm")
public class FirstServlet  extends GenericServlet{
	
	public FirstServlet() {
		System.out.println("Object created ");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("Initialized ");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		
		PrintWriter out=res.getWriter();
		out.println("<html><body><h1>Welcome Mr. "+fname+" "+lname+"</h1></body></html>");
		
		System.out.println("Service() executed");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Close All Costly Resources");
	}
	
	

}
