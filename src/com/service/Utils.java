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
	static long vid;
	
	
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
		long oldVid = 0;
		vid = time;
		boolean isInseart = true;
		String upload = "";
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
					oldVid = Long.parseLong(item.getString());
				}
				if(item.getFieldName().equals("filename")) {
					filename = item.getString();
				}
				for(Field field:fields) {
					if(field.getName().equals("vid")) {
						try {
							if(isInseart) {
								field.setAccessible(true);
								field.set(obj, vid);
							}else {
								field.setAccessible(true);
								field.set(obj, oldVid);
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
								SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
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
						uploadF.set(obj,upload);
						continue;
					}
					String subfix = fileName.substring(fileName.indexOf("."));
					upload =  new Date().getTime()/fileName.hashCode()+subfix;
					System.out.println(upload);
					Field uploadF = cls.getDeclaredField("upload");
					uploadF.setAccessible(true);
					
					uploadF.set(obj,upload);
					File file = null;
					if(isInseart) {
						File dir = new File("C:\\dbimgs\\"+vid);
						dir.mkdirs();
						file = new File("C:\\dbimgs\\"+vid+"\\"+upload);
						if(!file.exists()) {
							file.createNewFile();
						}
					}else{
						File dir = new File("C:\\dbimgs\\"+oldVid);
						dir.mkdirs();
						file = new File("C:\\dbimgs\\"+oldVid+"\\"+upload);
						if(!file.exists()) {
							file.createNewFile();
						}
					}
					
					FileOutputStream out = new FileOutputStream(file);
					
					byte[] b = new byte[1024];
					int len = -1;
					
					while((len=in.read(b))!=-1) {
						out.write(b);
					}
					
					if(!isInseart) {
						System.out.println("not inseart!!!");
						File oldFile = new File("C:\\dbimgs\\"+vid+File.separator+filename);
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
		System.out.println(ajaxText);
	}
	
	public static void deleteImg(long vid) {
		//File oldFile = new File("C:\\dbimgs\\"+vid+File.separator+path);
		delFolder("C:\\dbimgs\\"+vid+File.separator);
	}
	
	public static void delFolder(String folderPath) {
	     try {
	        delAllFile(folderPath); //删除完里面所有内容
	        String filePath = folderPath;
	        filePath = filePath.toString();
	        java.io.File myFilePath = new java.io.File(filePath);
	        myFilePath.delete(); //删除空文件夹
	     } catch (Exception e) {
	       e.printStackTrace(); 
	     }
	}
	
	 public static boolean delAllFile(String path) {
	       boolean flag = false;
	       File file = new File(path);
	       if (!file.exists()) {
	         return flag;
	       }
	       if (!file.isDirectory()) {
	         return flag;
	       }
	       String[] tempList = file.list();
	       File temp = null;
	       for (int i = 0; i < tempList.length; i++) {
	          if (path.endsWith(File.separator)) {
	             temp = new File(path + tempList[i]);
	          } else {
	              temp = new File(path + File.separator + tempList[i]);
	          }
	          if (temp.isFile()) {
	             temp.delete();
	          }
	          if (temp.isDirectory()) {
	             delAllFile(path + "/" + tempList[i]);//先删除文件夹里面的文件
	             delFolder(path + "/" + tempList[i]);//再删除空文件夹
	             flag = true;
	          }
	       }
	       return flag;
	     }
	
	 public static List<String> findCarImgs(String path){
		 List<String> list = new ArrayList<String>();
		 File file = new File(path);
		 String[] files =  file.list();
		 for(String fil:files) {
			 list.add(fil);
		 }
		 return list;
	 }
	 
	 public static String getSql(String brand,String model,String version,String year,String statu,String price) {
		 	String sql = "select * from car2 ";
			if(brand!=null&&!brand.equals("选择品牌")&&!brand.equals("")) {
				sql = sql+"where brand='"+brand+"' ";
			}
			if(model!=null&&!model.equals("选择车型")&&!model.equals("")) {
				sql = sql+"and model='"+model+"' ";
			}
			if(version!=null&&!version.equals("")) {
				sql = sql+"and version='"+version+"' ";
			}
			if(year!=null&&!year.equals("Year of Model")&&!year.equals("")) {
				int yearI = Integer.parseInt(year);
				if(brand==null||brand.equals("选择品牌")||brand.equals("")) {
					sql = sql+"where to_char(year,'YYYY')>'"+(yearI-1)+"' and to_char(year,'YYYY')<'"+(yearI+1)+"'";
				}else {
					sql = sql + "and to_char(year,'YYYY')>'"+(yearI-1)+"' and to_char(year,'YYYY')<'"+(yearI+1)+"'";
					
				}
				//sql = sql+"and year>to_date('"+(yearI-1)+"','YYYY') and year<to_date('"+(yearI+1)+"','YYYY') ";
			}
			if(statu!=null&&!statu.equals("汽车类型")&&!statu.equals("")){
				boolean other = true;
				if((brand==null||brand.equals("选择品牌")||brand.equals(""))&&(year==null||year.equals("Year of Model")||year.equals(""))) {
					sql = sql+"where "+statu +" is not null  ";
					other = false;
				}
				if(other) {
					sql = sql+"and "+statu +" is not null  ";
				}	
			}
			if(price!=null&&!price.equals("")) {
				String[] strs = price.split(",");
				boolean other = true;
				if((brand==null||brand.equals("选择品牌")||brand.equals(""))&&(year==null||year.equals("Year of Model")||year.equals(""))&&(statu==null||statu.equals("汽车类型")||statu.equals(""))) {
							sql = sql+"where price>"+strs[0]+" and  price<"+strs[1]+"";
							other = false;
				}
				if(other) {
					sql = sql+"and price>"+strs[0]+" and  price<"+strs[1]+"";
				}
				
			}
		 return sql;
	 }
}
