package com.sopra.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IDAO;
import com.sopra.dao.ITestDAO;
import com.sopra.model.Test;

@Repository("testDAO")
@Transactional
public class TestHibernateDAO implements ITestDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Test> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Test find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

		//Ajout d'un test
	@Override
	public Test save(Test test) {
		
		try {
			return this.entityManager.merge(test);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return test;
	}

	@Override
	public void delete(Test obj) {
		// TODO Auto-generated method stub
		
	}

}
