package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "famille_message")
public class FamilleMessageEntity {
	@Id
	@Column(name = "id_famille")
	private Integer id;

	@Column(name = "libelle")
	private String libelle;

	public FamilleMessageEntity(Integer idf, String lib) {
		id = idf;
		libelle = lib;
	}

	public FamilleMessageEntity() {
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
