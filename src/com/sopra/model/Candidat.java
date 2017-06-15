package com.sopra.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;



@Entity
@Table(name="candidat")
public class Candidat extends Personne {

	public Candidat() {
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CAN_CLE")
	
	private String Cle;
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
	
	@OneToMany(mappedBy="test")
	private List<Test> test;
}
