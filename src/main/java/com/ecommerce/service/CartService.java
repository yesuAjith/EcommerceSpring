package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Cart;
import com.ecommerce.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepo;
	
	public Cart saveCartDetails(Cart cart) {
		Cart car = new Cart();
		car.setProduct(cart.getProduct());
		car.setUser(cart.getUser());
		return cartRepo.save(car);
	}

}
