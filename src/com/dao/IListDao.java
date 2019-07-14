package com.dao;

import java.util.List;

import com.model.Car2;

public interface IListDao {
	//展示所有车辆
	public List<Car2> ListShow(int currentPage);
	
	//计算总记录数
	public int carsNum();
	//展示车辆详细信息
	public Car2 CarShow(long vid);
	//展示类似车辆
	public List<Car2> SimilarCar(String brand,long vid);

}
