package com.model;

import java.lang.reflect.Field;

public class Ajax {
	public static void main(String[] args) {
		String str = "brand,model,version,year,statu,price";
		String[] strs = str.split(",");
		
		for(String s:strs) {
			System.out.print("&"+s+"=${"+s+"}");
		}
	}
}
