package com.sopra.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IDAO;
import com.sopra.model.Proposition;

@Repository("propositionDAO")
@Transactional
public class PropositionHibernateDAO implements IDAO<Proposition, Integer> {

	@PersistenceContext
	private EntityManager entityManager;

	// Liste de proposition
	@Override
	public List<Proposition> findAll() {
		try {
			return this.entityManager.createQuery("from Proposition", Proposition.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Trouver une seule proposition
	@Override
	public Proposition find(Integer id) {
		try {
			return this.entityManager.find(Proposition.class, id);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// Ajouter une proposition
	@Override
	public Proposition save(Proposition proposition) {
		try {
			return this.entityManager.merge(proposition);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proposition;
	}

	// Supprimer une proposition
	@Override
	public void delete(Proposition proposition) {
		try {
			this.entityManager.remove(this.entityManager.merge(proposition));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
