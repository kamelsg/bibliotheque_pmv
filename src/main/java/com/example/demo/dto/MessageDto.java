package com.example.demo.dto;

//@Entity
//@Table(name = "message")
public class MessageDto {
//	@Id
//	@Column(name="id_message")
	private Integer id;
//	@Column(name="description")
	private String description;
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "id_famille", updatable=false, insertable=false)
//	@Column(name="id_famille")
	private Integer idFamille;

	public MessageDto() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId_famille() {
		return idFamille;
	}

	public void setId_famille(Integer idFamille) {
		this.idFamille = idFamille;
	}

}
