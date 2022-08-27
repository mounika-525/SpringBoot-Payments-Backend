package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.model.Customers;
import com.dbs.service.CustomersService;

@CrossOrigin("*") 
@RestController
@RequestMapping("/customersapi")
public class CustomersController {
	
	@Autowired
	private CustomersService customersService;
	
	@GetMapping("/customers")
	public List<Customers> get() {
		return customersService.get();
	}
	
	@PutMapping("/customersupdate")
	public Customers update(@RequestBody Customers customers) {
		return customersService.update(customers);//, cust_id, receiver_id, amount);
	}
	
	@GetMapping("/customers/{cust_id}")
	public Customers get(@PathVariable String cust_id) {
		
			Customers customer = customersService.get(cust_id);
			
			return customersService.get(cust_id);
		
	}

}
