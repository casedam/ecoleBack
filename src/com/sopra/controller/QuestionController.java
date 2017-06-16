package com.sopra.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sopra.dao.IDAO;
import com.sopra.model.Proposition;
import com.sopra.model.Question;
import com.sopra.hibernate.dao.*;

@Controller
@RequestMapping("/question")
public class QuestionController extends DataAccessController {


	@RequestMapping(value="", method = RequestMethod.GET)
	public String getAll(Model model) {
		

		return "question";
	}

	@RequestMapping(value="/new", method = RequestMethod.GET)
	public String newQuestionGET(Model model) {
		

		return "newQuestion";
	}

	/*
	@RequestMapping(value = { "/edit", "/edit/{id}" }, method = RequestMethod.GET)
	public String edit(@PathVariable(value = "id", required = false) Integer questionId, Model model) {
		if (questionId != null) {
			model.addAttribute("question", this.questionDAO.find(questionId));
		}

		return (questionId != null) ? "editQuestion" : "addQuestion";
	}

	@RequestMapping(value = { "/edit", "/edit/{id}" }, method = RequestMethod.POST)
	public String edit(@PathVariable(value = "id", required = false) Integer questionId,
			@Valid @ModelAttribute("tetrimino") Question question, BindingResult result) {
		question = this.questionDAO.save(question);
		return "redirect:/question/edit/" + question.getIdQuestion();
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer questionId) {
		this.questionDAO.delete(this.questionDAO.find(questionId));
		return "redirect:/question";
	}

	@RequestMapping("/{id}/proposition/add")
	public String addProposition(@PathVariable("id") Integer questionId) {
		Proposition myProposition = new Proposition();
		Question myQuestion = this.questionDAO.find(questionId);

		myProposition.setQuestion(myQuestion);
		
		this.propositionDAO.save(myProposition);

		return "redirect:/question/edit/{id}";
	}
*/
//	@RequestMapping("/{id}/figure/{idFigure}/delete")
//	public String deleteFigure(@PathVariable("id") String tetriminoId, @PathVariable("idFigure") int figureId) {
//		this.figureDAO.delete(this.figureDAO.find(figureId));
//
//		return "redirect:/tetrimino/edit/{id}";
//	}
//
//	@RequestMapping("/{id}/figure/{idFigure}/order/forward")
//	public String forwardFigure(@PathVariable("id") String tetriminoId, @PathVariable("idFigure") int figureId) {
//		Figure myFigure = this.figureDAO.find(figureId);
//		int myNewOrder = myFigure.getOrdre() + 1;
//
//		if (myNewOrder < myFigure.getTetrimino().getFigures().size()) {
//			for (Figure forFigure : myFigure.getTetrimino().getFigures()) {
//				if (forFigure.getOrdre() == myNewOrder) {
//					forFigure.setOrdre(myNewOrder - 1);
//					this.figureDAO.save(forFigure);
//				}
//			}
//
//			myFigure.setOrdre(myNewOrder);
//			this.figureDAO.save(myFigure);
//		}
//
//		return "redirect:/tetrimino/edit/{id}";
//	}
//
//	@RequestMapping("/{id}/figure/{idFigure}/order/backward")
//	public String backwardFigure(@PathVariable("id") String tetriminoId, @PathVariable("idFigure") int figureId) {
//		Figure myFigure = this.figureDAO.find(figureId);
//		int myNewOrder = myFigure.getOrdre() - 1;
//
//		if (myNewOrder >= 0) {
//			for (Figure forFigure : myFigure.getTetrimino().getFigures()) {
//				if (forFigure.getOrdre() == myNewOrder) {
//					forFigure.setOrdre(myNewOrder + 1);
//					this.figureDAO.save(forFigure);
//				}
//			}
//
//			myFigure.setOrdre(myNewOrder);
//			this.figureDAO.save(myFigure);
//		}
//
//		return "redirect:/tetrimino/edit/{id}";
//	}
//
//	@RequestMapping(value = "/figure/{idFigure}/bloc/edit/{position_x}-{position_y}", method = RequestMethod.GET)
//	public String addBloc(@PathVariable("idFigure") int figureId, @PathVariable("position_x") int positionX,
//			@PathVariable("position_y") int positionY) {
//		Bloc myBloc = new Bloc();
//		Figure myFigure = this.figureDAO.find(figureId);
//
//		myBloc.setPositionX(positionX);
//		myBloc.setPositionY(positionY);
//		myBloc.setFigure(myFigure);
//
//		this.blocDAO.save(myBloc);
//
//		return "redirect:/tetrimino/edit/" + myFigure.getTetrimino().getId();
//	}
//
//	@RequestMapping(value = "/figure/{idFigure}/bloc/{idBloc}/delete", method = RequestMethod.GET)
//	public String editBloc(@PathVariable("idFigure") int figureId, @PathVariable("idBloc") int blocId) {
//		Figure myFigure = this.figureDAO.find(figureId);
//		this.blocDAO.delete(this.blocDAO.find(blocId));
//
//		return "redirect:/tetrimino/edit/" + myFigure.getTetrimino().getId();
//	}

	// /*
	// * Page QUESTION
	// */
	// @RequestMapping(value = "", method = RequestMethod.GET)
	// public String loginGET(HttpSession session, Model model) {
	//
	// // Permet de rediriger vers la page question
	// return "question";
	// }
	//
	//
	//
	//
	// @RequestMapping(value = "/new", method = RequestMethod.POST)
	// public String loginPOST(HttpSession session, Model model) {
	//
	// //
	// return "redirect :question";
	// }

}
