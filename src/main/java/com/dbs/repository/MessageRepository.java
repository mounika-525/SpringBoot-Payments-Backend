package com.dbs.repository;

import java.util.List;

import com.dbs.model.Message;

public interface MessageRepository {
	
	List<Message> get();
	Message get(String message_code);

}