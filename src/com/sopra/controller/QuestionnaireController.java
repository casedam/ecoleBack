package com.sopra.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sopra.model.Question;
import com.sopra.model.Questionnaire;

@Controller
@RequestMapping("/questionnaire")
public class QuestionnaireController extends DataAccessController{
	
	/*
	 * Page questionnaire
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String loginGET(HttpSession session, Model model) {
		
		model.addAttribute("questionnaire", new Questionnaire());
		model.addAttribute("questions", questionDAO.findAll());

		// Permet de rediriger vers la liste des questionnaire
		return "questionnaire";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String newPOST(@ModelAttribute("questionnaire") Question question, BindingResult result, HttpSession session, Model model) {
		
		// On récupère les paramètres dans le scope HttpSession
		Integer numero = question.getNumero();
		String intitule = question.getIntitule();
	
	// Permet de rediriger vers la page nouveau candidat
	return "redirect:";
}



}
