package com.sopra.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "proposition")
@DiscriminatorColumn(name = "PRO_TYPE", discriminatorType = DiscriminatorType.INTEGER)
public class Proposition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRO_ID")
	@NotBlank
	private Integer idProposition;

	@Column(name = "PRO_IS_CORRECT")
	@NotBlank
	private Boolean isCorrect;

	@Column(name = "PRO_NUMERO")
	@NotBlank
	private Character numero;

	public Integer getIdProposition() {
		return idProposition;
	}

	public void setIdProposition(Integer idProposition) {
		this.idProposition = idProposition;
	}

	public Boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public Character getNumero() {
		return numero;
	}

	public void setNumero(Character numero) {
		this.numero = numero;
	}

}
