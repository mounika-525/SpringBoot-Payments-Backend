package com.dbs.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dbs.model.Login;

@Repository
public class LoginRepositoryImplementation implements LoginRepository {

	@Autowired
	private EntityManager entityMgnr;
	
	@Override
	public List<Login> get() {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Query<Login> query = currentSession.createQuery("from Login", Login.class);
		List<Login> list = query.getResultList();
		return list;
	}

	@Override
	public Login get(String uname) {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Login login = currentSession.get(Login.class, uname);
		return login;
	}

}
