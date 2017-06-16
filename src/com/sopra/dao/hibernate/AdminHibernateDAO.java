package com.sopra.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.dao.IAdminDAO;
import com.sopra.model.Admin;

@Repository
@Transactional
public class AdminHibernateDAO implements IAdminDAO {

	@PersistenceContext
	private EntityManager entityManager;

	// Trouver tous les admin
	@Override
	public List<Admin> findAll() {
		try {
			return this.entityManager.createQuery("from Admin", Admin.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	// Trouver un seul admin
	@Override
	public Admin find(Integer id) {
		try {
			return this.entityManager.find(Admin.class, id);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// Trouver un admin par son username
	public Admin findByUsername(String username) {
		
		try {
			Query myQuery = this.entityManager.createQuery("from Admin a where a.username = :username");
			
			myQuery.setParameter("username", username);
			
			return (Admin)myQuery.getSingleResult();

		} catch (Exception e) {
			
			return null;
		}
		
	}

	// Ajout d'un admin
	@Override
	public Admin save(Admin admin) {
		try {
			return this.entityManager.merge(admin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return admin;
	}

	// Supprimer un admin
	@Override
	public void delete(Admin admin) {
		try {
			this.entityManager.remove(this.entityManager.merge(admin));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
