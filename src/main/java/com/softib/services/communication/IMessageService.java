package com.softib.services.communication;

import java.util.List;

import com.softib.entities.communication.Mail;
import com.softib.entities.communication.Message;

public interface IMessageService {
	public List<Message> getAllMessages();

	public Message createMessage(Message message);

	public Message getMessageById(long id);

	public Message updateMessage(long id, Message Message);

	public void deleteMessage(long id);
	
	//public void sendMail(Mail message);
}
