package com.example.demo.dto;

public class MessageDetailDto {
	private String libelleFamille;
	private String descriptionMessage;

	public MessageDetailDto() {
	}

	public String getLibelleFamille() {
		return libelleFamille;
	}

	public void setLibelleFamille(String libelleFamille) {
		this.libelleFamille = libelleFamille;
	}

	public String getDescriptionMessage() {
		return descriptionMessage;
	}

	public void setDescriptionMessage(String descriptionMessage) {
		this.descriptionMessage = descriptionMessage;
	}

	public MessageDetailDto(String libelleFamille, String descriptionMessage) {
		super();
		this.libelleFamille = libelleFamille;
		this.descriptionMessage = descriptionMessage;
	}
}
