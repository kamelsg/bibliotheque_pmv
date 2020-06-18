package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.converter.MessageConverter1;
import com.example.demo.dto.MessageDto;
import com.example.demo.service.MessageService;

@RestController
public class MessageController {
	@Autowired
	private MessageConverter1 messageConverter;

	@Autowired
	private MessageService messageService;
	// private Connexionbdd co = new Connexionbdd();

	@GetMapping(value = "/messages")
	public List<MessageDto> listeMessages() {
		messageConverter = new MessageConverter1();
		return messageConverter.convertList(messageService.findAll());
	}

	@GetMapping(value = "/message/{idm}")
	public MessageDto afficherUnMessage(@PathVariable Integer idm) {
		return MessageConverter1.convertMessage(messageService.findById(idm));
	}

	@PostMapping(value = "/message")
	public MessageDto ajouterMessage(@RequestBody MessageDto entity) {
		messageService.save(messageConverter.convertMessageDtoEntity(entity));
		return entity;
	}

	@PutMapping(value = "/message")
	public MessageDto updateMessage(@RequestBody MessageDto newEntity) {
		messageService.updateMessage(messageConverter.convertMessageDtoEntity(newEntity));
		return newEntity;

	}

	@DeleteMapping(value = "/message/{idm}")
	public void removeMessage(@PathVariable Integer idm) {
		messageService.deleteById(idm);

	}

}