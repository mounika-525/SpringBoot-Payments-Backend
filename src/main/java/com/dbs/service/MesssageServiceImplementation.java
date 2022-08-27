package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbs.model.Message;
import com.dbs.repository.MessageRepository;

@Service
public class MesssageServiceImplementation implements MessageService {

	@Autowired
	private MessageRepository messageRepo;
	
	@Transactional
	@Override
	public List<Message> get() {
		return messageRepo.get();
	}

	@Transactional
	@Override
	public Message get(String message_code) {
		return messageRepo.get(message_code);
	}

}
