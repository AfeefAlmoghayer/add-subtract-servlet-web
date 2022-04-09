package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class task1
 */
@WebServlet("/task1")
public class task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public task1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter printWriter=response.getWriter();
//		printWriter.println("my name is hala abdeljalil");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=null;
		try {
			out=response.getWriter();
			out.println("<center>");
			int a =Integer.parseInt(request.getParameter("t1"));
			int b=Integer.parseInt(request.getParameter("t2"));
			int c=0;
			String op=request.getParameter("btn");
			if(op.equals("+")) 
				c=a+b;
			
			if(op.equals("-"))
		     	c=a-b;
			
			out.println("<h1>"+a+op+b+"="+c+"</h1>");
			
			
		}
		catch(Exception e){
			out.println("Error:"+e.getMessage());
			
			
		}
		finally {
			out.println("<br>");
			out.println("return to main page <a href=index.html>click here</a>");
			out.println("</center>");
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=null;
		try {
			out=response.getWriter();
			out.println("<center>");
			int a =Integer.parseInt(request.getParameter("t1"));
			int b=Integer.parseInt(request.getParameter("t2"));
			int c=0;
			String op=request.getParameter("btn");
			if(op.equals("+")) 
				c=a+b;
			
			if(op.equals("-"))
		     	c=a-b;
			
			out.println("<h1>"+a+op+b+"="+c+"</h1>");
			
			
		}
		catch(Exception e){
			out.println("Error:"+e.getMessage());
			
			
		}
		finally {
			out.println("<br>");
			out.println("return to main page <a href=index.html>click here</a>");
			out.println("</center>");
			
			
		}
		//doGet(request, response);
	}

}
