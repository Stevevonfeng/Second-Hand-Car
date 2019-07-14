package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Car;
import com.model.Car2;
import com.model.CarModel;

public interface ICarService {
	void addCar(Car2 car);
	void upCar(Car2 car,long vid);
	void removeCar(long vid);
	List<CarModel> findCarById(String userid);
	List<Car> findAllCar();
	<E> ArrayList<E> findObject(Class cls,long vid);
	<E> ArrayList<E> findObject(Class cls,String userid);
}
