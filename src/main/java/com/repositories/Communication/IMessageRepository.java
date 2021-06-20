package com.repositories.Communication;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.communication.Message;

public interface IMessageRepository extends JpaRepository<Message, Long>{

}
