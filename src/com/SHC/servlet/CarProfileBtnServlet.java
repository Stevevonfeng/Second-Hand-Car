package com.SHC.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CarProfileBtnServlet extends BaseServlet{
	
	public void caroffer(HttpServletRequest request, HttpServletResponse response){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "admin");
			
			String sql = "";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt = conn.prepareStatement(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
