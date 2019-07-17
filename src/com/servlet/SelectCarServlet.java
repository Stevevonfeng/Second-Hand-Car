package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Car;
import com.service.CarServiceImpl;
import com.service.ICarService;
import com.service.JsonUtils;

/**
 * Servlet implementation class SelectCarServlet
 */
@WebServlet("/SelectCarServlet")
public class SelectCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String restype = request.getParameter("restype");
		ICarService ics = new CarServiceImpl();
		List<Car> list = ics.findAllCar();
		List<String> tar = new ArrayList<>();
		
		if(restype.equals("brand")) {
			for(Car car:list) {
				if(!tar.contains(car.getBrand()))
					tar.add(car.getBrand());
			}
		}else if(restype.equals("model")) {
			String brand = request.getParameter("brand");
			for(Car car:list) {
				if(car.getBrand().equals(brand)) {
					if(!tar.contains(car.getModel()))
						tar.add(car.getModel());
				}
			}
		}else if(restype.equals("version")) {
			String model = request.getParameter("model");
			for(Car car:list) {
				if(car.getModel().equals(model)) {
					if(!tar.contains(car.getVersion()))
						tar.add(car.getVersion());
				}
			}
		}
		
		String json = JsonUtils.objectToJson(tar);
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
