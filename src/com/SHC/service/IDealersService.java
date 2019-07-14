package com.SHC.service;

import java.util.List;

import com.SHC.model.CarBill;
import com.SHC.model.Dealers;
import com.model.Car2;

public interface IDealersService {
	public List<Dealers> displayDealers(int currentPage);
	
	public int dealersNum();
	
	public Dealers dealersprofile(int id);
	
	public Car2 searchCarInfo(long vid);
	
	public void createOrder(CarBill cb,long vid);
	
	public CarBill carOffer(long vid);
}
