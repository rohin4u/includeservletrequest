package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class IncludeRequestFirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>Hello This is FirstServlet</h1>");
		req.setAttribute("name", "delhi");
		RequestDispatcher rd=req.getRequestDispatcher("/test2");
		rd.include(req,resp);
		String name = (String)req.getAttribute("name");
		out.println("<h1>Hi This is First Servlet again");
		out.println("Some information about :"+name+"</h1>");
		
		
	}

}
