package com.acg.web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acg.inventory.exceptions.BusinessException;
import com.acg.inventory.manager.UnitOfMeasurementManager;

@WebServlet(urlPatterns = "/getUOM")
public class GetUnitOfMeasurementServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UnitOfMeasurementManager unitOfMeasurementManager = new UnitOfMeasurementManager();
		try {
			request.setAttribute("unitOfMeasurements", unitOfMeasurementManager.get());
		} catch (BusinessException exception) {
			request.setAttribute("errorMessage", exception.getMessage());
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
