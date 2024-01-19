package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.User;
import com.ecommerce.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepo;
	
	public User saveUserDetails(User user) {
		return userRepo.save(user);
	}

}
