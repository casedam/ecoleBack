package com.sopra.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/candidat")
public class CandidatController extends DataAccessController {

	/*
	 * Page LOGIN
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String loginGET(HttpSession session, Model model) {

		// Permet de rediriger vers la page candidat
		return "candidat";
	}


	
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String loginPOST(HttpSession session, Model model) {

		// Permet de rediriger vers la page nouveau candidat
		return "newCandidat";
	}

}
