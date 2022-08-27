package com.dbs.repository;

import java.util.List;

import com.dbs.model.Login;

public interface LoginRepository {

	List<Login> get();
	Login get(String uname);
}
