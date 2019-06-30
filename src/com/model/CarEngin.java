package com.model;

public class CarEngin {
	long vid;                
   	String engien;
	 String engiendescription;
	 int cylinders; 
	 int mileage;  
	 int mileage_h;    
	 int capacity;    
	 int s_capacity ;  
	 String transmission;
	public CarEngin() {
		super();
	}
	public CarEngin(long vid, String engien, String engiendescription, int cylinders, int mileage, int mileage_h,
			int capacity, int s_capacity, String transmission) {
		super();
		this.vid = vid;
		this.engien = engien;
		this.engiendescription = engiendescription;
		this.cylinders = cylinders;
		this.mileage = mileage;
		this.mileage_h = mileage_h;
		this.capacity = capacity;
		this.s_capacity = s_capacity;
		this.transmission = transmission;
	}
	public long getVid() {
		return vid;
	}
	public void setVid(long vid) {
		this.vid = vid;
	}
	public String getEngien() {
		return engien;
	}
	public void setEngien(String engien) {
		this.engien = engien;
	}
	public String getEngiendescription() {
		return engiendescription;
	}
	public void setEngiendescription(String engiendescription) {
		this.engiendescription = engiendescription;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getMileage_h() {
		return mileage_h;
	}
	public void setMileage_h(int mileage_h) {
		this.mileage_h = mileage_h;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getS_capacity() {
		return s_capacity;
	}
	public void setS_capacity(int s_capacity) {
		this.s_capacity = s_capacity;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	 
}
