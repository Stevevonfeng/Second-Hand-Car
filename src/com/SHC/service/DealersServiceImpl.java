package com.SHC.service;

import com.SHC.dao.DealersDaoImpl;
import com.SHC.dao.IDealersDao;
import com.SHC.model.Dealers;

public class DealersServiceImpl implements IDealersService {
	
	private IDealersDao dealersDao = new DealersDaoImpl();

	@Override
	public void addDealers(Dealers dealers) {
		
		dealersDao.addDealers(dealers);
		
	}
	
	

}
