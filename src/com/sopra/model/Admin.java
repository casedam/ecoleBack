package com.sopra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="admin")
public class Admin extends Personne {
	private static final long serialVersionUID = 1L;
	
	@Column(name="ADM_USERNAME")
	@NotBlank
	private String username;
	
	@Column(name="ADM_PASSWORD")
	@NotBlank
	private String password;
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
		// TODO Auto-generated method stub
		super.setPrenom(prenom);
	}

	public Admin(int idPersonne, String nom, String prenom, String username, String password) {
		super(idPersonne, nom, prenom);
		this.username = username;
		this.password = password;
	}
}
