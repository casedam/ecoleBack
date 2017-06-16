package com.sopra.controller;

import javax.servlet.http.HttpSession;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sopra.dao.ICandidatDAO;
import com.sopra.model.Admin;
import com.sopra.model.Candidat;

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
	 * Page CANDIDAT
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String loginGET(HttpSession session, Model model) {
		
		model.addAttribute("candidat", new Candidat());
		model.addAttribute("candidats", candidatDAO.findAll());

		// Permet de rediriger vers la page candidat
		return "candidat";
	}
	
	
	
	
	
	
		@RequestMapping(value = "/new", method = RequestMethod.GET)
		public String newGET(HttpSession session, Model model) {


			model.addAttribute("candidat", new Candidat());

		// Permet de rediriger vers la page nouveau candidat
		return "newCandidat";
	}
		
		
		
		
		
	
		@RequestMapping(value = "/new", method = RequestMethod.POST)
		public String newPOST(@ModelAttribute("candidat") Candidat candidat, BindingResult result, HttpSession session, Model model) {
			
			// On récupère les paramètres dans le scope HttpSession
			String nom = candidat.getNom();
			String prenom = candidat.getPrenom();
			
			System.out.println(nom);
			
			candidatDAO.save(candidat);

		// Permet de rediriger vers la page nouveau candidat
		return "redirect:";
	}

}
