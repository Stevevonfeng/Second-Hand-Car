package com.model;

import java.util.Date;

public class Car2 {
	long vid;
	String vehiclestitle;
	String brand;              
	String model;               
	String version;            
	String vod;                
	String price;            
	String upload;
	String userid;
	Date year;
	String owners;
	String kms;
	String fuel;
	String engien;
	String engiendescription;
	 int cylinders; 
	 int mileage;  
	 int mileage_h;    
	 int capacity;    
	 int s_capacity ;  
	String transmission;
	String air_conditioner;
	String door;
	String antilock;
	String brake;
	String steering;
	String  airbag;
	String windows;
	String passenger_airbag;
	String player;
	String sensor;
	String seats;
	String engine_warning;
	String locking;
	String headlamps;
	String newcar;
	String usedcar;
	public Car2(long vid, String vehiclestitle, String brand, String model, String version, String vod, String price,
			String upload, String userid, Date year, String owners, String kms, String fuel, String engien,
			String engiendescription, int cylinders, int mileage, int mileage_h, int capacity, int s_capacity,
			String transmission, String air_conditioner, String door, String antilock, String brake, String steering,
			String airbag, String windows, String passenger_airbag, String player, String sensor, String seats,
			String engine_warning, String locking, String headlamps, String newcar, String usedcar) {
		super();
		this.vid = vid;
		this.vehiclestitle = vehiclestitle;
		this.brand = brand;
		this.model = model;
		this.version = version;
		this.vod = vod;
		this.price = price;
		this.upload = upload;
		this.userid = userid;
		this.year = year;
		this.owners = owners;
		this.kms = kms;
		this.fuel = fuel;
		this.engien = engien;
		this.engiendescription = engiendescription;
		this.cylinders = cylinders;
		this.mileage = mileage;
		this.mileage_h = mileage_h;
		this.capacity = capacity;
		this.s_capacity = s_capacity;
		this.transmission = transmission;
		this.air_conditioner = air_conditioner;
		this.door = door;
		this.antilock = antilock;
		this.brake = brake;
		this.steering = steering;
		this.airbag = airbag;
		this.windows = windows;
		this.passenger_airbag = passenger_airbag;
		this.player = player;
		this.sensor = sensor;
		this.seats = seats;
		this.engine_warning = engine_warning;
		this.locking = locking;
		this.headlamps = headlamps;
		this.newcar = newcar;
		this.usedcar = usedcar;
	}
	public Car2() {
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
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
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
	public String getAir_conditioner() {
		return air_conditioner;
	}
	public void setAir_conditioner(String air_conditioner) {
		this.air_conditioner = air_conditioner;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getAntilock() {
		return antilock;
	}
	public void setAntilock(String antilock) {
		this.antilock = antilock;
	}
	public String getBrake() {
		return brake;
	}
	public void setBrake(String brake) {
		this.brake = brake;
	}
	public String getSteering() {
		return steering;
	}
	public void setSteering(String steering) {
		this.steering = steering;
	}
	public String getAirbag() {
		return airbag;
	}
	public void setAirbag(String airbag) {
		this.airbag = airbag;
	}
	public String getWindows() {
		return windows;
	}
	public void setWindows(String windows) {
		this.windows = windows;
	}
	public String getPassenger_airbag() {
		return passenger_airbag;
	}
	public void setPassenger_airbag(String passenger_airbag) {
		this.passenger_airbag = passenger_airbag;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getSensor() {
		return sensor;
	}
	public void setSensor(String sensor) {
		this.sensor = sensor;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getEngine_warning() {
		return engine_warning;
	}
	public void setEngine_warning(String engine_warning) {
		this.engine_warning = engine_warning;
	}
	public String getLocking() {
		return locking;
	}
	public void setLocking(String locking) {
		this.locking = locking;
	}
	public String getHeadlamps() {
		return headlamps;
	}
	public void setHeadlamps(String headlamps) {
		this.headlamps = headlamps;
	}
	public String getNewcar() {
		return newcar;
	}
	public void setNewcar(String newcar) {
		this.newcar = newcar;
	}
	public String getUsedcar() {
		return usedcar;
	}
	public void setUsedcar(String usedcar) {
		this.usedcar = usedcar;
	}
	@Override
	public String toString() {
		return "Car2 [vid=" + vid + ", vehiclestitle=" + vehiclestitle + ", brand=" + brand + ", model=" + model
				+ ", version=" + version + ", vod=" + vod + ", price=" + price + ", upload=" + upload + ", userid="
				+ userid + ", year=" + year + ", owners=" + owners + ", kms=" + kms + ", fuel=" + fuel + ", engien="
				+ engien + ", engiendescription=" + engiendescription + ", cylinders=" + cylinders + ", mileage="
				+ mileage + ", mileage_h=" + mileage_h + ", capacity=" + capacity + ", s_capacity=" + s_capacity
				+ ", transmission=" + transmission + ", air_conditioner=" + air_conditioner + ", door=" + door
				+ ", antilock=" + antilock + ", brake=" + brake + ", steering=" + steering + ", airbag=" + airbag
				+ ", windows=" + windows + ", passenger_airbag=" + passenger_airbag + ", player=" + player + ", sensor="
				+ sensor + ", seats=" + seats + ", engine_warning=" + engine_warning + ", locking=" + locking
				+ ", headlamps=" + headlamps + ", newcar=" + newcar + ", usedcar=" + usedcar + "]";
	}
	
	
	
}
