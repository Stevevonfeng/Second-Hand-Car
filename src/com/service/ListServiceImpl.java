package com.service;

import java.util.List;

import com.dao.IListDao;
import com.dao.ListDaoImpl;
import com.model.Car2;
import com.model.Users;

public class ListServiceImpl implements IListService{
	//汽车列表展示
	@Override
	public List<Car2> ListShow(int currentPage) {
		IListDao ild = new ListDaoImpl();
		return ild.ListShow(currentPage);
	}
	//汽车总数
	@Override
	public int carsNum() {
		IListDao ild = new ListDaoImpl();
		return ild.carsNum();
	}
	//单个汽车
	@Override
	public Car2 CarShow(long vid) {
		IListDao ild = new ListDaoImpl();
		return ild.CarShow(vid);
	}
	//与单个汽车相类似的汽车列表
	@Override
	public List<Car2> SimilarCar(String brand,long vid) {
		IListDao ild = new ListDaoImpl();
		return ild.SimilarCar(brand,vid);
	}
	//汽车用户展示
	@Override
	public Users UserShow(String userid) {
		IListDao ild = new ListDaoImpl();
		return ild.userShow(userid);
	}
	@Override
	public List<Car2> NewListShow(int currentPage) {
		IListDao ild = new ListDaoImpl();
		return ild.NewListShow(currentPage);
	}

	@Override
	public List<Car2> UsedListShow(int currentPage) {
		IListDao ild = new ListDaoImpl();
		return ild.UsedListShow(currentPage);
	}

	@Override

	public int carsNum(String sql) {
		IListDao ild = new ListDaoImpl();
		return ild.carsNum(sql);
	}

	public int carsNum2(String type) {
		IListDao ild = new ListDaoImpl();
		return ild.carsNum2(type);
	}

	
	
	

}
