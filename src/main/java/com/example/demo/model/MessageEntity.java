package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class MessageEntity {
	@Id
	@Column(name = "id_message")
	private Integer id;
	@Column(name = "description")
	private String description;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_famille", updatable = false, insertable = false)
	private FamilleMessageEntity famille;
	@Column(name = "id_famille")
	private Integer id_famille;

	public MessageEntity() {
	}

	public MessageEntity(Integer idm, String d) {
		id = idm;
		description = d;
	}

	public MessageEntity(Integer idm, String d, Integer idf) {
		id = idm;
		description = d;
		id_famille = idf;

	}

	public int getId_message() {
		return id;
	}

	public void setId_message(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FamilleMessageEntity getFamille() {
		return famille;
	}

	public void setFamille(FamilleMessageEntity famille) {
		this.famille = famille;
	}

	public int getId_famille() {
		return id_famille;
	}

	public void setId_famille(Integer id_famille) {
		this.id_famille = id_famille;
	}

}
