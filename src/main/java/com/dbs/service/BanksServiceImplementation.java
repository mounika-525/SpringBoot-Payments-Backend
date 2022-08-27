package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbs.model.Banks;
import com.dbs.repository.BanksRepository;

@Service
public class BanksServiceImplementation implements BanksService {
	
	@Autowired
	private BanksRepository bankRepo;

	@Transactional
	@Override
	public List<Banks> get() {
		return bankRepo.get();
	}

	@Transactional
	@Override
	public Banks get(String bic) {
		return bankRepo.get(bic);
	}

}
