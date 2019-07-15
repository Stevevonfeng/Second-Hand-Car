package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Car;
import com.model.Car2;
import com.model.CarModel;

public interface ICarDao {
	void inseartObject(Object obj);
	void updateObject(Object obj,long vid);
	void dalete(long vid);
	List<CarModel> searchById(String userid);
	List<Car> searchAllCar();
	List<Car2> searchCar2(String brand,String model,String version,String year,String statu);
	<E> ArrayList<E> searchObject(Class cls,long vid);
	<E> ArrayList<E> searchObject(Class cls,String userid);
}
