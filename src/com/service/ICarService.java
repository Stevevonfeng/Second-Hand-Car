package com.service;

import java.util.List;

import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;

public interface ICarService {
	void addCarModel(CarModel cm);
	void addCarInfo(CarInfo ci);
	void addCarEngin(CarEngin ce);
	void addCarAccessories(CarAccessories ca);
	List<CarModel> findCarById(String userid);
}
