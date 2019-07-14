package com.dao;

import java.util.List;

import com.model.Users;

public interface IUserDao {
	public void addUser(Users user);
	
	public Users searchUser(String loginname);
	public Users findUser(String userName);
	
	public List  findUserName();
	
	public void upUserIMg(String userName,String path);
	public void UpdateStatus(String ver_email);
	public void UpdateStatus2(String ver_username);
	
	public void Update(Users user);
	
	public void SignOut(String username);
	 
	public void PasswordRecover(String useremail,String npassword);
	
	String searchUserIdByName(String name);
}
