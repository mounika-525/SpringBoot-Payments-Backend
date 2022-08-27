package com.dbs.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dbs.model.Customers;

@Repository
public class CustomersRepositoryImplementation implements CustomersRepository {

	@Autowired
	private EntityManager entityMgnr;

	@Override
	public List<Customers> get() {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Query<Customers> query = currentSession.createQuery("from Customers", Customers.class);
		List<Customers> list = query.getResultList();
		return list;
	}

	@Override
	public Customers get(String cust_id) {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Customers customer = currentSession.get(Customers.class, cust_id);
		
		return customer;
		
	}

	@Override
	public Customers update(Customers customers) {
		Session currentSession = entityMgnr.unwrap(Session.class);
		currentSession.update(customers);
		return customers;
	}

}
