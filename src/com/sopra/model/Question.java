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
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="question")
@DiscriminatorColumn(name="QST_TYPE", discriminatorType=DiscriminatorType.INTEGER)
public class Question implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QST_ID")
	private Integer idQuestion;
	
	@Column(name="QST_INTITULE")
	private String intitule;
	
	@Column(name="QST_NUMERO")
	private Integer numero;
	
	@OneToMany(mappedBy="question")
	private List<Proposition> propositions;
	
	@OneToOne
	private Questionnaire questionnaire;

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

	public List<Proposition> getPropositions() {
		return propositions;
	}

	public void setPropositions(List<Proposition> propositions) {
		this.propositions = propositions;
	}

	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}

	public Question(Integer idQuestion, String intitule, Integer numero, List<Proposition> propositions,
			Questionnaire questionnaire) {
		super();
		this.idQuestion = idQuestion;
		this.intitule = intitule;
		this.numero = numero;
		this.propositions = propositions;
		this.questionnaire = questionnaire;
	}
	
	

}
