package com.sopra.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.sopra.dao.IAdminDAO;
import com.sopra.dao.IDAO;
import com.sopra.model.Admin;



public class DataAccessController {
	
	/**
	 * Appel tous les DAO de manière à les avoir dans les classes filles
	 */

	@Autowired
	protected IAdminDAO adminDAO;
	
}
