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

import com.example.demo.converter.FamilleMessageConverter;
import com.example.demo.dto.FamilleMessageDto;
import com.example.demo.service.FamilleMessageService;

@RestController
public class FamilleMessageController {
	@Autowired
	private FamilleMessageConverter familleMessageConverter;
	@Autowired
	private FamilleMessageService familleMessageService;

	@GetMapping(value = "/familles")
	public List<FamilleMessageDto> listeFamilles() {
		familleMessageConverter = new FamilleMessageConverter();
		return familleMessageConverter.convertList(familleMessageService.findAll());
	}

	@GetMapping(value = "/famille/{idf}")
	public FamilleMessageDto afficherUneFamille(@PathVariable Integer idf) {

		FamilleMessageDto dto = familleMessageConverter.convertFamille(familleMessageService.findById(idf));
		return dto;
	}

	@PostMapping(value = "/famille")
	public FamilleMessageDto ajouterFamille(@RequestBody FamilleMessageDto entity) {
		familleMessageService.save(familleMessageConverter.convertFamilleDtoEntity(entity));
		return entity;
	}

	@PutMapping(value = "/famille")
	public FamilleMessageDto updateFamille(@RequestBody FamilleMessageDto newEntity) {
		familleMessageService.updateFamille(familleMessageConverter.convertFamilleDtoEntity(newEntity));
		return newEntity;

	}

	@DeleteMapping(value = "/famille/{idf}")
	public void removeMessage(@PathVariable int idf) {
		familleMessageService.deleteById(idf);

	}
}
