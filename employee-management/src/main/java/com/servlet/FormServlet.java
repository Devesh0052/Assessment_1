package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collections.Emp;
import com.collections.EmpApp;



@WebServlet("/demo")
public class FormServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String pid = req.getParameter("id");
		int id = Integer.parseInt(pid);		
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		String psalary = req.getParameter("salary");
		Double salary = Double.parseDouble(psalary);	
		
		Emp p = new Emp(id,name,city,salary);
		
		EmpApp app =new EmpApp();
		
		String response = app.createEmp(p);
		
		out.write("<h1>"+response+"</h1>");
		
	}
	

}
