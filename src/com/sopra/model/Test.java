package com.sopra.model;

import java.sql.Date;

public class Test {
	private Integer idTest;
	private Niveau niveau;
	private Branche branche;
	private Date date;

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

}
