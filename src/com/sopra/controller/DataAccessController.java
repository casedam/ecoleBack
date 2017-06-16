package com.sopra.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.sopra.dao.IAdminDAO;
import com.sopra.dao.ICandidatDAO;
import com.sopra.dao.IDAO;
import com.sopra.dao.IPropositionDAO;
import com.sopra.dao.IQuestionDAO;
import com.sopra.dao.IQuestionnaireDAO;
import com.sopra.dao.ITestDAO;
import com.sopra.model.Admin;
import com.sopra.model.Candidat;



public class DataAccessController {
	
	/**
	 * Appel tous les DAO de manière à les avoir dans les classes filles
	 */

	@Autowired
	protected IAdminDAO adminDAO;

	@Autowired
	protected ICandidatDAO candidatDAO;

	@Autowired
	protected IQuestionDAO questionDAO;

	@Autowired
	protected IQuestionnaireDAO questionnaireDAO;

	@Autowired
	protected IPropositionDAO propositionDAO;

	@Autowired
	protected ITestDAO testDAO;
	
}
