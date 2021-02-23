package org.btm.DemoApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor='red'> <h1>Welcome Mr."+fname+" "+lname+"</h1>"+"</body></html>");
		out.close();
	}
	
	

}
