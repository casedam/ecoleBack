package com.sopra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "candidat")
public class Candidat extends Personne {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAN_CLE")

	private String Cle;

	@OneToOne
	private Test test;

	public Test getTest() {
		return test;
	}

	public String getCle() {
		return Cle;
	}

	public void setCle(String cle) {
		Cle = cle;
	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public void setId(int idPersonne) {
		super.setId(idPersonne);
	}

	@Override
	public String getNom() {
		return super.getNom();
	}

	@Override
	public void setNom(String nom) {
		super.setNom(nom);
	}

	@Override
	public String getPrenom() {
		return super.getPrenom();
	}

	@Override
	public void setPrenom(String prenom) {
		super.setPrenom(prenom);
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Candidat(int idPersonne, String nom, String prenom, String cle, Test test) {
		super(idPersonne, nom, prenom);
		Cle = cle;
		this.test = test;
	}

}
