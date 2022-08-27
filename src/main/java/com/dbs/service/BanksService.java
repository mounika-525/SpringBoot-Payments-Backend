package com.dbs.service;

import java.util.List;

import com.dbs.model.Banks;

public interface BanksService {
	
	List<Banks> get();
	Banks get(String bic);

}