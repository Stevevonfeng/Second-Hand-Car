package com.service;

import java.util.List;

import com.dao.IUserDao;
import com.dao.UserDaoImpl;
import com.model.Users;

public class UserServiceImpl implements IUserService {
    private  IUserDao  userDao = new UserDaoImpl();
    @Override
    public void addUser(Users user) {
    	
    	  userDao.addUser(user);
    	
    }
    
    public Users searchUser(String loginname){
    	return userDao.searchUser(loginname);
    }
    
    public List  findUserName(){
    	return userDao.findUserName();
    }
    
    public void UpdateStatus(String ver_email){
    	userDao.UpdateStatus(ver_email);
    	
    }
    
    public void UpdateStatus2(String ver_username){
    	userDao.UpdateStatus2(ver_username);
    }
    
    public void Update(Users user){
    	userDao.Update(user);
    }
    
    public void SignOut(String username){
    	userDao.SignOut(username);
    	
    }
    
    public void PasswordRecover(String useremail,String npassword){
    	
    	userDao.PasswordRecover(useremail, npassword);
    }

	public void upUserIMg(String userName, String path) {
		userDao.upUserIMg(userName, path);
		
	}
}
