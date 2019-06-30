package com.model;

import java.util.Date;

public class CarInfo {
	long vid; 
	Date year;
    String owners;
    String kms;
    String fuel;
	public CarInfo() {
		super();
	}
	public CarInfo(long vid, Date year, String owners, String kms, String fuel) {
		super();
		this.vid = vid;
		this.year = year;
		this.owners = owners;
		this.kms = kms;
		this.fuel = fuel;
	}
	public long getVid() {
		return vid;
	}
	public void setVid(long vid) {
		this.vid = vid;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	public String getKms() {
		return kms;
	}
	public void setKms(String kms) {
		this.kms = kms;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
    
    
}
