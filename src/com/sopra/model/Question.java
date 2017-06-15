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
@Table(name="question")
@DiscriminatorColumn(name="QST_TYPE", discriminatorType=DiscriminatorType.INTEGER)
public class Question implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QST_ID")
	@NotBlank
	private Integer idQuestion;
	
	@Column(name="QST_INTITULE")
	@NotBlank
	private String intitule;
	
	@Column(name="QST_NUMERO")
	@NotBlank
	private Integer numero;

	public Integer getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(Integer idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	@OneToMany(mappedBy="question")
	private Proposition proposition;

}
