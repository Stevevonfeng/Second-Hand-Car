package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Car2;
import com.service.CarServiceImpl;
import com.service.ICarService;
import com.service.IListService;
import com.service.ListServiceImpl;
import com.service.Utils;

/**
 * Servlet implementation class SearchByIndexServlet
 */
@WebServlet("/SearchByIndexServlet")
public class SearchByIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchByIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String brand = request.getParameter("brand");
		String model = request.getParameter("model");
		String version = request.getParameter("version");
		String year = request.getParameter("year");
		String statu = request.getParameter("statu");
		String price = request.getParameter("price");
		
		System.out.println("statu:"+statu);
		
		String sql = Utils.getSql(brand, model, version, year, statu, price);
		
		ICarService ics = new CarServiceImpl();
		IListService ils = new ListServiceImpl();
		int pz = 3;// 姣忛〉鏄剧ず鏁�
		int cp = 1;// 褰撳墠椤甸潰
		String currentPage = request.getParameter("cp");
		if (currentPage != null) {
			cp = Integer.parseInt(currentPage);
		}
		List<Car2> cars = ics.findCar2(brand, model, version, year, statu,cp,price);
		int count = ils.carsNum(sql);
		int totalPage = count % pz == 0 ? count / pz : count / pz + 1;
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("cp", cp);
		request.setAttribute("cars", cars);
		
		request.setAttribute("brand", brand);
		request.setAttribute("model", model);
		request.setAttribute("version", version);
		request.setAttribute("year", year);
		request.setAttribute("statu", statu);
		request.setAttribute("price", price);
		
		request.getRequestDispatcher("listing-classic.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
