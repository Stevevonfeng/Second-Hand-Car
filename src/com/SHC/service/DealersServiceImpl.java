package com.SHC.service;

import java.util.List;

import com.SHC.dao.DealersDaoImpl;
import com.SHC.dao.IDealersDao;
import com.SHC.model.CarBill;
import com.SHC.model.Dealers;
import com.model.Car2;

public class DealersServiceImpl implements IDealersService {

	@Override
	public List<Dealers> displayDealers(int currentPage) {
		IDealersDao idd = new DealersDaoImpl();
		return idd.displayDealers(currentPage);
	}

	@Override
	public int dealersNum() {
		IDealersDao idd = new DealersDaoImpl();
		return idd.dealersNum();
	}

	@Override
	public Dealers dealersprofile(int id) {
		IDealersDao idd = new DealersDaoImpl();
		return idd.dealersprofile(id);
	}

	@Override
	public CarBill carOffer(long vid) {
		IDealersDao idd = new DealersDaoImpl();
		return idd.carOffer(vid);
	}

	@Override
	public void createOrder(CarBill cb,long vid) {
		IDealersDao idd = new DealersDaoImpl();
		idd.createOrder(cb,vid);
	}

	@Override
	public Car2 searchCarInfo(long vid) {
		IDealersDao idd = new DealersDaoImpl();
		return idd.searchCarInfo(vid);
	}




	
	

}
