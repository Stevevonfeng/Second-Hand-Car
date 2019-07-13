package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SHC.model.Dealers;
import com.SHC.service.DealersServiceImpl;
import com.SHC.service.IDealersService;
import com.SHC.servlet.BaseServlet;
import com.model.Car2;
import com.service.IListService;
import com.service.ListServiceImpl;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/list")
public class ListServlet extends BaseServlet {

	public void ListShow(HttpServletRequest request, HttpServletResponse response) {
		try {
			int pz = 3;// 每页显示数
			int cp = 1;// 当前页面
			String currentPage = request.getParameter("cp");
			if (currentPage != null) {
				cp = Integer.parseInt(currentPage);
			}

			IListService ics = new ListServiceImpl();

			List<Car2> cars = ics.ListShow(cp);

			// 计算总记录数
			int count = ics.carsNum();

			int totalPage = count % pz == 0 ? count / pz : count / pz + 1;

			request.setAttribute("totalPage", totalPage);
			request.setAttribute("cp", cp);
			request.setAttribute("cars", cars);
			request.getRequestDispatcher("listing-classic.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void CarShow(HttpServletRequest request, HttpServletResponse response) throws Exception {
		long vid = Long.parseLong(request.getParameter("vid"));
		
		IListService ils = new ListServiceImpl();
		
		Car2 car = ils.CarShow(vid);
		
		request.setAttribute("car", car);
		request.getRequestDispatcher("listing-detail-2.jsp").forward(request, response);
	}

}
