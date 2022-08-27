package com.dbs.service;

import java.util.List;

import com.dbs.model.Login;

public interface LoginService {
	
	List<Login> get();
	Login get(String uname);

}
