package com.sopra.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proposition")
@DiscriminatorColumn(name = "PRO_TYPE", discriminatorType = DiscriminatorType.INTEGER)
public class Proposition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRO_ID")
	private Integer idProposition;

	@Column(name = "PRO_IS_CORRECT")
	private Boolean isCorrect;

	@Column(name = "PRO_NUMERO")
	private Character numero;
	
	@OneToMany(mappedBy="proposition")
	private List<Question> questions;

	public Integer getIdProposition() {
		return idProposition;
	}

	public void setIdProposition(Integer idProposition) {
		this.idProposition = idProposition;
	}

	public Boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public Character getNumero() {
		return numero;
	}

	public void setNumero(Character numero) {
		this.numero = numero;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Proposition(Integer idProposition, Boolean isCorrect, Character numero, List<Question> questions) {
		super();
		this.idProposition = idProposition;
		this.isCorrect = isCorrect;
		this.numero = numero;
		this.questions = questions;
	}
	
	

}
