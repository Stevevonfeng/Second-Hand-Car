package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.CarDaoImpl;
import com.dao.ICarDao;
import com.model.Car;
import com.model.Car2;
import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;

public class CarServiceImpl implements ICarService{

	@Override
	public List<CarModel> findCarById(String userid) {
		ICarDao ic = new CarDaoImpl();
		List<CarModel> cars = ic.searchById(userid);
		return cars;
	}

	@Override
	public <E> ArrayList<E> findObject(Class cls,long vid) {
		ICarDao icd = new CarDaoImpl();
		ArrayList<E> arr = icd.searchObject(cls,vid);
		return arr;
	}
	
	@Override
	public <E> ArrayList<E> findObject(Class cls, String userid) {
		ICarDao icd = new CarDaoImpl();
		ArrayList<E> list = icd.searchObject(cls, userid);
		return list;
	}

	@Override
	public void addCar(Car2 car) {
		ICarDao icd = new CarDaoImpl();
		icd.inseartObject(car);
	}

	@Override
	public void upCar(Car2 car, long vid) {
		ICarDao icd = new CarDaoImpl();
		icd.updateObject(car, vid);
	}

	@Override
	public void removeCar(long vid) {
		ICarDao icd = new CarDaoImpl();
		icd.dalete(vid);
	}

	@Override
	public List<Car> findAllCar() {
		ICarDao icd = new CarDaoImpl();
		return icd.searchAllCar();
	}	
}
