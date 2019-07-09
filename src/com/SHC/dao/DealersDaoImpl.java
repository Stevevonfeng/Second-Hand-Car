package com.SHC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.SHC.model.Dealers;

public class DealersDaoImpl implements IDealersDao{
	
	@Override
	public void addDealers(Dealers dealers) {
//		有错误
		try {
			Class.forName("oracle.jdbc.OracleDriver.class");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "admin");
			String sql = "insert into dealers(id,name,address,city,telephone,carsnum)" + "values(?,?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setObject(1, dealers.getId());
			psmt.setObject(2, dealers.getName());
			psmt.setObject(3, dealers.getAddress());
			psmt.setObject(4, dealers.getCity());
			psmt.setObject(5, dealers.getTelephone());
			psmt.setObject(6, dealers.getCarsnum());
			
			psmt.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void displayDealers(Dealers dealers) {
		
		
	}

}
