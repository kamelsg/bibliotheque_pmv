package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dto.MessageDetailDto;
import com.example.demo.model.MessageEntity;

@Component
public class MessageDetailConverter {
	public List<MessageDetailDto> convertList(List<MessageEntity> listeMessage) {
		List<MessageDetailDto> listeMessageDetail = new ArrayList<>();
		for (MessageEntity message : listeMessage) {
			MessageDetailDto dto = new MessageDetailDto();
			dto.setLibelleFamille(message.getDescription());
			dto.setDescriptionMessage(message.getFamille().getLibelle());
			listeMessageDetail.add(dto);
		}
		return listeMessageDetail;
	}

}
