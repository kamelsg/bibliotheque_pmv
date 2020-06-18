package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.converter.MessageDetailConverter;
import com.example.demo.dto.MessageDetailDto;
import com.example.demo.service.MessageService;

@RestController
public class MessageDetailController {
	private MessageDetailConverter messageDetailConverter;

	@Autowired
	private MessageService messageService;

	@GetMapping(value = "/messagesdetail")
	public List<MessageDetailDto> getListeMessage() {
		messageDetailConverter = new MessageDetailConverter();
		return messageDetailConverter.convertList(messageService.findAll());
	}

}
