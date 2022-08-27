package com.dbs.service;

import java.util.List;

import com.dbs.model.Transactions;

public interface TransactionsService {
	
	List<Transactions> get();
	List<Transactions> get(String customer_id);
	void transaction(Transactions transc);

}