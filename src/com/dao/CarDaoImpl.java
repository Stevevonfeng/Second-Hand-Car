package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;

public class CarDaoImpl implements ICarDao{
	static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String user = "scott";
	static String password = "admin";
	static Connection c = null;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void insertCarModel(CarModel cm) {
		try {
			String sql = "insert into car_model(vid,vehiclestitle,brand,model,version,vod,price,upload) values(?,?,?,?,?,?,?,?)";
			PreparedStatement p = c.prepareStatement(sql);
			p.setLong(1, cm.getVid());
			p.setString(2, cm.getVehiclestitle());
			p.setString(3, cm.getBrand());
			p.setString(4, cm.getModel());
			p.setString(5, cm.getVersion());
			p.setString(6, cm.getVod());
			p.setString(7, cm.getPrice());
			p.setString(8, cm.getUpload());
			p.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertCarInfo(CarInfo ci) {
		try {
			String sql = "insert into car_info(vid,year,owners,kms,fuel) values(?,?,?,?,?)";
			PreparedStatement p = c.prepareStatement(sql);
			p.setLong(1, ci.getVid());
			p.setDate(2, new Date(ci.getYear().getTime()));
			p.setString(3, ci.getOwners());
			p.setString(4, ci.getKms());
			p.setString(5, ci.getFuel());
			p.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertCarEngin(CarEngin ce) {
		try {
			String sql = "insert into car_engin(vid,engien,engiendescription,cylinders,mileage,mileage_h,"
					+ "capacity,s_capacity,transmission) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement p = c.prepareStatement(sql);
			p.setLong(1, ce.getVid());
			p.setString(2,ce.getEngien());
			p.setString(3,ce.getEngiendescription());
			p.setInt(4, ce.getCylinders());
			p.setInt(5, ce.getMileage());
			p.setInt(6, ce.getMileage_h());
			p.setInt(7, ce.getCapacity());
			p.setInt(8, ce.getS_capacity());
			p.setString(9, ce.getTransmission());
			p.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertCarAccessories(CarAccessories ca) {
		try {
			String sql = "insert into car_accessories(vid,air_conditioner,door,antilock,brake,"
					+ "steering,airbag,windows,passenger_airbag,player,sensor,seats,engine_warning,"
					+ "locking,headlamps,newcar,usedcar) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement p = c.prepareStatement(sql);
			p.setLong(1, ca.getVid());
			p.setString(2, ca.getAir_conditioner());
			p.setString(3, ca.getDoor());
			p.setString(4, ca.getAntilock());
			p.setString(5, ca.getBrake());
			p.setString(6,ca.getSteering());
			p.setString(7,ca.getAirbag());
			p.setString(8, ca.getWindows());
			p.setString(9, ca.getPassenger_airbag());
			p.setString(10, ca.getPlayer());
			p.setString(11, ca.getSensor());
			p.setString(12, ca.getSeats());
			p.setString(13, ca.getEngine_warning());
			p.setString(14, ca.getLocking());
			p.setString(15, ca.getHeadlamps());
			p.setString(16, ca.getNewcar());
			p.setString(17, ca.getUsedcar());
			p.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
