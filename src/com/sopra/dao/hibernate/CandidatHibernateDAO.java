package com.sopra.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.ICandidatDAO;
import com.sopra.dao.IDAO;
import com.sopra.model.Candidat;

@Repository
@Transactional
public class CandidatHibernateDAO implements ICandidatDAO {

	@PersistenceContext
	private EntityManager entityManager;

	// Trouver une liste de candidats
	@Override
	public List<Candidat> findAll() {
		try {
			return this.entityManager.createQuery("from Candidat", Candidat.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	// Trouver un seul candidat
	@Override
	public Candidat find(Integer id) {
		try {
			return this.entityManager.find(Candidat.class, id);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// Ajout d'un candidat
	@Override
	public Candidat save(Candidat candidat) {
		try {
			return this.entityManager.merge(candidat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return candidat;
	}

	// Supprimer un candidat
	@Override
	public void delete(Candidat candidat) {
		try {
			this.entityManager.remove(this.entityManager.merge(candidat));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
