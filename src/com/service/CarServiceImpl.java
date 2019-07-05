package com.service;

import java.util.List;

import com.dao.CarDaoImpl;
import com.dao.ICarDao;
import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;

public class CarServiceImpl implements ICarService{

	@Override
	public void addCarModel(CarModel c) {
		ICarDao icd = new CarDaoImpl();
		icd.insertCarModel(c);
	}

	@Override
	public void addCarInfo(CarInfo ci) {
		ICarDao icd = new CarDaoImpl();
		icd.insertCarInfo(ci);
	}

	@Override
	public void addCarEngin(CarEngin ce) {
		ICarDao icd = new CarDaoImpl();
		icd.insertCarEngin(ce);
		
	}

	@Override
	public void addCarAccessories(CarAccessories ca) {
		ICarDao icd = new CarDaoImpl();
		icd.insertCarAccessories(ca);
	}

	@Override
	public List<CarModel> findCarById(String userid) {
		ICarDao ic = new CarDaoImpl();
		List<CarModel> cars = ic.searchById(userid);
		return cars;
	}

	
}
