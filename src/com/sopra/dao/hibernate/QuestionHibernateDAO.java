package com.sopra.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IDAO;
import com.sopra.model.Question;

@Repository("questionDAO")
@Transactional
public class QuestionHibernateDAO implements IDAO<Question, Integer>{

	@PersistenceContext
	private EntityManager entityManager;
	
	//Liste de questions
	@Override
	public List<Question> findAll() {
		try {
			return this.entityManager.createQuery("from Question", Question.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//Une seule question
	@Override
	public Question find(Integer id) {
		try {
			return this.entityManager.find(Question.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	//Ajout d'une question
	@Override
	public Question save(Question question) {
		try {
			return this.entityManager.merge(question);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return question;
	}

	//Suppresion d'une question
	@Override
	public void delete(Question question) {
		try {
			this.entityManager.remove(this.entityManager.merge(question));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}


}
