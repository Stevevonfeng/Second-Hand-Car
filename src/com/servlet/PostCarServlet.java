package com.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.dao.CarDaoImpl;
import com.dao.ICarDao;
import com.model.Car2;
import com.service.CarServiceImpl;
import com.service.ICarService;
import com.service.Utils;



/**
 * Servlet implementation class PostCarServlet
 */
@WebServlet("/PostCarServlet")
@MultipartConfig
public class PostCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*		HttpSession session = request.getSession();
		String userid = (String)session.getAttribute("userid");*/
		Car2 car = null;
		String userid = "0001";
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
		car.setActive("active");
		ics.addCar(car);
		
		response.sendRedirect("post-vehicle.jsp");
	}

}
