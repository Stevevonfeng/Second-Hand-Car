package com.dao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public <E> ArrayList<E> searchObject(Class cls,long vid) {
		String sqlTable = cls.getSimpleName();
		String sql = "select * from "+sqlTable+" where vid="+vid;
		Field[] fields = cls.getDeclaredFields();
		PreparedStatement p = null;
		ResultSet rs = null;
		ArrayList<E> arr = new ArrayList<E>();
		try {
			p = c.prepareStatement(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			rs = p.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next()) {
				Object obj = null;
				try {
					obj = cls.newInstance();
				} catch (InstantiationException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int i=1;i<=fields.length;i++) {
					fields[i-1].setAccessible(true);
					try {
						if(fields[i-1].getType().equals(int.class)) {
							fields[i-1].set(obj, rs.getInt(i));
						}else if(fields[i-1].getType().equals(long.class)){
							fields[i-1].set(obj,rs.getLong(i));
						}else {
							fields[i-1].set(obj, rs.getObject(i));
						}
						
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				arr.add((E) obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}
	

	@Override
	public List<CarModel> searchById(String userid) {
		List<CarModel> cars = new ArrayList<CarModel>();
		try {
			String sql = "select * from car2 where userid=?";
			PreparedStatement p = c.prepareStatement(sql);
			p.setString(1, userid);
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
				long vid = rs.getLong("vid");
				String vehiclestitle = rs.getString("vehiclestitle");
				String brand = rs.getString("brand");
				String model = rs.getString("model");
				String version = rs.getString("version");
				String vod = rs.getString("vod");
				String price = rs.getString("price");
				String upload = rs.getString("upload");
				CarModel car = new CarModel(vid, vehiclestitle, brand, model, version, vod, price, upload, userid);
				cars.add(car);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cars;
	}


	@Override
	public void inseartObject(Object obj) {
		Class cls = obj.getClass();
		String tableName = cls.getSimpleName();
		String tableFields = "";
		String size = "";
		Field[] fields = cls.getDeclaredFields();
		for(Field field :fields) {
			tableFields = tableFields+field.getName()+",";
			size = size+"?,";
		}
		tableFields = tableFields.substring(0, tableFields.length()-1);
		size = size.substring(0, size.length()-1);
		String sql = "insert into "+tableName+"("+tableFields+") values("+size+")";
		System.out.println(sql);
		PreparedStatement p = null;
		try {
			p = c.prepareStatement(sql);
			Class pre = PreparedStatement.class;
			for(int i=1;i<=fields.length;i++) {
				fields[i-1].setAccessible(true);
				if(fields[i-1].getType().equals(java.util.Date.class)) {
					java.util.Date date = (java.util.Date) fields[i-1].get(obj);
					if(date==null) {
						continue;
					}
					Date sqlDate = new Date(date.getTime());
					Method setLong = pre.getDeclaredMethod("setObject", new Class[] {int.class,Object.class});
					setLong.invoke(p, new Object[] {i,sqlDate});
				}else {
					System.out.println(fields[i-1].get(obj));
					Method setObject = pre.getDeclaredMethod("setObject", new Class[] {int.class,Object.class});
					setObject.invoke(p, new Object[] {i,fields[i-1].get(obj)});	
				}
				
			}
			p.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void updateObject(Object obj,long vid) {
		Class cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();
		String tableName = cls.getSimpleName(); 
		String fieldEqu = "";
		String condition = "where vid="+vid;
		for(Field field:fields) {
			field.setAccessible(true);
			String fieldName = field.getName();
			fieldEqu = fieldEqu+fieldName+"=?,";
		}
		fieldEqu = fieldEqu.substring(0, fieldEqu.length()-1);
		String sql = "update "+tableName+" set "+fieldEqu+" "+condition;
		//System.out.println(sql);
		try {
			PreparedStatement p = c.prepareStatement(sql);
			Class pre = PreparedStatement.class;
			for(int i=1;i<=fields.length;i++) {
				fields[i-1].setAccessible(true);
				if(fields[i-1].getType().equals(java.util.Date.class)) {
					java.util.Date date = (java.util.Date) fields[i-1].get(obj);
					Date sqlDate = new Date(date.getTime());
					Method setLong = pre.getDeclaredMethod("setObject", new Class[] {int.class,Object.class});
					setLong.invoke(p, new Object[] {i,sqlDate});
				}else {
					System.out.println(fields[i-1].get(obj));
					Method setObject = pre.getDeclaredMethod("setObject", new Class[] {int.class,Object.class});
					setObject.setAccessible(true);
					setObject.invoke(p, new Object[] {i,fields[i-1].get(obj)});	
				}
				
			}
			p.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}


	@Override
	public void dalete(long vid) {
		String sql = "delete from car2 where vid=?";
		try {
			PreparedStatement p = c.prepareStatement(sql);
			p.setObject(1, vid);
			p.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
