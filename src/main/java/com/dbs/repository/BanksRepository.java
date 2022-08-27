package com.dbs.repository;

import java.util.List;

import com.dbs.model.Banks;

public interface BanksRepository {
	
	List<Banks> get();
	Banks get(String bic);

}