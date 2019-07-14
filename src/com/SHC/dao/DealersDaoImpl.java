package com.SHC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.SHC.model.CarBill;
import com.SHC.model.Dealers;
import com.model.Car2;

public class DealersDaoImpl implements IDealersDao{
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
	

	@Override
	public List<Dealers> displayDealers(int currentPage) {
		int pz = 3;//每页显示数
		int cp = currentPage;//当前页面
		List<Dealers> dealers = null;
		try {
			String sql = "select * from (select t1.*,rownum num from "
					+ "(select * from dealers order by id desc) t1 where rownum<="+pz*cp+") t2 "
					+ "where t2.num>"+(cp-1)*pz+"";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			dealers = new ArrayList<Dealers>();
			
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String city = rs.getString(4);
				String telephone = rs.getString(5);
				int carsnum = rs.getInt(6);
				String url = "id="+id+"&name="+name+"&address="+address+"&city="+city+"&telephone="+telephone+"&carsnum="+carsnum;
				
				Dealers dealer = new Dealers();
				dealer.setId(id);
				dealer.setName(name);
				dealer.setAddress(address);
				dealer.setCity(city);
				dealer.setTelephone(telephone);
				dealer.setCarsnum(carsnum);
				dealer.setUrl(url);
				
				dealers.add(dealer);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return dealers;
	}


	@Override
	public int dealersNum() {
		int count=0;
		try {
			String sql="select count(*) from dealers";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();

			if(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}


	@Override
	public Dealers dealersprofile(int id) {
		Dealers dealer = new Dealers();
		try {
			String sql = "select * from dealers where id =" +id+"";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()){
				id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String city = rs.getString(4);
				String telephone = rs.getString(5);
				int carsnum = rs.getInt(6);
				
				
				dealer.setId(id);
				dealer.setName(name);
				dealer.setAddress(address);
				dealer.setCity(city);
				dealer.setTelephone(telephone);
				dealer.setCarsnum(carsnum);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dealer;
	}


	@Override
	public CarBill carOffer(long vid) {
		CarBill carbill = new CarBill();
		try {
			String sql = "select vehiclestitle,brand,model,version,year,fuel,newcar,usedcar,price from carorder where vid="+vid+"";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()){
				long billnum = rs.getLong(1);
				vid  = rs.getLong(2);
				String brand = rs.getString(3);
				String model = rs.getString(4);
				String version = rs.getString(5);
				String year = rs.getString(6);
				String fuel = rs.getString(7);
				String newcar = rs.getString(8);
				String usedcar = rs.getString(9);
				String price = rs.getString(10);
				
				carbill.setBillnum(billnum);
				carbill.getVid();
				carbill.setBrand(brand);
				carbill.setModel(model);
				carbill.setVersion(version);
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String sdate = sdf.format(date);
				carbill.setYear(sdate);
				carbill.setFuel(fuel);
				carbill.setCarNO(newcar+usedcar);
				carbill.setPrice(price);	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return carbill;
	}


	@Override
	public Car2 searchCarType(String carType,int currentPage) {
		int pz = 3;//每页显示数
		int cp = currentPage;//当前页面
		List<Dealers> dealers = null;

			try {
				String sql = "select * from (select t1.*,rownum num from "
						+ "(select * from dealers order by id desc) t1 where rownum<="+pz*cp+") t2 "
						+ "where t2.num>"+(cp-1)*pz+"";
				
				PreparedStatement psmt = conn.prepareStatement(sql);
				
				ResultSet rs = psmt.executeQuery();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}


	@Override
	public void createOrder(CarBill cb,long vid) {
		try {
			String sql="insert into carorder(billnum, vid, brand, model, version, year, fuel, carno, price) "
					+ "values(?, ?, ?, ?, ?, ?, ?, ?,?) where vid="+vid+"";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setObject(1, cb.getBillnum());
			psmt.setObject(2, cb.getVid());
			psmt.setObject(3, cb.getBrand());
			psmt.setObject(4, cb.getModel());
			psmt.setObject(5, cb.getVersion());
			psmt.setObject(6, cb.getYear());
			psmt.setObject(7, cb.getFuel());
			psmt.setObject(8, cb.getCarNO());
			psmt.setObject(9, cb.getPrice());
			psmt.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public Car2 searchCarInfo(long vid) {
		Car2 car = new Car2();
		
		try {
			String sql="select vid, brand, model, version, year, fuel, newcar, usedcar, price from car2 where vid = "+vid;
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()){
				vid = rs.getLong(1);
				String brand = rs.getString(2);
				String model = rs.getString(3);
				String version = rs.getString(4);
				Date year = rs.getDate(5);
				String fuel = rs.getString(6);
				String newcar = rs.getString(7);
				String usedcar = rs.getString(8);
				String price = rs.getString(9);
				
				car.getVid();
				car.setBrand(brand);
				car.setModel(model);
				car.setVersion(version);
				car.setYear(year);
				car.setFuel(fuel);
				car.setNewcar(newcar);
				car.setUsedcar(usedcar);
				car.setPrice(price);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}



}
