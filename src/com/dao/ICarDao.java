package com.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;

public interface ICarDao {
	void inseartObject(Object obj);
	void updateObject(Object obj,long vid);
	void dalete(long vid);
	List<CarModel> searchById(String userid);
	<E> ArrayList<E> searchObject(Class cls,long vid);
}
