package com.dao;

import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;

public interface ICarDao {
	void insertCarEngin(CarEngin ce);
	void insertCarAccessories(CarAccessories ca);
	void insertCarModel(CarModel cm);
	void insertCarInfo(CarInfo ci);
}
