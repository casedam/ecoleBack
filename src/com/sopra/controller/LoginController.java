package com.sopra.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sopra.model.Admin;



@Controller
@RequestMapping("/login")
public class LoginController extends DataAccessController {

	/*
	 * Page LOGIN
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String loginGET(HttpSession session, Model model) {

		model.addAttribute("user", new Admin());

		// Permet de rediriger vers la page login
		return "login";
	}



	@RequestMapping(value = "", method = RequestMethod.POST)
	public String loginPOST(@ModelAttribute("user") Admin admin, BindingResult result, HttpSession session, Model model) {
		
		// On récupère les paramètres dans le scope HttpSession
		String username = admin.getUsername();
		String password = admin.getPassword();

		// récupérer tous les Personnes de la base de données
		Admin adminAVerifier = adminDAO.findByUsername(username);
		
		
		// Condition vérifiant que l'utilisateur n'existe pas dans la BDD
		if ((adminAVerifier == null)) {
			
			// Permet d'afficher le message d'alerte pour le username et pas pour le mdp
			model.addAttribute("MessageAlertUserLogin", true);
			model.addAttribute("MessageAlertMdPLogin", false);

			// Permet de rediriger vers la page login
			return "login";
		}

		else {
			// Condition permettant de savoir si l'utilisateur est déjà enregistré
			if ((username.equals(adminAVerifier.getUsername()))
					&& (password.equals(adminAVerifier.getPassword()))) {
				
				// Permet de ne pas afficher les messages d'alerte
				model.addAttribute("MessageAlertUserLogin", false);
				model.addAttribute("MessageAlertMdPLogin", false);
				
				// Permet d'enregistrer le username dans la variable user
				session.setAttribute("username", username);

				// Permet de rediriger vers la page home
				return "redirect:home";

			} else if ((username.equals(adminAVerifier.getUsername()))
					&& (!password.equals(adminAVerifier.getPassword()))) {

				// Permet d'afficher le message d'alerte pour le MdP et pas pour le username
				model.addAttribute("MessageAlertUserLogin", false);
				model.addAttribute("MessageAlertMdPLogin", true);

				// Permet de rediriger vers la page login
				return "login";
			}
		}
		return null;
	}

	
}
