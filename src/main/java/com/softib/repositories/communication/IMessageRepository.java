package com.softib.repositories.communication;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softib.entities.communication.Message;

public interface IMessageRepository extends JpaRepository<Message, Long> {

}
