package com.SHC.service;

import java.util.List;

import com.SHC.model.CarBill;
import com.SHC.model.Dealers;

public interface IDealersService {
	public List<Dealers> displayDealers(int currentPage);
	
	public int dealersNum();
	
	public Dealers dealersprofile(int id);
	
	public CarBill carOffer(long vid);
}
