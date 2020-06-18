package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dto.FamilleMessageDto;
import com.example.demo.model.FamilleMessageEntity;

@Component
public class FamilleMessageConverter {

	public List<FamilleMessageDto> convertList(List<FamilleMessageEntity> listeFamille) {
		List<FamilleMessageDto> listeMessageDetail = new ArrayList<>();
		for (FamilleMessageEntity famille : listeFamille) {
			FamilleMessageDto dto = new FamilleMessageDto();
			dto.setId(famille.getId());
			dto.setLibelle(famille.getLibelle());
			listeMessageDetail.add(dto);
		}
		return listeMessageDetail;
	}

	public FamilleMessageDto convertFamille(FamilleMessageEntity entity) {
		FamilleMessageDto dto2 = new FamilleMessageDto();
		dto2.setId(entity.getId());
		dto2.setLibelle(entity.getLibelle());

		return dto2;
	}

	public FamilleMessageEntity convertFamilleDtoEntity(FamilleMessageDto dto) {
		FamilleMessageEntity entity = new FamilleMessageEntity(dto.getId(), dto.getLibelle());
		return entity;
	}
}