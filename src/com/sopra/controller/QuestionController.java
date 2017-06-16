package com.sopra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sopra.model.Question;
@Controller
@RequestMapping("/question")
public class QuestionController extends DataAccessController {


	@RequestMapping(value="", method = RequestMethod.GET)
	public String getAll(Model model) {
		

		return "question";
	}

	@RequestMapping(value="/new", method = RequestMethod.GET)
	public String newQuestionGET(Model model) {

		model.addAttribute("questionTraitee", new Question());
		
		return "newQuestion";
	}
	
	@RequestMapping(value="/new", method = RequestMethod.POST)
	public String newQuestionPOST(@ModelAttribute("questionTraitee") Question question, BindingResult result, Model model) {
		
		String intitule = question.getIntitule();
		Integer numero = question.getNumero();
		
		
		System.out.println(question.getIntitule());
		System.out.println(question.getNumero());
		
		questionDAO.save(question);

		return "newQuestion";
	}
	
	

	
}
