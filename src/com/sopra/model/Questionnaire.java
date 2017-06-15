package com.sopra.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="questionnaire")
@DiscriminatorColumn(name="QRE_TYPE", discriminatorType=DiscriminatorType.INTEGER)
public class Questionnaire implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QRE_ID")
	@NotBlank
	private Integer idQuestionnaire;
	
	@Column(name="QRE_DUREE")
	@NotBlank
	private Integer duree;

	public Integer getIdQuestionnaire() {
		return idQuestionnaire;
	}

	public void setIdQuestionnaire(Integer idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	
	@OneToMany(mappedBy="questionnaire")
	private Matiere matiere;

}
