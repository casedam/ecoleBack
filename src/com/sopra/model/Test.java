package com.sopra.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TES_ID")
	private Integer idTest;

	@Column(name = "TES_NIVEAU")
	private Niveau niveau;

	@Column(name = "TES_BRANCHE")
	private Branche branche;

	@Column(name = "TES_DATE")
	private Date date;

	@OneToMany
	@JoinColumn(name="TES_QRE")
	private List<Questionnaire> questionnaires;

	@OneToOne
	@JoinColumn(name="CANDIDAT_ID")
	private Candidat candidat;
	
	@OneToMany(mappedBy="test")
	private List<Reponse> reponses;

	
	
	
	
	
	
	
	public Integer getIdTest() {
		return idTest;
	}

	public void setIdTest(Integer idTest) {
		this.idTest = idTest;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Branche getBranche() {
		return branche;
	}

	public void setBranche(Branche branche) {
		this.branche = branche;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Questionnaire> getQuestionnaires() {
		return questionnaires;
	}

	public void setQuestionnaires(List<Questionnaire> questionnaires) {
		this.questionnaires = questionnaires;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Test(Integer idTest, Niveau niveau, Branche branche, Date date, List<Questionnaire> questionnaires,
			Candidat candidat) {
		super();
		this.idTest = idTest;
		this.niveau = niveau;
		this.branche = branche;
		this.date = date;
		this.questionnaires = questionnaires;
		this.candidat = candidat;
	}

}
