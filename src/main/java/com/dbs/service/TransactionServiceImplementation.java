package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbs.model.Transactions;
import com.dbs.repository.TransactionsRepository;

@Service
public class TransactionServiceImplementation implements TransactionsService {

	@Autowired
	private TransactionsRepository transactionsRepo;
	
	@Transactional
	@Override
	public List<Transactions> get() {
		return transactionsRepo.get();
	}

	@Transactional
	@Override
	public List<Transactions> get(String transaction_id) {
		return transactionsRepo.get(transaction_id);
	}

	@Transactional
	@Override
	public void transaction(Transactions transc) {
		transactionsRepo.transaction(transc);
		
	}

}
