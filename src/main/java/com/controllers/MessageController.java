package com.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.communication.Message;
import com.exceptions.RessourceNotFoundException;
import com.repositories.Communication.IMessageRepository;

import antlr.collections.List;

@RestController
@RequestMapping("/softib/com/")
//@CrossOrigin(origins = "http://localhost:4200")
public class MessageController {
	@Autowired
	private IMessageRepository MessageRepository;
	
	@GetMapping("/Messages")
	public List<Message> getAllMessages(){
		return MessageRepository.findAll();
	}
	
	@PostMapping("/Messages")
	public Message createMessage(@RequestBody Message Message) {
		return MessageRepository.save(Message);
	}
	
	@GetMapping("/Messages/{id}")
	public ResponseEntity<Message> getMessageById(@PathVariable long id) {
		Message Message=MessageRepository.findById(id).orElseThrow( () ->new RessourceNotFoundException("Message not found with id "+ id));
		return ResponseEntity.ok(Message);
	}
	
	@PutMapping("/Messages/{id}")
	public ResponseEntity<Message> updateMessage(@PathVariable long id, @RequestBody Message MessageWithUpdates){
		
		Message Message=MessageRepository.findById(id).orElseThrow( () ->new RessourceNotFoundException("Message not found with id "+ id));
		Message.setMessage(MessageWithUpdates.getMessage());
		// à compléter

		Message updatedMessage = MessageRepository.save(Message);	
		return ResponseEntity.ok(updatedMessage);
	}
	
	@DeleteMapping("/Messages/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteMessage(@PathVariable long id){
		Message Message=MessageRepository.findById(id).orElseThrow( () ->new RessourceNotFoundException("Message not found with id "+ id));
		MessageRepository.delete(Message);
		
		Map<String,Boolean> response=new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
