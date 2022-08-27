package com.dbs.repository;

import java.util.List;

import com.dbs.model.Customers;

public interface CustomersRepository {
	
	List<Customers> get();
	Customers get(String cust_id);
	Customers update(Customers customers);
	
}