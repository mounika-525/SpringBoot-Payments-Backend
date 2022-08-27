package com.dbs.service;

import java.util.List;

import com.dbs.model.Message;

public interface MessageService {
	
	List<Message> get();
	Message get(String message_code);

}