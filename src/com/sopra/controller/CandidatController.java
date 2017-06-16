package com.sopra.controller;

import javax.servlet.http.HttpSession;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.sopra.dao.IDAO;
//import com.sopra.model.Candidat;
//


@Controller
@RequestMapping("/candidat")
public class CandidatController extends DataAccessController {

//	@Autowired
//	private IDAO<Candidat, Integer> candidatDAO;
//	
//	
	
	
	/*
	 * Page LOGIN
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String loginGET(HttpSession session, Model model) {
		
		model.addAttribute("candidats", candidatDAO.findAll());

		// Permet de rediriger vers la page candidat
		return "candidat";
	}

//	@RequestMapping("")
//	public String getAll(Model model) {
//		model.addAttribute("candidats", this.candidatDAO.findAll());
//		
//		return "candidats";
//	}
//	
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String loginPOST(HttpSession session, Model model) {

		// Permet de rediriger vers la page nouveau candidat
		return "newCandidat";
	}

}
