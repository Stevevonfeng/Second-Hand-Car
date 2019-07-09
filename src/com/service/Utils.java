package com.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.fileupload.FileItem;

import com.model.Car2;
import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;

public class Utils {
	public static <E> void objectsToCar(Car2 car,ArrayList<E> arr) {
		Object obj = arr.get(0);
		Class carCls = car.getClass();
		Class arrCls = obj.getClass();
		Field[] arrFields = arrCls.getDeclaredFields();
		Field[] carFields = carCls.getDeclaredFields();
		for(Field carField:carFields) {
			carField.setAccessible(true);
			for(Field arrField:arrFields) {
				arrField.setAccessible(true);
				if(carField.getName().equals(arrField.getName())) {
					try {
						carField.set(car, arrField.get(obj));
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static <E> ArrayList<E> setCar(Class cls,long vid) {
		ICarService cs = new CarServiceImpl();
		ArrayList<E> arrCar2 = cs.findObject(Car2.class,vid);
		return arrCar2;
	}
	
public static Object reqToObject(Object obj,Class cls,List<FileItem> list) {
		long time = new Date().getTime();
		String filename = "";
		long vid = 0;
		boolean isInseart = true;
		try {
			obj = cls.newInstance();
			
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Field[] fields = cls.getDeclaredFields();
		for(FileItem item:list) {
			if(item.isFormField()) {
				if(item.getFieldName().equals("accessories")) {
					setParameterValue(obj,item.getString());
				}
				if(item.getFieldName().equals("vehicle_type")) {
					setParameterValue(obj,item.getString());
				}
				if(item.getFieldName().equals("vid")) {
					isInseart = false;
					vid = Long.parseLong(item.getString());
				}
				if(item.getFieldName().equals("filename")) {
					filename = item.getString();
				}
				for(Field field:fields) {
					if(field.getName().equals("vid")) {
						try {
							if(isInseart) {
								field.setAccessible(true);
								field.set(obj, time);
							}else {
								field.setAccessible(true);
								field.set(obj, vid);
							}
							continue;
						} catch (IllegalArgumentException | IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					if(item.getFieldName().equals(field.getName())) {
						field.setAccessible(true);
						try {
							if(field.getType().equals(String.class)) {
								String str = "";
								try {
									str = new String(item.getString().getBytes("iso8859-1"),"utf-8");
								} catch (UnsupportedEncodingException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								field.set(obj, str);
							}else if(field.getType().equals(int.class)||field.getType().equals(Integer.class)) {
								if(item.getString().equals("")) {
									field.set(obj, 0);
								}else {
									field.set(obj, Integer.parseInt(item.getString()));
								}
							}else if(field.getType().equals(long.class)||field.getType().equals(Long.class)) {
								field.set(obj, Long.parseLong(item.getString()));
							}else if(field.getType().equals(Date.class)) {
								if(item.getString().equals("")) {
									continue;
								}
								SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
								Date date = null;
								try {
									date = sdf.parse(item.getString());
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								field.set(obj, date);
							}
						} catch (IllegalArgumentException | IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}else {
				try {
					InputStream in = item.getInputStream();
					String fileName = item.getName();
					if(fileName==null||fileName.equals("")) {
						Field uploadF = cls.getDeclaredField("upload");
						uploadF.setAccessible(true);
						uploadF.set(obj,filename);
						continue;
					}
					String subfix = fileName.substring(fileName.indexOf("."));
					String upload =  time+subfix;
					Field uploadF = cls.getDeclaredField("upload");
					uploadF.setAccessible(true);
					uploadF.set(obj,upload);
					File file = new File("C:\\dbimgs\\"+upload);
					if(!file.exists()) {
						file.createNewFile();
					}
					FileOutputStream out = new FileOutputStream(file);
					
					byte[] b = new byte[1024];
					int len = -1;
					
					while((len=in.read(b))!=-1) {
						out.write(b);
					}
					
					if(!isInseart) {
						File oldFile = new File("C:\\dbimgs\\"+filename);
						System.out.println(oldFile.getAbsoluteFile());
						oldFile.delete();
					}
					
					in.close();
					out.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return obj;
	}

	public static void setParameterValue(Object obj,String value) {
		if(value==null) {
			return;
		}
		Class cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();
		
			for(Field field:fields) {
				field.setAccessible(true);
				if(value.equals(field.getName())) {
					try {
						field.set(obj,value);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	}
	
	public static void objectToAjaxText(Object obj) {
		Class cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();
		String ajaxText = "";
		for(Field field:fields) {
			field.setAccessible(true);
			ajaxText = ajaxText+"if(rs."+field.getName()+"!=null){\r\n" + 
					"				$('#"+field.getName()+"').attr(\"checked\",\"checked\");\r\n" + 
					"			}";
		}
		//System.out.println(ajaxText);
	}
	
	public static void deleteImg(String path) {
		File oldFile = new File("C:\\dbimgs\\"+path);
		oldFile.delete();
	}
}
