package com.demo.main.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.main.domain.User;
import com.demo.main.service.UserService;

@Controller
public class UserController {
	private Log log = LogFactory.getLog(UserController.class);
	@Autowired
	UserService UserService;

	@RequestMapping("/")
	public String UserList(@ModelAttribute("user") User user,Map<String, Object> map) {

		
		
		log.info("-------------------------User Controller -------------------------------------");
		ArrayList<User>	userList=(ArrayList<User>) UserService.listUser();
		map.put("userList", userList);
		
		return "users";
	}

	@RequestMapping("/addUser")
	public String addUser( @Valid  @ModelAttribute("user") User user){

		try {
			UserService.addUser(user);
			log.info("-------------------------Added User-------------------------------------");

		} catch (Exception e) {
			e.printStackTrace();
			log.debug("-------------------------ERROR ON ADDING User-------------------------------------");

		}


		return "redirect:/";
	}

}
