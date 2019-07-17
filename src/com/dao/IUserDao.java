package com.dao;

import java.util.List;

import com.model.Users;

public interface IUserDao {
	public void addUser(Users user);
	
	public Users searchUser(String loginname);
	
	public Users searchUser2(String loginemail);
	
	public Users searchUser3(String validatecode);
	
	
	public Users findUser(String userName);
	
	public List  findUserEmail();
	
	public void upUserIMg(String userName,String path);
	public void UpdateStatus(String ver_email);
	public void UpdateStatus2(String ver_username);
	
	public void UpValidate(String loginemail,String ver_validatecode);

	public void Update(Users user);
	
	public void SignOut(String username);
	 
	public void PasswordRecover(String useremail,String npassword);
	
	String searchUserIdByName(String name);
}
