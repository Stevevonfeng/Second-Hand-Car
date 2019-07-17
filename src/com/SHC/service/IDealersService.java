package com.SHC.service;

import java.util.List;

import com.SHC.model.CarBill;
import com.SHC.model.Dealers;
import com.SHC.model.GoodOrder;
import com.model.Car2;

public interface IDealersService {
	public List<Dealers> displayDealers(int currentPage);
	
	public int dealersNum();
	
	public Dealers dealersprofile(String userid);
	
	public Car2 searchCarInfo(long vid);
	
	public void createOrder(CarBill cb,long vid);
	
	public CarBill carOffer(long vid);
	
	//搜索订单
	public GoodOrder searchOrderByOrdernum(String ordernum);
	
	//显示用户拥有车辆
	public int carsNumById(String userid);
}
