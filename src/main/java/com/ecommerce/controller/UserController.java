package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.User;
import com.ecommerce.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("ecom/user")
public class UserController {

	@Autowired
	private UserService userServ;   
	
	@PostMapping("/sendUser")
	public User sendUser(@RequestBody @Valid User us) {
		return userServ.saveUserDetails(us);  
	}

}
