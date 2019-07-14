package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Car2;
import com.service.CarServiceImpl;
import com.service.ICarService;

/**
 * Servlet implementation class ComparedServlet
 */
@WebServlet("/ComparedServlet")
public class ComparedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComparedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String userid = request.getParameter("userid");
		long vid = Long.parseLong(request.getParameter("vid"));
		String compare = request.getParameter("compare");
		ICarService ics = new CarServiceImpl();
		ArrayList<Car2> list =  ics.findObject(Car2.class, vid);
		Car2 car2 = list.get(0);
		car2.setCompare(compare);
		ics.upCar(car2, vid);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
