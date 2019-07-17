package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.model.Car2;
import com.model.Users;
import com.service.CarServiceImpl;
import com.service.ICarService;
import com.service.Utils;

/**
 * Servlet implementation class UpdateCar
 */
@WebServlet("/UpdateCar")
public class UpdateCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Car2 car = null;
		HttpSession session = request.getSession();
		Users user = (Users)session.getAttribute("user");
		String userid = user.getUserid();
		ICarService ics = new CarServiceImpl();
		DiskFileItemFactory fa = new DiskFileItemFactory();
		ServletFileUpload up = new ServletFileUpload(fa);
		up.setHeaderEncoding("UTF-8");
		List<FileItem> list = null;
		try {
			list = up.parseRequest(request);
		}catch(Exception e) {
			e.printStackTrace();
		}
		car = (Car2)Utils.reqToObject(car, Car2.class, list);
		car.setUserid(userid);
		
		ics.upCar(car, car.getVid());
		response.sendRedirect("my-vehicles.jsp");
	}

}
