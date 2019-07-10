package com.SHC.model;

import java.util.Date;

public class CarBill {
	
	private String billnum;
	private String vehiclestitle;
	private String brand;
	private String model;
	private String version;
	private String year;
	private String fuel;
	private String carNO;//车的新旧
	private String price;
	public String getBillnum() {
		return billnum;
	}
	public void setBillnum(String billnum) {
		this.billnum = billnum;
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
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getCarNO() {
		return carNO;
	}
	public void setCarNO(String carNO) {
		this.carNO = carNO;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	

}
