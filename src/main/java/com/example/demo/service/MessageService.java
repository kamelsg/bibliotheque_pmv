package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MessageEntity;
import com.example.demo.repo.MessageRepository;

@Service
public class MessageService {
	@Autowired
	private MessageRepository messageRepository;

	public List<MessageEntity> findAll() {
		List<MessageEntity> result = new ArrayList<>();
		for (MessageEntity entity : messageRepository.findAll()) {
			result.add(entity);
		}
		return result;
	}

	public MessageEntity findById(Integer idm) {
		Optional<MessageEntity> message = messageRepository.findById(idm);
		if (message != null) {
			return message.orElse(null);
		}
		return null;

	}

	public MessageEntity save(MessageEntity entity) {
		messageRepository.save(entity);
		return entity;
	}

	public void deleteById(Integer idm) {
		Optional<MessageEntity> message = messageRepository.findById(idm);
		if (message.isPresent()) {
			messageRepository.deleteById(idm);
			;
		}

	}

	public MessageEntity updateMessage(MessageEntity newEntity) {
		messageRepository.save(newEntity);
		return newEntity;
	}

}
