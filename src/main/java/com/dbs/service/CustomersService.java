package com.dbs.service;

import java.util.List;

import com.dbs.model.Customers;

public interface CustomersService {
	
	List<Customers> get();
	Customers get(String cust_id);
	Customers update(Customers customers);//, String cust_id, String receiver_id, double amount);
	
}