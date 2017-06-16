package com.sopra.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IDAO;
import com.sopra.model.Questionnaire;




@Repository("questionnaireDAO")
@Transactional
public class QuestionnaireHibernateDAO implements IDAO<Questionnaire, Integer> {
	
	@PersistenceContext
	private EntityManager entityManager;

	//Trouver une liste de questionnaires
	@Override
	public List<Questionnaire> findAll() {
		try {
			return this.entityManager.createQuery("from Questionnaire", Questionnaire.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//Trouver un seul questionnaire
	@Override
	public Questionnaire find(Integer id) {
		try {
			return this.entityManager.find(Questionnaire.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	//Ajout d'un questionnaire
	@Override
	public Questionnaire save(Questionnaire questionnaire) {
		try {
			return this.entityManager.merge(questionnaire);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return questionnaire;
	}

	//Supprimer un questionnaire
	@Override
	public void delete(Questionnaire questionnaire) {
		try {
			this.entityManager.remove(this.entityManager.merge(questionnaire));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
