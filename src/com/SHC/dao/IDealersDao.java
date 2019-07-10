package com.SHC.dao;

import java.util.List;

import com.SHC.model.CarBill;
import com.SHC.model.Dealers;

public interface IDealersDao {
		
	//展示商家界面
	public List<Dealers> displayDealers(int currentPage);
	//计算总记录数
	public int dealersNum();
	//展示商家详细信息
	public Dealers dealersprofile(int id);
	//支付btn
	public CarBill carOffer(long vid);
	

}
