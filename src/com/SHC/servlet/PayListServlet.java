package com.SHC.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SHC.model.CarBill;
import com.model.Car2;

/**
 * Servlet implementation class PayListServlet
 */
@WebServlet("/paylist")
public class PayListServlet extends HttpServlet {
	static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String user = "scott";
	static String password = "admin";
	static Connection conn = null;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PayListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		Car2 carbill = new Car2();
		long vid = Long.parseLong(request.getParameter("vid"));

		try {
			String sql = "select vid,brand,model,version,year,fuel,newcar,usedcar,price from car2 where vid="+ vid + "";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				vid = rs.getLong(1);
				String brand = rs.getString(2);
				String model = rs.getString(3);
				String version = rs.getString(4);
				Date year = rs.getDate(5);
				String fuel = rs.getString(6);
				String newcar = rs.getString(7);
				String usedcar = rs.getString(8);
				String price = rs.getString(9);

				carbill.getVid();
				carbill.setBrand(brand);
				carbill.setModel(model);
				carbill.setVersion(version);
				carbill.setYear(year);
				carbill.setFuel(fuel);
				carbill.setNewcar(newcar);
				carbill.setUsedcar(usedcar);
				carbill.setPrice(price);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("carbill", carbill);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
