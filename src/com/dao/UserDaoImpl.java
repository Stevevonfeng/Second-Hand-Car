package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Users;
import com.service.Conversion;
import com.service.JdbcUtil;

public class UserDaoImpl implements  IUserDao{
	JdbcUtil jdbc = new JdbcUtil();
	
	@Override
	public void addUser(Users user){
		
 String sql = "insert into tb_user(userid,username, email, userpassword,status) "
					+ "values(userse_seq.nextval,?,?,?,'online')";

	 List<Object> params = new ArrayList<Object>();
		
		params.add(user.getUsername());
		params.add(user.getEmail());
		params.add(user.getUserpassword());
		
		 jdbc .updatePreparedStatement(sql, params);
		
	}
	
	 public Users searchUser(String loginname){
	    	
		 String sql = "select userid,username,email,userpassword,phone,birth,adress,country,"
					+ "province from tb_user where username='" + loginname + "'or email='"+ loginname+"'";
							
							List<Users> list = jdbc.queryPreparedStatement(sql, null, Users.class); 
				 
							 Users user = list.get(0);
							 
							 return user;
							 
	    }
	
	 public void UpdateStatus(String ver_email){
		 
		 String sql="update tb_user set status='online' where email='"+ver_email+"'";
		 jdbc.updatePreparedStatement(sql, null);
		 
	 }
	 public void UpdateStatus2(String ver_username){
		 String sql="update tb_user set status='online' where username='"+ver_username+"'";
		 jdbc.updatePreparedStatement(sql, null);
	 }
	
	 public void Update(Users user){	  
     String sql = "update tb_user set email=?,userpassword=?,phone=?,"
     		+ "birth=?,adress=?,country=?,province=? where username=?";
     
     List<Object> params = new ArrayList<Object>();
  
      params.add(user.getEmail());
      params.add(user.getUserpassword());
      params.add(user.getPhone());
      params.add(user.getBirth());
      params.add(user.getAdress());
      params.add(user.getCountry());
      params.add(user.getProvince());
      params.add(user.getUsername());

     jdbc.updatePreparedStatement(sql, params);
	 }
	 
	 public void SignOut(String username){
		 
			String sql="update tb_user set status='offline' where username='"+username+"'";
			 jdbc.updatePreparedStatement(sql, null);
	 }
	 
	 public void PasswordRecover(String useremail,String npassword){
		 
		 String sql = "update tb_user set userpassword='"+npassword+"' where email='"+useremail+"'";
		 jdbc.updatePreparedStatement(sql, null);
	 }


	@Override
	public String searchUserIdByName(String name) {
		return null;
	}


	public Users findUser(String userName) {
		 String sql = "select image from tb_user where username='"+userName+"'";
			
			List<Users> list = jdbc.queryPreparedStatement(sql, null, Users.class); 
			if(list==null){
				return null;
			}
			 Users user = list.get(0);
			 
			 return user;
	}

	
	public List  findUserName(){
		
		 String sql = "select * from tb_user";
		 List<Users> list = jdbc.queryPreparedStatement(sql, null, Users.class); 
		 return list;
		 
	}
	
	public void upUserIMg(String userName, String path) {
		String sql = "update tb_user set image='"+path+"' where userName='"+userName+"'";
		jdbc.updatePreparedStatement(sql, null);
	}
	


	

}
