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
	@Override
	public List<Car2> SimilarCar(String brand,long vid) {
		IListDao ild = new ListDaoImpl();
		return ild.SimilarCar(brand,vid);
	}

	@Override
	public List<Car2> NewListShow(int currentPage) {
		IListDao ild = new ListDaoImpl();
		return ild.NewListShow(currentPage);
	}

	@Override
	public List<Car2> UsedListShow(int currentPage) {
		IListDao ild = new ListDaoImpl();
		return ild.UsedListShow(currentPage);
	}

	@Override
	public int carsNum2(String type) {
		IListDao ild = new ListDaoImpl();
		return ild.carsNum2(type);
	}
	
	

}
