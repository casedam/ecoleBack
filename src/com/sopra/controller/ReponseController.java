package com.sopra.controller;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sopra.model.Question;
import com.sopra.model.Reponse;

//@Controller
//@RequestMapping("/reponse")
//public class ReponseController extends DataAccessController{
//	@RequestMapping(value="", method = RequestMethod.GET)
//	public String getAll(Model model) {
//		
//
//		return "reponse";
//	}
//
//	@RequestMapping(value="/new", method = RequestMethod.GET)
//	public String newQuestionGET(Model model) {
//
//		model.addAttribute("reponseTraitee", new Reponse());
//		
//		return "newReponse";
//	}
//	
//	@RequestMapping(value="/new", method = RequestMethod.POST)
//	public String newQuestionPOST(@ModelAttribute("reponseTraitee") Reponse reponse, BindingResult result, Model model) {
//		
//	
//		
//		String reponseChoisie = reponse.getReponse();
//		
//		
//		
//		System.out.println(reponse.getReponse());
//		
//		
//		propositionDAO.save(reponse);
//
//		return "newReponse";
//	}
//	
//
//}
