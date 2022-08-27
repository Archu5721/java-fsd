package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public String storeUser(User user) {
		
		 if(userDao.storeUserDetails(user)>0){
			return "Product details stored successfully";
		}else {
			return "Product details didn't store";
		}
	}
	public String updateUser(User user) {
		if(userDao.updateUser(user)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	public String searchuserById(int uid) {
		User u = userDao.searchuserById(uid);
		if(u==null) {
			return "Record not present";
		}else {
			return u.toString();
		}
	}
	
	public List<User> getAlluser() {
		return userDao.getAlluser();
	}
}
