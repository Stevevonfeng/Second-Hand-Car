package com.service;

import java.util.List;

import com.dao.IListDao;
import com.dao.ListDaoImpl;
import com.model.Car2;

public class ListServiceImpl implements IListService{

	@Override
	public List<Car2> ListShow(int currentPage) {
		IListDao ild = new ListDaoImpl();
		return ild.ListShow(currentPage);
	}

	@Override
	public int carsNum() {
		IListDao ild = new ListDaoImpl();
		return ild.carsNum();
	}

	@Override
	public Car2 CarShow(long vid) {
		IListDao ild = new ListDaoImpl();
		return ild.CarShow(vid);
	}
	
	

}
