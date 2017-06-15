package com.sopra.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="questionnaire")
public class Questionnaire implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QRE_ID")
	private Integer idQuestionnaire;
	
	@Column(name="QRE_DUREE")
	private Integer duree;
	
	@Column(name="QRE_INTITULE")
	private String intitule;
	
	@OneToOne
	private Matiere matiere;
	
	@OneToMany(mappedBy="questionnaires")
	private List<Test> tests;
	
	@OneToMany(mappedBy="questionnaire")
	private List<Question> questions;

	
	
	
	
	
	
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

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
	

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Questionnaire(Integer idQuestionnaire, Integer duree, String intitule, Matiere matiere, List<Test> tests,
			List<Question> questions) {
		super();
		this.idQuestionnaire = idQuestionnaire;
		this.duree = duree;
		this.intitule = intitule;
		this.matiere = matiere;
		this.tests = tests;
		this.questions = questions;
	}

	
	


}
