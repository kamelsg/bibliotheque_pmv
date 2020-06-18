package com.example.demo.dto;

//@Entity
//@Table(name = "famille_message")
public class FamilleMessageDto {
//	@Id
//	@Column(name = "id_famille")
	private Integer id;
//	@Column(name = "libelle")
	private String libelle;

	public FamilleMessageDto(Integer idf, String lib) {
		id = idf;
		libelle = lib;
	}

	public FamilleMessageDto() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
