package com.SHC.servlet;



import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SHC.model.CarBill;
import com.SHC.model.Dealers;
import com.SHC.service.DealersServiceImpl;
import com.SHC.service.IDealersService;

/**
 * Servlet implementation class DealersServlet
 */
@WebServlet("/dealers")
public class DealersServlet extends BaseServlet {
	//展示经销商
	public void displaydealers(HttpServletRequest request, HttpServletResponse response){
			try {
				int pz = 3;//每页显示数
				int cp = 1;//当前页面
				String currentPage = request.getParameter("cp");
				if(currentPage!=null){
					cp=Integer.parseInt(currentPage);
				}
				
				IDealersService ids = new DealersServiceImpl();
				
				List<Dealers> dealers = ids.displayDealers(cp);
				
				//计算总记录数
				int count = ids.dealersNum();
				
				//计算总页数
				int totalPage = count%pz==0?count/pz:count/pz+1;
				
				request.setAttribute("totalPage", totalPage);
				request.setAttribute("cp", cp);
				request.setAttribute("dealers", dealers);
				request.getRequestDispatcher("dealers-list.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
	//展示具体页面
	public void dealersprofile(HttpServletRequest request, HttpServletResponse response){
		try {
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			IDealersService ids = new DealersServiceImpl();
			
			Dealers dealer = ids.dealersprofile(id);
			
			request.setAttribute("dealer", dealer);
			request.getRequestDispatcher("dealers-profile.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//结算
	public void carOffer(HttpServletRequest request, HttpServletResponse response){
		try {
			
			
			long vid = Long.parseLong(request.getParameter("vid"));
			
			IDealersService ids = new DealersServiceImpl();
			
			CarBill carbill = ids.carOffer(vid);
			
			request.setAttribute("carbill", carbill);
			request.getRequestDispatcher("car-bill.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
