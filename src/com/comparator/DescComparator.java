package com.comparator;

import java.util.Comparator;

import com.model.Car2;

public class DescComparator implements Comparator<Car2>{

	@Override
	public int compare(Car2 c1, Car2 c2) {
		int car1 = Integer.parseInt(c1.getPrice());
		int car2 = Integer.parseInt(c2.getPrice());
		return car2-car1;
	}

}
