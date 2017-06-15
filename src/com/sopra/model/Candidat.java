package com.sopra.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Candidat")
public class Candidat extends Personne {
	private static final long serialVersionUID = 1L;

	
	/**
	 * Attributs
	 */
	@OneToOne(mappedBy="candidat")
	private Test test;
	
	@Column(name="CAN_CLE")
	private String cleAcces;
	
	
	
	
	
	

	/**
	 * Constructeurs
	 */
	
	public Candidat(int idPersonne, String nom, String prenom) {
		super(idPersonne, nom, prenom);
	}
	
	public Candidat(int idPersonne, String nom, String prenom, String cle, Test test) {
		super(idPersonne, nom, prenom);
		this.test = test;
	}








/**
 * Getters and setters
 */


	public Test getTest() {
		return test;
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

}
