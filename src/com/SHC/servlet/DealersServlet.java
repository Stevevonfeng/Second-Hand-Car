package com.SHC.servlet;



import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SHC.model.CarBill;
import com.SHC.model.Dealers;
import com.SHC.model.GoodOrder;
import com.SHC.service.DealersServiceImpl;
import com.SHC.service.IDealersService;
import com.SHC.service.JsonUtils;
import com.model.Car2;

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
			
			String userid = request.getParameter("userid");
			
			IDealersService ids = new DealersServiceImpl();
			
			Dealers dealer = ids.dealersprofile(userid);
			
			request.setAttribute("dealer", dealer);
			request.getRequestDispatcher("dealers-profile.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//搜索car订单信息
	public void searchCarInfo(HttpServletRequest request, HttpServletResponse response){
		long vid = Long.parseLong(request.getParameter("vid"));
		
		IDealersService ids = new DealersServiceImpl();
		
		Car2 car = ids.searchCarInfo(vid);
		
		request.setAttribute("car", car);
		try {
			request.getRequestDispatcher("car-info.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	//生成订单
	public void createOrder(HttpServletRequest request, HttpServletResponse response){
		try {
			
			Date date = new Date();  
			long billnum = date.getTime();
			String vid = request.getParameter("vid");
			String brand = request.getParameter("brand");
			String model = request.getParameter("model");
			String version = request.getParameter("version");
			String year = request.getParameter("year");
			String fuel = request.getParameter("fuel");
			String carno = request.getParameter("carno");
			String price = request.getParameter("price");
			
			CarBill carbill = new CarBill();
			carbill.setBillnum(billnum);
			carbill.setVid(Long.parseLong(vid));
			carbill.setBrand(brand);
			carbill.setModel(model);
			carbill.setVersion(version);
			carbill.setYear(year);
			carbill.setFuel(fuel);
			carbill.setFuel(fuel);
			carbill.setCarNO(carno);
			carbill.setPrice(price);
			
			IDealersService ids = new DealersServiceImpl();
			
			ids.createOrder(carbill, Long.parseLong(vid));
			
			response.sendRedirect("dealers?act=carOffer&vid="+vid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//结算 已成为PayListServlet
	public void carOffer(HttpServletRequest request, HttpServletResponse response){
		try {
			
			
			long vid = Long.parseLong(request.getParameter("vid"));
			
			IDealersService ids = new DealersServiceImpl();
			
			CarBill carbill = ids.carOffer(vid);
			
			//String jsoncarbill = JsonUtils.objectToJson(carbill);
			
			//response.getWriter().print(jsoncarbill);
			//response.sendRedirect("dealers?act=carOffer");
			request.setAttribute("carbill", carbill);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//搜索订单
	public void searchOrderByOrdernum(HttpServletRequest request, HttpServletResponse response){
		try {
			String ordernum = request.getParameter("ordernum");
			
			IDealersService ids = new DealersServiceImpl();
			
			GoodOrder go = ids.searchOrderByOrdernum(ordernum);
			
			request.setAttribute("go", go);
			request.getRequestDispatcher("alipay.trade.page.pay.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//搜索每个商家的车辆数目
	public int carsNumById(HttpServletRequest request, HttpServletResponse response){
		String userid = null;
		IDealersService ids = new DealersServiceImpl();
		int num = ids.carsNumById(userid);
		return num;
	}

}
