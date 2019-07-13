package com.service;

import com.model.Users;

public interface IUserService {
	public void addUser(Users user);
	
	public Users searchUser(String loginname);
	
	public void UpdateStatus(String ver_email);
	public void UpdateStatus2(String ver_username);
	
	public void Update(Users user);
	

	public void SignOut(String username);
	public void PasswordRecover(String useremail,String npassword);
}
