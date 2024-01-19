package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Cart;
import com.ecommerce.entity.Product;
import com.ecommerce.service.CartService;
import com.ecommerce.service.ProductService;

@RestController

@RequestMapping("/ecom")
public class ProductController {

	@Autowired
	private ProductService productServ;
	
	@Autowired
	private CartService cartServ;
	
	@PostMapping("/saveprod")
	public Product saveProduct(@RequestBody Product product) {
		return productServ.saveProduct(product);
	}
	
	@PostMapping("/saveCart")
    public Cart saveCart(@RequestBody Cart ca) {
		return cartServ.saveCartDetails(ca);
		 
	}
		
	
	
}
