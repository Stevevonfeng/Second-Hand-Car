package com.service;

import java.util.List;

import com.model.Car2;

public interface IListService {

	//展示所有车辆
	public List<Car2> ListShow(int currentPage);
	//计算总记录数
	public int carsNum();
	//展示车辆详细信息
	public Car2 CarShow(long vid);

}
