package com.servlet;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SHC.servlet.BaseServlet;
import com.model.Car2;
import com.model.Users;
import com.service.IListService;
import com.service.ListServiceImpl;
import com.service.Utils;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/list")
public class ListServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	public void ListShow(HttpServletRequest request, HttpServletResponse response) {
		try {
			int pz = 3;// 姣忛〉鏄剧ず鏁�
			int cp = 1;// 褰撳墠椤甸潰
			String currentPage = request.getParameter("cp");
			if (currentPage != null) {
				cp = Integer.parseInt(currentPage);
			}

			IListService ics = new ListServiceImpl();
			List<Car2> cars = ics.ListShow(cp);

			// 璁＄畻鎬昏褰曟暟
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
		String brand = request.getParameter("brand");
		String userid = request.getParameter("userid");
		
		IListService ils = new ListServiceImpl();
		
		Car2 car = ils.CarShow(vid);
		List<Car2> cars = ils.SimilarCar(brand,vid);
		Users user = ils.UserShow(userid);
		List<String>  fileNames = Utils.findCarImgs("C:/dbimgs/"+vid);
		
		request.setAttribute("car", car);
		request.setAttribute("cars", cars);
		request.setAttribute("user", user);
		request.setAttribute("fileNames", fileNames);
		
		request.getRequestDispatcher("listing-detail-2.jsp").forward(request, response);
	}
	
	public void NewListShow(HttpServletRequest request, HttpServletResponse response){
		try {
			int pz = 3;
			int cp = 1;
			String currentPage = request.getParameter("cp");
			if (currentPage != null) {
				cp = Integer.parseInt(currentPage);
			}
			IListService ils = new ListServiceImpl();
			List<Car2> cars = ils.NewListShow(cp);
			
			int count = ils.carsNum();
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
	
	
	
}
