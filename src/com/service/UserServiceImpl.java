package com.service;

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
}
