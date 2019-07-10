package com.service;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

public class Conversion {

	public static void req_obj(Object obj,HttpServletRequest request){
		
		try {
			Class clazz = obj.getClass();
			Field[] fields = clazz.getDeclaredFields();
			
			for(Field f:fields){
				f.setAccessible(true);
				//��������
				String name = f.getName();//empno ename 
				//��������
				Class cls = f.getType();
				//�Ƿ�����
				if(!cls.isArray()){
					//��ȡ�������͵��ַ�����ʾ��ʽ
					String type = cls.getName();
					//�������л�ȡָ�����Ե�ֵ
					String value = request.getParameter(name);
					//userpassword
					if(value==null || value.equals("")){
						
						if(name.equals("userpassword")){
							value = request.getParameter("ypassword");
						}
						
					}
					if(type.equals("java.lang.String")){
						//��obj�����f���Ը�ֵ
						f.set(obj, value);
						
					}else if(type.equals("int") || type.equals("java.lang.Integer")){
						f.set(obj, Integer.parseInt(value));
					}else if(type.equals("double") || type.equals("java.lang.Double")){
						f.set(obj, Double.parseDouble(value));
					}else if(type.equals("float") || type.equals("java.lang.Float")){
						f.set(obj, Float.parseFloat(value));
					}else if(type.equals("java.util.Date")){
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						f.set(obj, sdf.parse(value));
					}
				}else{
					//��ȡ�������͵��ַ�����ʾ��ʽ
					String type = cls.getName();
					String[] ss = request.getParameterValues(name);
					if(int[].class.getName().equals(type) || Integer[].class.getName().equals(type)){
						
						int[] array = new int[ss.length];
						
						for(int i=0;i<ss.length;i++){
							array[i]=Integer.parseInt(ss[i]) ;
						}
						
						f.set(obj, array);
						
					}else if(String[].class==cls){
						f.set(obj, ss);
					}else if(double[].class.getName().equals(type) || Double[].class.getName().equals(type)){
						
						double[] array = new double[ss.length];
						
						for(int i=0;i<ss.length;i++){
							array[i]=Double.parseDouble(ss[i]) ;
						}
						
						f.set(obj, array);
						
						
					}
					
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}






