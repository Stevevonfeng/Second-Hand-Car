package com.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;

public class Util {
	
	public CarModel reqToCarModel(List<FileItem> list,Long vid) throws UnsupportedEncodingException{
		String vehiclestitle =null;
		String brand = null;
		String model = null;
		String version = null;
		String vod =null;
		String price = null;
		String upload = null;
		try {
			for(FileItem item:list) {
				if(item.isFormField()) {
					String fieldName = item.getFieldName();
					String value = item.getString();
					if(fieldName.equals("vehiclestitle")) {
						vehiclestitle = value;
					}else if(fieldName.equals("brand")) {
						brand = item.getString();
					}else if(fieldName.equals("model")) {
						model = item.getString();
					}else if(fieldName.equals("version")) {
						version = item.getString();
					}else if(fieldName.equals("vod")) {
						vod = item.getString();
					}else if(fieldName.equals("price")) {
						price = item.getString();
					}else if(fieldName.equals("upload")) {
						upload = item.getString();
					}
					
				}else {
					
					InputStream in = item.getInputStream();
					String fileName = item.getName();
					String subfix = fileName.substring(fileName.indexOf("."));
					upload = new Date().getTime()+subfix;
					
					File file = new File("C:\\Users\\Administrator\\git\\SecondHandCar\\WebContent\\dbimgs\\"+upload);
					if(!file.exists()) {
						file.createNewFile();
					}
					
					
					
					FileOutputStream out = new FileOutputStream(file);
					
					byte[] b = new byte[1024];
					int len = -1;
					
					while((len=in.read(b))!=-1) {
						out.write(b);
					}
					
					in.close();
					out.close();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CarModel cm = new CarModel(vid, vehiclestitle, brand, model, version, vod, price, upload);
		
		return cm;
	}
	
	public CarInfo reqToCarInfo(List<FileItem> list,Long vid) {
		CarInfo ci = new CarInfo();
		ci.setVid(vid);
		for(FileItem item : list) {
			if(item.isFormField()) {
				if(item.getFieldName().equals("year")) {
					String value = item.getString();
					SimpleDateFormat d = new SimpleDateFormat("YY-MM-DD"); 
					try {
						ci.setYear(new Date(d.parse(value).getTime()));
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else if(item.getFieldName().equals("owners")) {
					ci.setOwners(item.getString());
				}else if(item.getFieldName().equals("kms")) {
					ci.setKms(item.getString());
				}else if(item.getFieldName().equals("fuel")) {
					ci.setFuel(item.getString());
				}
				
			}else {
				
			}
		}
		return ci;
	}
	
	public CarEngin reqToCarEngin(List<FileItem> list,Long vid) {
		CarEngin ce = new CarEngin();
		ce.setVid(vid);
		for(FileItem item : list) {
			if(item.isFormField()) {
				if(item.getFieldName().equals("engien")) {
					ce.setEngien(item.getString());
				}else if(item.getFieldName().equals("engiendescription")) {
					ce.setEngiendescription(item.getString());
				}else if(item.getFieldName().equals("cylinders")) {
					ce.setCylinders(Integer.parseInt(item.getString()));
				}else if(item.getFieldName().equals("mileage")) {
					ce.setMileage(Integer.parseInt(item.getString()));
				}else if(item.getFieldName().equals("mileage_h")) {
					ce.setMileage_h(Integer.parseInt(item.getString()));
				}else if(item.getFieldName().equals("capacity")) {
					ce.setCapacity(Integer.parseInt(item.getString()));
				}else if(item.getFieldName().equals("s_capacity")) {
					ce.setS_capacity(Integer.parseInt(item.getString()));
				}else if(item.getFieldName().equals("transmission")) {
					ce.setTransmission(item.getString());
				}
				
			}else {
				
			}
		}
		return ce;
	}
	
	public CarAccessories reqToCarAccessories(List<FileItem> list,Long vid) {
		CarAccessories ca = new CarAccessories();
		ca.setVid(vid);
		for(FileItem item : list) {
			if(item.isFormField()) {
				if(item.getFieldName().equals("accessories")) {
					if(item.getString().equals("air_conditioner")) {
						ca.setAir_conditioner("1");
					}else if(item.getString().equals("door")) {
						ca.setDoor("1");
					}else if(item.getString().equals("antilock")) {
						ca.setAntilock("1");
					}else if(item.getString().equals("brake")) {
						ca.setBrake("1");
					}else if(item.getString().equals("steering")) {
						ca.setSteering("1");
					}else if(item.getString().equals("airbag")) {
						ca.setAirbag("1");
					}else if(item.getString().equals("windows")) {
						ca.setWindows("1");
					}else if(item.getString().equals("passenger_airbag")) {
						ca.setPassenger_airbag("1");
					}else if(item.getString().equals("player")) {
						ca.setPlayer("1");
					}else if(item.getString().equals("sensor")) {
						ca.setSensor("1");
					}else if(item.getString().equals("seats")) {
						ca.setSeats("1");
					}else if(item.getString().equals("engine_warning")) {
						ca.setEngine_warning("1");
					}else if(item.getString().equals("locking")) {
						ca.setLocking("1");
					}else if(item.getString().equals("headlamps")) {
						ca.setHeadlamps("1");
					}
				}else if(item.getFieldName().equals("vehicle_type")) {
					if(item.getString().equals("newcar")) {
						ca.setNewcar("1");
					}else if(item.getString().equals("usedcar")) {
						ca.setUsedcar("1");
					}
				}
			}else {
				
			}
		}
		return ca;
	}
}
