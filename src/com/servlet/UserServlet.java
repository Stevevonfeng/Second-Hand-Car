package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Users;
import com.service.Conversion;
import com.service.IUserService;
import com.service.JdbcUtil;
import com.service.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/User")
public class UserServlet extends BaseServlet {
	
	 IUserService userService = new UserServiceImpl(); 
	//Sign Up
	public void adduser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    
         Users user = new  Users();
		 
		 Conversion.req_obj(user, request);
 
		 userService.addUser(user);
		 
		   String signname = user.getUsername();	 
		   String userpassword = user.getUserpassword();
		   String repassword = request.getParameter("repassword");
		   
            List listname = userService.findUserName();
        
            for(int i=0;i<listname.size();i++){
            	String existname = (String) listname.get(i);
            	if(signname.equals(existname)){
            		
            		 request.getSession().removeAttribute("user");	
            	}else{
            		
            		 if(repassword.equals(userpassword)){
         				 //servlet中不能直接用session；要用request的方法获取session 
         				  request.getSession().setAttribute("user", user);
         		      }
            	}
     
            }
            request.getRequestDispatcher("profile-settings.jsp").forward(request, response);
          	 
			
		
	}
	//Login
	public void searchuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 
		String loginname = request.getParameter("loginname");
		
		String login = loginname.substring(loginname.length() - 7);

		String loginpassword = request.getParameter("loginpassword");
		 
	 
		 Users user = userService.searchUser(loginname);
		 
			 String ver_username = user.getUsername();
			 String ver_email = user.getEmail();
			 String ver_password = user.getUserpassword();
			 
			 if (login.equals("@qq.com")) {

					if (loginname.equals(ver_email) && loginpassword.equals(ver_password)) {
						
						
						userService.UpdateStatus(ver_email);
						
						 //servlet中不能直接用session；要用request的方法获取session 
							request.getSession().setAttribute("user", user);
							
						request.getRequestDispatcher("profile-settings.jsp").forward(request, response);
					}
					
				}else{

					if (loginname.equals(ver_username) && loginpassword.equals(ver_password)) {
						 
						userService.UpdateStatus2(ver_username);
						 //servlet中不能直接用session；要用request的方法获取session 
							request.getSession().setAttribute("user", user);
							
						request.getRequestDispatcher("profile-settings.jsp").forward(request, response);
					}
				}			
			 
	}
	
	// ToUpdate-searchUser
	public void  ToUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String username = request.getParameter("username");
		
		 Users user = userService.searchUser(username);
		 
		 request.setAttribute("user", user);	
	
		request.getRequestDispatcher("Update-profile-settings.jsp").forward(request, response);	
		
	}
	
	//Update
	public void Update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 传输中文
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		 Users user = new  Users();
		 Conversion.req_obj(user, request);	
		 
		 userService.Update(user);
		 
		 String userpassword = request.getParameter("userpassword");
	     String cpassword = request.getParameter("c-password");
	     
	     if(cpassword.equals(userpassword)){
	    	 request.getRequestDispatcher("profile-settings.jsp").forward(request, response);
			   
	     }
	}
		

	
	//SignOut
	public void SignOut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// 传输中文
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		
		 userService.SignOut(username);
		 
		 request.getSession().removeAttribute("user");
		 
			Object obj = request.getSession().getAttribute("user");
			
		 if(obj==null){
			 request.getRequestDispatcher("profile-settings.jsp").forward(request, response);
		 }
	}
	
	//PasswordRecover
	public void PasswordRecover(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String useremail = request.getParameter("useremail");
		
		String npassword = request.getParameter("npassword");
		
		userService.PasswordRecover(useremail, npassword);
		
		 request.getRequestDispatcher("profile-settings.jsp").forward(request, response);
	}

}
