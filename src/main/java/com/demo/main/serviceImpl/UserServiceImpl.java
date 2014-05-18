package com.demo.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.main.dao.UserDAO;
import com.demo.main.domain.User;
import com.demo.main.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userdao;

	@Transactional
	public void addUser(User user) {

		userdao.addUser(user);
	}

	@Transactional
	public List<User> listUser() {

		return userdao.listUser();
	}

}
