package com.dbs.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dbs.model.Message;

@Repository
public class MessageRepositoryImplementation implements MessageRepository {

	@Autowired
	private EntityManager entityMgnr;

	@Override
	public List<Message> get() {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Query<Message> query = currentSession.createQuery("from Message", Message.class);
		List<Message> list = query.getResultList();
		return list;
	}

	@Override
	public Message get(String message_code) {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Message msg = currentSession.get(Message.class, message_code);
		return msg;
	}

}
