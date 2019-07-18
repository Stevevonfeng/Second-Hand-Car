package com.model;

import java.io.File;

public class Ajax {
	public static void main(String[] args) {
		brand();
	}
	
	public static void append() {
		String str = "";
		
		str = str.replaceAll("\"", "'");
		/*str = str.replaceAll("\r\n", "");*/
		System.out.println(str);
		
		String str2 = "";
	}
	
	public static void brand() {
		int i = 15;
		File file = new File("C:\\Users\\Administrator\\Desktop\\二手车\\汽车");
		File[] files = file.listFiles();
		for(File f:files) {
			if(f.isDirectory()) {
				String brand = f.getName();
				File[] ffs = f.listFiles();
				for(File ff:ffs) {
					String model = ff.getName();
					System.out.println("insert into car(cid,brand,model) values("+i+",'"+brand+"','"+model+"');");
					i++;
				}
			}
		}
	}
}
