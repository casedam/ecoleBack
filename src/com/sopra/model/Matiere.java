package com.sopra.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;



	

@Entity
@Table(name="matiere")

public abstract class Matiere implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public Matiere() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MAT_ID")
	private int idMatiere;
	
	@Column(name="MAT_NOM")
	@NotBlank
	private String nom;

	public int getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Matiere(int idMatiere, String nom) {
		super();
		this.idMatiere = idMatiere;
		this.nom = nom;
	}
	
	
	@OneToMany(mappedBy="questionnaire")
	private List<Questionnaire> questionnaires;

	public List<Questionnaire> getQuestionnaires() {
		return questionnaires;
	}

	public void setQuestionnaires(List<Questionnaire> questionnaires) {
		this.questionnaires = questionnaires;
	}
	
	
}
