package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dto.MessageDto;
import com.example.demo.model.MessageEntity;

@Component
public class MessageConverter1 {

	public List<MessageDto> convertList(List<MessageEntity> listeMessage) {
		List<MessageDto> listeMessageDetail = new ArrayList<>();
		for (MessageEntity message : listeMessage) {
			MessageDto dto = new MessageDto();
			dto.setId(message.getId_message());
			dto.setDescription(message.getDescription());
			dto.setId_famille(message.getFamille().getId());

			listeMessageDetail.add(dto);
		}
		return listeMessageDetail;
	}

	public static MessageDto convertMessage(MessageEntity entity) {
		MessageDto dto2 = new MessageDto();
		dto2.setId(entity.getId_message());
		dto2.setDescription(entity.getDescription());
		dto2.setId_famille(entity.getFamille().getId());

		return dto2;
	}

	public MessageEntity convertMessageDtoEntity(MessageDto dto) {
		MessageEntity entity = new MessageEntity(dto.getId(), dto.getDescription(), dto.getId_famille());

//		MessageEntity entity = new MessageEntity(dto.getId(), dto.getDescription(),dto.getId_famille(), dto.getLibelleFamille());
		return entity;
	}
}
