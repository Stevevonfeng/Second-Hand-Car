package com.model;

public class CarAccessories {
	 	long vid;
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
		public CarAccessories() {
			super();
		}
		public CarAccessories(long vid, String air_conditioner, String door, String antilock, String brake,
				String steering, String airbag, String windows, String passenger_airbag, String player, String sensor,
				String seats, String engine_warning, String locking, String headlamps, String newcar, String usedcar) {
			super();
			this.vid = vid;
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
		public long getVid() {
			return vid;
		}
		public void setVid(long vid) {
			this.vid = vid;
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
	    
}
