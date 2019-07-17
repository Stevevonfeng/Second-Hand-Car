package com.servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comparator.AscComparator;
import com.comparator.DescComparator;
import com.model.Car2;
import com.service.IListService;
import com.service.ListServiceImpl;

/**
 * Servlet implementation class SortServlet
 */
@WebServlet("/sortServlet")
public class SortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public SortServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sort = request.getParameter("sort");
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
			switch(sort){
				case "desc":
					Collections.sort(cars,new DescComparator());
					break;
				case "asc":
					Collections.sort(cars,new AscComparator());
					break;
			}
			
			
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("cp", cp);
			request.setAttribute("cars", cars);
			
			request.getRequestDispatcher("listing-classic.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
