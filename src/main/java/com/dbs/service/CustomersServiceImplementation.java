package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbs.model.Customers;
import com.dbs.repository.CustomersRepository;

@Service
public class CustomersServiceImplementation implements CustomersService {
	
	@Autowired
	private CustomersRepository customersRepo;

	@Transactional
	@Override
	public List<Customers> get() {
		return customersRepo.get();
	}

	@Transactional
	@Override
	public Customers get(String cust_id) {
		return customersRepo.get(cust_id);
	}

	@Transactional
	@Override
	public Customers update(Customers customers){//, String cust_id, String receiver_id, double amount) {
		return customersRepo.update(customers);//, cust_id, receiver_id, amount);
	}

}
