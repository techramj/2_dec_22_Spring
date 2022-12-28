package com.easylearning;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/login.do", "/" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String loginPage = "/WEB-INF/views/login.jsp";
	private String homePage = "/WEB-INF/views/home.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginServlet -> get method");
		RequestDispatcher rd = request.getRequestDispatcher(loginPage);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(username+" => "+password);
		//validation fail=> login.jsp   pass=> home.jsp
		String page;
		
		
		
		if("123".equals(password)) {
			List<String> list = Arrays.asList("Jessica", "John","Sam", "King","Abel");
			request.setAttribute("name", username);
			request.setAttribute("password", password);
			request.setAttribute("friends", list);
			page = homePage;
		}else {
			request.setAttribute("errorMessage", "Invalid username and password");
			page = loginPage;
		}
		

		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
		
		
		
	}

}
