package com.sopra.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.sopra.dao.ITestDAO;


public class DataAccessController {
	
	
	/**
	 * Appel tous les DAO de manière à les avoir dans les classes filles
	 */

	@Autowired
	protected ITestDAO testDao;

	@Autowired
	protected IQuestionnaireDAO questionnaireDao;

	@Autowired
	protected IQuestionDAO questionDao;

	@Autowired
	protected IPropositionDAO propositionDao;

	@Autowired
	protected ICandidatDAO candidatDao;

}
