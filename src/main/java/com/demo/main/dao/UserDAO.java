package com.demo.main.dao;

import java.util.List;

import com.demo.main.domain.User;

public interface UserDAO {
	public void addUser(User user);
	public List<User> listUser();
	
}
