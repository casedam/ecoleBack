package com.sopra.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Admin")
public class Admin extends Personne {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Attributs
	 */
	@Column(name="ADM_USERNAME")
	private String username;
	
	@Column(name="ADM_PASSWORD")
	private String password;
	
	
	
	
	
	/**
	 * Constructeur
	 */
	public Admin(int idPersonne, String nom, String prenom, String username, String password) {
		super(idPersonne, nom, prenom);
		this.username = username;
		this.password = password;
	}
	
	

	public Admin() {
		super();
	}




	/**
	 * Getters et setters
	 */
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
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
		// TODO Auto-generated method stub
		super.setPrenom(prenom);
	}
}
