package com.model;

public class Car {
	int cid;
	String brand;
	String model;
	String version;
	public Car() {
		super();
	}
	public Car(int cid, String brand, String model, String version) {
		super();
		this.cid = cid;
		this.brand = brand;
		this.model = model;
		this.version = version;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", brand=" + brand + ", model=" + model + ", version=" + version + "]";
	}
	
}
