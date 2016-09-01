package com.yu.activemq.sender.service;

public interface MsgSender {

	void send(String topicName,final String message);
}
