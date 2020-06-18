package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FamilleMessageEntity;
import com.example.demo.repo.FamilleMessageRepository;

@Service
public class FamilleMessageService {
	@Autowired
	private FamilleMessageRepository familleMessageRepository;

	public List<FamilleMessageEntity> findAll() {
		List<FamilleMessageEntity> result = new ArrayList<>();
		for (FamilleMessageEntity entity : familleMessageRepository.findAll()) {
			result.add(entity);
		}
		return result;
	}

	public FamilleMessageEntity findById(Integer idf) {
		FamilleMessageEntity famille = familleMessageRepository.findById(idf).orElse(null);

		return famille;

	}

	public FamilleMessageEntity save(FamilleMessageEntity entity) {
		familleMessageRepository.save(entity);
		return entity;

	}

	public void deleteById(Integer idf) {

		familleMessageRepository.deleteById(idf);

		/*
		 * FamilleMessageEntity f = findById(idf); if (f != null) { lf.remove(f); }
		 */
	}

	public FamilleMessageEntity updateFamille(FamilleMessageEntity newEntity) {
		familleMessageRepository.save(newEntity);
		return newEntity;
	}
}