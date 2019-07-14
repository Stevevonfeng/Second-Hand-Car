package com.model;

import java.lang.reflect.Field;

public class Ajax {
	public static void main(String[] args) {
		Class clazz = Car2.class;
		Field[] fields = clazz.getDeclaredFields();
		for(Field field:fields) {
			System.out.println("if(item."+field.getName()+"!=null){\r\n" + 
					"$(\"#acc\").children(\"li:last-child\").append(\"<div><i class='fa fa-check' aria-hidden='true'></i></div>\");\r\n" + 
					"}else{\r\n" + 
					"$(\"#acc\").children(\"li:last-child\").append(\"<div><i class='fa fa-close' aria-hidden='true'></i></div>\");\r\n" + 
					"}");
		}
	}
}
