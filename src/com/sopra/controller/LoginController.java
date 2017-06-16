package com.sopra.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/login")
public class LoginController extends DataAccessController {

	/*
	 * Page LOGIN
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String loginGET(HttpSession session, Model model) {

		// Permet de rediriger vers la page login
		return "login";
	}



	@RequestMapping(value = "", method = RequestMethod.POST)
	public String loginPOST(HttpSession session, Model model) {

		// Permet de rediriger vers la page home
		return "redirect:home";
	}


	
}
