package com.SHC.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SHC.model.Dealers;

/**
 * Servlet implementation class DealersServlet
 */
@WebServlet("/dealers")
public class DealersServlet extends BaseServlet {
	
	public void displaydealers(HttpServletRequest request, HttpServletResponse response){
		int pz = 3;//每页显示数
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "admin");
			
			int cp = 1;//当前页面
			String currentPage = request.getParameter("cp");
			if(currentPage!=null){
				cp=Integer.parseInt(currentPage);
			}
			
			String sql = "select * from (select t1.*,rownum num from "
					+ "(select * from dealers order by id desc) t1 where rownum<="+pz*cp+") t2 "
					+ "where t2.num>"+(cp-1)*pz+"";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			List<Dealers> dealers = new ArrayList<Dealers>();
			
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String adress = rs.getString(3);
				String city = rs.getString(4);
				String telephone = rs.getString(5);
				int carsnum = rs.getInt(6);
				
				Dealers dealer = new Dealers();
				dealer.setId(id);
				dealer.setName(name);
				dealer.setAdress(adress);
				dealer.setCity(city);
				dealer.setTelephone(telephone);
				dealer.setCarsnum(carsnum);
				dealers.add(dealer);
			}
			
			//计算总记录数
			sql="select count(*) from emp";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int count=0;
			if(rs.next()){
				count = rs.getInt(1);
			}
			
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

}
