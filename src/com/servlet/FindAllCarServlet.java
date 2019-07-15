package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Car2;
import com.service.CarServiceImpl;
import com.service.ICarService;
import com.service.JsonUtils;

/**
 * Servlet implementation class FindAllCarServlet
 */
@WebServlet("/FindAllCarServlet")
public class FindAllCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		List<Car2> comparCars = new ArrayList<Car2>();
		
		ICarService ics = new CarServiceImpl();
		ArrayList<Car2> list = ics.findObject(Car2.class, null);
		System.out.println(list.size());
		for(Car2 car2:list) {
			String compare = car2.getCompare();
			if(compare==null) {
				continue;
			}
			if(car2.getCompare().equals("1")) {
				comparCars.add(car2);
			}	
		}
		String json = JsonUtils.objectToJson(comparCars);
		System.out.println(json);
		response.getWriter().print(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
