package com.service;

import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;

public interface ICarService {
	void addCarModel(CarModel cm);
	void addCarInfo(CarInfo ci);
	void addCarEngin(CarEngin ce);
	void addCarAccessories(CarAccessories ca);
}
