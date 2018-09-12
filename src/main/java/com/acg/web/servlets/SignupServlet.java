package com.acg.web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;

@WebServlet(urlPatterns = "/signup")
public class SignupServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String username = request.getHeader("username");
		String password = request.getHeader("password");
		if (StringUtils.isEmpty(username)) {

		}
		if (StringUtils.isEmpty(password)) {

		}

	}

}