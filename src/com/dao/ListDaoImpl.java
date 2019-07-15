package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.model.Car2;
import com.model.Users;

public class ListDaoImpl implements IListDao{
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

	public List<Car2> ListShow(int currentPage) {
		int pz = 3;
		int cp = currentPage;
		List<Car2> cars = new ArrayList<Car2>();
		
			try {
				
				String sql = "select * from (select t1.*,rownum num from "
						+ "(select * from car2 where active='active' order by price desc) t1 where rownum<="+pz*cp+") t2 "
						+ "where t2.num>"+(cp-1)*pz+"";
				
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				
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
					String engine = rs.getString(14);
					String enginedescription = rs.getString(15);
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
					String compare = rs.getString("compare");
					
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
					car.setEngien(engine);//鏈夐棶棰�
					car.setEngiendescription(enginedescription);//鏈夐棶棰�
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
					car.setAirbag(airbag);
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
					car.setCompare(compare);
					
					cars.add(car);
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return cars;
	}

	@Override
	public int carsNum() {
		int count=0;
		try {
			String sql="select count(*) from car2";
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
	public Car2 CarShow(long vid) {
		Car2 car = new Car2();;
		try {
			String sql = "select * from car2 where vid=" + vid + "";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				vid = rs.getLong(1);
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
				String engine = rs.getString(14);
				String enginedescription = rs.getString(15);
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
				String compare = rs.getString("compare");

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
				car.setEngien(engine);
				car.setEngiendescription(enginedescription);
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
				car.setAirbag(airbag);
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
				car.setCompare(compare);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}

	public List<Car2> SimilarCar(String brand,long vid) {
		List<Car2> cars = new ArrayList<Car2>();
		
		try {
			
			String sql = "select * from (select t1.*,rownum num from"
					+ " (select * from car2 where brand='"+brand+"' and vid !="+vid+" "
					+ "order by price desc) t1 where rownum<5)";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()){
				vid = rs.getLong(1);
				String vehiclestitle = rs.getString(2);
				brand = rs.getString(3);
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
				String engine = rs.getString(14);
				String enginedescription = rs.getString(15);
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
				car.setEngien(engine);//鏈夐棶棰�
				car.setEngiendescription(enginedescription);//鏈夐棶棰�
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
				car.setAirbag(airbag);
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cars;
	}

	@Override
	public List<Car2> NewListShow(int currentPage) {
		int pz = 3;
		int cp = currentPage;
		String sql = "select * from (select t1.*,rownum num from "
				+ "(select * from car2 where newcar= '"+"newcar"+"' order by price desc) t1 where rownum<="+pz*cp+") t2 "
				+ "where t2.num>"+(cp-1)*pz+"";
		List<Car2> cars = SqlInput(sql);
		return cars;
	}

	@Override
	public List<Car2> UsedListShow(int currentPage) {
		int pz = 3;
		int cp = currentPage;
		String sql = "select * from (select t1.*,rownum num from "
				+ "(select * from car2 where usedcar= '"+"usedcar"+"' order by price desc) t1 where rownum<="+pz*cp+") t2 "
				+ "where t2.num>"+(cp-1)*pz+"";
		List<Car2> cars = SqlInput(sql);
		return cars;
	}

	@Override
	public List<Car2> SqlInput(String sql) {
		List<Car2> cars = new ArrayList<Car2>();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
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
				String engine = rs.getString(14);
				String enginedescription = rs.getString(15);
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
				car.setEngien(engine);//鏈夐棶棰�
				car.setEngiendescription(enginedescription);//鏈夐棶棰�
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
				car.setAirbag(airbag);
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cars;
	}

	@Override
	public int carsNum2(String type) {
		int count=0;
		try {
			String sql="select count(*) from car2 where "+type+"='"+type+"'";
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
	public Users userShow(String userid) {
		Users user = new Users();;
		try {
			String sql = "select * from tb_user where userid=" + userid + "";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				userid = rs.getString(1);
				String username = rs.getString(2);
				String email = rs.getString(3);
				String userpassword = rs.getString(4);
				String phone = rs.getString(5);
				String birth = rs.getString(6);
				String adress = rs.getString(7);
				String country = rs.getString(8);
				String province = rs.getString(9);
				String image = rs.getString(10);
				String status = rs.getString(11);
				
				user.setUserid(userid);
				user.setUsername(username);
				user.setEmail(email);
				user.setUserpassword(userpassword);
				user.setPhone(phone);
				user.setBirth(birth);
				user.setAdress(adress);
				user.setCountry(country);
				user.setProvince(province);
				user.setImage(image);
				user.setStatus(status);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	
	

}
