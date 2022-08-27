package com.dbs.repository;

import java.util.List;

import com.dbs.model.Transactions;

public interface TransactionsRepository {
	
	List<Transactions> get();
	List<Transactions> get(String customer_id);
	void transaction(Transactions transc);

}