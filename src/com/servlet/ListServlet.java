package com.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SHC.servlet.BaseServlet;
import com.model.Car2;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/list")
public class ListServlet extends BaseServlet{

    public void ListShow(HttpServletRequest request, HttpServletResponse response) {
    	int pz = 3;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "admin");
			
			int cp = 1;
			String currentPage = request.getParameter("cp");
			if(currentPage!=null){
				cp=Integer.parseInt(currentPage);
			}
			
			String sql = "select * from (select t1.*,rownum num from "
					+ "(select * from car2 order by price desc) t1 where rownum<="+pz*cp+") t2 "
					+ "where t2.num>"+(cp-1)*pz+"";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			List<Car2> cars = new ArrayList<Car2>();
			while(rs.next()){
				long vid = rs.getLong(1);
				String vehiclestitle = rs.getString(2);
				String brand = rs.getString(3);
				String model = rs.getString(4);
				String version = rs.getString(5);
				String vod = rs.getString(6);                
				String price = rs.getString(7);            
				String upload = rs.getString(8);
				String userid = rs.getString(9);
				
				Date year = rs.getDate(10);
				String owners = rs.getString(11);
				String kms = rs.getString(12);
				String fuel = rs.getString(13);
				String engien = rs.getString(14);
				String engiendescription = rs.getString(15);
				int cylinders = rs.getInt(16); 
				int mileage = rs.getInt(17);  
				int mileage_h = rs.getInt(18);    
				int capacity = rs.getInt(19);    
				int s_capacity = rs.getInt(20);  
				String transmission = rs.getString(21);
				
				String air_conditioner = rs.getString(22);
				String door = rs.getString(23);
				String antilock = rs.getString(24);
				String brake = rs.getString(25);
				String steering = rs.getString(26);
				String airbag = rs.getString(27);
				String windows = rs.getString(28);
				String passenger_airbag = rs.getString(29);
				String player = rs.getString(30);
				String sensor = rs.getString(31);
				String seats = rs.getString(32);
				String engine_warning = rs.getString(33);
				String locking = rs.getString(34);
				String headlamps = rs.getString(35);
				String newcar = rs.getString(36);
				String usedcar = rs.getString(37);
				
				Car2 car = new Car2();
				car.setVid(vid);
				car.setVehiclestitle(vehiclestitle);
				car.setBrand(brand);
				car.setModel(model);
				car.setVersion(version);
				car.setVod(vod);
				car.setPrice(price);
				car.setUpload(upload);
				car.setUserid(userid);
				
				car.setYear(year);
				car.setOwners(owners);
				car.setKms(kms);
				car.setFuel(fuel);
				car.setEngien(engien);
				car.setEngiendescription(engiendescription);
				car.setCylinders(cylinders);
				car.setMileage(mileage);
				car.setMileage_h(mileage_h);
				car.setCapacity(capacity);
				car.setS_capacity(s_capacity);
				car.setTransmission(transmission);
				
				car.setAir_conditioner(air_conditioner);
				car.setDoor(door);
				car.setAntilock(antilock);
				car.setBrake(brake);
				car.setSteering(steering);
				car.setWindows(windows);
				car.setPassenger_airbag(passenger_airbag);
				car.setPlayer(player);
				car.setSensor(sensor);
				car.setSeats(seats);
				car.setEngine_warning(engine_warning);
				car.setLocking(locking);
				car.setHeadlamps(headlamps);
				car.setNewcar(newcar);
				car.setUsedcar(usedcar);
				
				cars.add(car);
				
			}
		
			sql="select count(*) from car2";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int count=0;
			if(rs.next()){
				count = rs.getInt(1);
			}
			
	
			int totalPage = count%pz==0?count/pz:count/pz+1;
			
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("cp", cp);
			request.setAttribute("cars", cars);
			request.getRequestDispatcher("listing-classic.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public void CarShow(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	long Vid = Long.parseLong(request.getParameter("vid")); 
    	Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "admin");
		String sql = "select * from car2 where vid="+Vid+"";
		PreparedStatement psmt = conn.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();
		Car2 car = new Car2();
		if(rs.next()){
			long vid = rs.getLong(1);
			String vehiclestitle = rs.getString(2);
			String brand = rs.getString(3);
			String model = rs.getString(4);
			String version = rs.getString(5);
			String vod = rs.getString(6);                
			String price = rs.getString(7);            
			String upload = rs.getString(8);
			String userid = rs.getString(9);
			
			Date year = rs.getDate(10);
			String owners = rs.getString(11);
			String kms = rs.getString(12);
			String fuel = rs.getString(13);
			String engien = rs.getString(14);
			String engiendescription = rs.getString(15);
			int cylinders = rs.getInt(16); 
			int mileage = rs.getInt(17);  
			int mileage_h = rs.getInt(18);    
			int capacity = rs.getInt(19);    
			int s_capacity = rs.getInt(20);  
			String transmission = rs.getString(21);
			
			String air_conditioner = rs.getString(22);
			String door = rs.getString(23);
			String antilock = rs.getString(24);
			String brake = rs.getString(25);
			String steering = rs.getString(26);
			String airbag = rs.getString(27);
			String windows = rs.getString(28);
			String passenger_airbag = rs.getString(29);
			String player = rs.getString(30);
			String sensor = rs.getString(31);
			String seats = rs.getString(32);
			String engine_warning = rs.getString(33);
			String locking = rs.getString(34);
			String headlamps = rs.getString(35);
			String newcar = rs.getString(36);
			String usedcar = rs.getString(37);
			
			
			car.setVid(vid);
			car.setVehiclestitle(vehiclestitle);
			car.setBrand(brand);
			car.setModel(model);
			car.setVersion(version);
			car.setVod(vod);
			car.setPrice(price);
			car.setUpload(upload);
			car.setUserid(userid);
			
			car.setYear(year);
			car.setOwners(owners);
			car.setKms(kms);
			car.setFuel(fuel);
			car.setEngien(engien);
			car.setEngiendescription(engiendescription);
			car.setCylinders(cylinders);
			car.setMileage(mileage);
			car.setMileage_h(mileage_h);
			car.setCapacity(capacity);
			car.setS_capacity(s_capacity);
			car.setTransmission(transmission);
			
			car.setAir_conditioner(air_conditioner);
			car.setDoor(door);
			car.setAntilock(antilock);
			car.setBrake(brake);
			car.setSteering(steering);
			car.setWindows(windows);
			car.setPassenger_airbag(passenger_airbag);
			car.setPlayer(player);
			car.setSensor(sensor);
			car.setSeats(seats);
			car.setEngine_warning(engine_warning);
			car.setLocking(locking);
			car.setHeadlamps(headlamps);
			car.setNewcar(newcar);
			car.setUsedcar(usedcar);
		}
		request.setAttribute("car", car);
		request.getRequestDispatcher("listing-detail-2.jsp").forward(request, response);
    }

}
