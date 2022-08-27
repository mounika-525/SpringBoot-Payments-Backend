package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbs.model.Login;
import com.dbs.repository.LoginRepository;

@Service
public class LoginServiceImplementation implements LoginService {

	@Autowired
	private LoginRepository loginRepo;
	
	@Transactional
	@Override
	public List<Login> get() {
		return loginRepo.get();
	}

	@Transactional
	@Override
	public Login get(String uname) {
		return loginRepo.get(uname);
	}

}
