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
			String sql="select ordernum, vid, price, des, status from goodorder where ordernum = '"+ordernum+"'";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()){
				ordernum = rs.getString(1);
				long vid = rs.getLong(2);
				int price = rs.getInt(3);
				String des = rs.getString(4);
				String status = rs.getString(5);
				
				go.setOrdernum(ordernum);
				go.setVid(vid);
				go.setPrice(price);
				go.setDes(des);
				go.setBillstatus(status);
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


	@Override
	public List<Car2> displayDealersCars(String userid) {
		List<Car2> cars = new ArrayList<Car2>();
		String sql = "select * from car2 where userid = "+userid+" ";
		
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
				userid = rs.getString(9);
				
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
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cars;
	}


	@Override
	public List<GoodOrder> searchOrderByUserid(String userid) {
		List<GoodOrder> golist = new ArrayList<GoodOrder>();
		String sql="select ordernum, vid, price, des ,status from goodorder where userid = "+userid+"";
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()){
				String ordernum = rs.getString("ordernum");
				long vid = rs.getLong("vid");
				int price = rs.getInt("price");
				String des = rs.getString("des");
				String status = rs.getString("status");
				
				GoodOrder go = new GoodOrder();
				go.setOrdernum(ordernum);
				go.setVid(vid);
				go.setPrice(price);
				go.setDes(des);
				go.setBillstatus(status);
				golist.add(go);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return golist;
	}


	@Override
	public void paySuccess(String ordernum) {
		
		try {
			String sql = "update goodorder set status ='已支付' where ordernum = " + ordernum;

			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	@Override
	public List<GoodOrder> getOrderByUserid(String userid) {
		List<GoodOrder> golist = new ArrayList<GoodOrder>();
		String sql="select g.ordernum, g.vid, g.price, g.des, g.status,c.userid from goodorder g,car2 c,tb_user u where c.vid = g.vid and u.userid="+userid+"";
		

			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				
				while(rs.next()){
					String ordernum = rs.getString("ordernum");
					long vid = rs.getLong("vid");
					int price = rs.getInt("price");
					String des = rs.getString("des");
					String status = rs.getString("status");
					
					GoodOrder go = new GoodOrder();
					go.setOrdernum(ordernum);
					go.setVid(vid);
					go.setPrice(price);
					go.setDes(des);
					go.setBillstatus(status);
					golist.add(go);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		return golist;
		
	}



}
