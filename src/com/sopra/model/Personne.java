package com.sopra.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;



@Entity
@Table(name="personne")
@Inheritance(strategy=InheritanceType.JOINED )

public abstract class Personne implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PER_ID")
	private int idPersonne;
	
	@Column(name="PER_NOM")
	@NotBlank
	private String nom;
	
	@Column(name="PER_PRENOM")
	@NotBlank
	private String prenom;
	
	
	
	
	
	public int getId() {
		return idPersonne;
	}
	
	public void setId(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Personne(int idPersonne, String nom, String prenom) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
	}
	
}
	
	