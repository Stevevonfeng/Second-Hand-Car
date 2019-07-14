package com.service;

import java.util.List;

import com.model.Users;

public interface IUserService {
	public boolean addUser(Users user);
	
	public Users searchUser(String loginname);
	
	public List  findUserName();
	
	public void UpdateStatus(String ver_email);
	public void UpdateStatus2(String ver_username);
	
	public void Update(Users user);
	

	public void SignOut(String username);
	public void PasswordRecover(String useremail,String npassword);

	public void upUserIMg(String userName,String path);
}
