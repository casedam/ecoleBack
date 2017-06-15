package com.sopra.dao.hibernate;

import com.sopra.dao.ITestDAO;

public class TestHibernateDAO extends DAOHibernate<Test, Integer> implements ITestDAO {

	public TestHibernateDAO() {
		this.maClasse = Test.class;
		this.maClasseString = "Tetrimino";
	}
	
}
