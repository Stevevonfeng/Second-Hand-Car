package com.model;

public class CarModel {
	long vid;
	String vehiclestitle;
	String brand;              
	String model;               
	String version;            
	String vod;                
	String Price;            
	String upload;
	String userid;
	public CarModel(long vid, String vehiclestitle, String brand, String model, String version, String vod,
			String price, String upload) {
		super();
		this.vid = vid;
		this.vehiclestitle = vehiclestitle;
		this.brand = brand;
		this.model = model;
		this.version = version;
		this.vod = vod;
		Price = price;
		this.upload = upload;
		this.userid = userid;
	}
	
	public CarModel() {
		super();
	}

	public long getVid() {
		return vid;
	}

	public void setVid(long vid) {
		this.vid = vid;
	}

	public String getVehiclestitle() {
		return vehiclestitle;
	}

	public void setVehiclestitle(String vehiclestitle) {
		this.vehiclestitle = vehiclestitle;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVod() {
		return vod;
	}

	public void setVod(String vod) {
		this.vod = vod;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getUpload() {
		return upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
