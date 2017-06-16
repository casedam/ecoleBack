package com.sopra.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "reponse")
public class Reponse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REP_ID")
	private Integer idReponse;

	@Column(name = "REP_TEMPS_DE_REPONSE")
	private Integer tempsDeReponse;

	@Column(name = "REP_REPONSE")
	private String reponse;
	
	@ManyToOne
	private Question question;
	
	@ManyToOne
	private Test test;
	
	
	
	
	

	public Integer getIdReponse() {
		return idReponse;
	}

	public void setIdReponse(Integer idReponse) {
		this.idReponse = idReponse;
	}

	public Integer getTempsDeReponse() {
		return tempsDeReponse;
	}

	public void setTempsDeReponse(Integer tempsDeReponse) {
		this.tempsDeReponse = tempsDeReponse;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public Reponse(Integer idReponse, Integer tempsDeReponse, String reponse) {
		super();
		this.idReponse = idReponse;
		this.tempsDeReponse = tempsDeReponse;
		this.reponse = reponse;
	}
	
	public Reponse(){
		
	}

}
