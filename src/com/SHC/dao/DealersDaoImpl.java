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
import com.SHC.model.GoodOrder;
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
					+ "(select userid, username, email, validatecode, userpassword, phone, birth, adress, country, province, image, status from tb_user order by userid desc) t1 where rownum<="+pz*cp+") t2 "
					+ "where t2.num>"+(cp-1)*pz+"";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			dealers = new ArrayList<Dealers>();
			
			while(rs.next()){
				String userid = rs.getString("userid");
				String username = rs.getString("username");
				String email = rs.getString("email");

				String userpassword = rs.getString("userpassword");
				String phone = rs.getString("phone");
				String birth = rs.getString("birth");
				String adress = rs.getString("adress");
				String country = rs.getString("country");
				String province = rs.getString("province");
				String img = rs.getString("image");
				

				Dealers dealer = new Dealers();
				dealer.setUserid(userid);
				dealer.setUsername(username);
				dealer.setEmail(email);
				dealer.setUserpassword(userpassword);
				dealer.setPhone(phone);
				dealer.setBirth(birth);
				dealer.setAdress(adress);
				dealer.setCountry(country);
				dealer.setProvince(province);
				dealer.setImg(img);
				
				
				
				
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
			String sql="select count(*) from tb_user";
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
	public Dealers dealersprofile(String userid) {
		Dealers dealer = new Dealers();
		try {
			String sql = "select * from tb_user where userid =" +userid+"";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()){
				userid = rs.getString("userid");
				String username = rs.getString("username");
				String email = rs.getString("email");
				String validatecode=rs.getString("validatecode");
				String userpassword = rs.getString("userpassword");
				String phone = rs.getString("phone");
				String birth = rs.getString("birth");
				String adress = rs.getString("adress");
				String country = rs.getString("country");
				String province = rs.getString("province");
				String img = rs.getString("image");
				String status = rs.getString("status");

				dealer.setUserid(userid);
				dealer.setUsername(username);
				dealer.setEmail(email);
				dealer.setValidatecode(validatecode);
				dealer.setUserpassword(userpassword);
				dealer.setPhone(phone);
				dealer.setBirth(birth);
				dealer.setAdress(adress);
				dealer.setCountry(country);
				dealer.setProvince(province);
				dealer.setImg(img);
				dealer.setStatus(status);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dealer;
	}


	@Override//已成为PayListServlet
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


	@Override
	public GoodOrder searchOrderByOrdernum(String ordernum) {
		GoodOrder go = new GoodOrder();
		
		try {
			String sql="select ordernum, vid, price, des from goodorder where ordernum = '"+ordernum+"'";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()){
				ordernum = rs.getString(1);
				long vid = rs.getLong(2);
				int price = rs.getInt(3);
				String des = rs.getString(4);
				
				go.setOrdernum(ordernum);
				go.setVid(vid);
				go.setPrice(price);
				go.setDes(des);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return go;
	}


	@Override
	public int carsNumById(String userid) {
		int num = 0;
		String sql="select c.userid,count(*) from car2 c,tb_user u where c.userid = u.userid group by c.userid and userid = "+userid;
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()){
				userid = rs.getString(1);
				num = rs.getInt(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return num;
	}



}
