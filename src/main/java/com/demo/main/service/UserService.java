package com.demo.main.service;

import java.util.List;

import com.demo.main.domain.*;

public interface UserService {
	
	public void addUser(User user);
	public List<User> listUser();
	
}
