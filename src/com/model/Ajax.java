package com.model;

import java.lang.reflect.Field;

public class Ajax {
	public static void main(String[] args) {
		String str = "<div class=\"testimonial-m\" style=\"height:260.8px\">\r\n" + 
				"	          <div class=\"testimonial-img\"> <img src=\"/imgs/${com.img }\" alt=\"\" style=\"width: 205px;height: 205px\"/> </div>\r\n" + 
				"	          <div class=\"testimonial-content\">\r\n" + 
				"	            <div class=\"testimonial-heading\">\r\n" + 
				"	              <h5>${com.name }</h5>\r\n" + 
				"	              <span class=\"client-designation\">${com.email }</span> </div>\r\n" + 
				"	            <p>${com.text }</p>\r\n" + 
				"	          </div>\r\n" + 
				"        	</div>";
		
		str = str.replaceAll("\"", "'");
		/*str = str.replaceAll("\r\n", "");*/
		System.out.println(str);
		
		String str2 = "<div class='testimonial-m' style='height:260.8px'>" + 
				"	          <div class='testimonial-img'> <img src='/imgs/${com.img }' alt='' style='width: 205px;height: 205px'/> </div>" + 
				"	          <div class='testimonial-content'>" + 
				"	            <div class='testimonial-heading'>" + 
				"	              <h5>${com.name }</h5>" + 
				"	              <span class='client-designation'>${com.email }</span> </div>" + 
				"	            <p>${com.text }</p>" + 
				"	          </div>" + 
				"        	</div>";
	}
}
