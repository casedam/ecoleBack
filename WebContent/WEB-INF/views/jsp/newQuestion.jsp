<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<br>
<table class="bordered">
	<tr>
		<th>Edition de la question</th>
		<th>Question numéro ...</th>
	</tr>
	<tr>
		<td>Ecrivez votre question :</td>
		<td class="input-field"><input type="hidden" name="id"
			value="${ question.id }" /> <input id="question_nom" type="text"
			class="validate" name="nom" value="${ question.nom }" /> <label
			for="question_nom"></label></label></td>
	</tr>
</table>
<br>
<br>
<table>
	<tr>
		<th>Edition des réponses</th>
		<th>Editez vos réponses</th>
	</tr>
	<tr>
		<td>Réponse 1</td>
		<td><input id="question_nom" type="text"
			class="validate" name="nom" value="${ reponse.nom }" /> <label
			for="reponse_nom"></label></label></td>
	</tr>
	<tr>
		<td>Réponse 2</td>
		<td><input id="question_nom" type="text"
			class="validate" name="nom" value="${ reponse.nom }" /> <label
			for="reponse_nom"></label></label></td>
	</tr>
	<tr>
		<td>Réponse 3</td>
		<td><input id="question_nom" type="text"
			class="validate" name="nom" value="${ reponse.nom }" /> <label
			for="reponse_nom"></label></label></td>
	</tr>
	<tr>
		<td>Réponse 4</td>
		<td><input id="question_nom" type="text"
			class="validate" name="nom" value="${ reponse.nom }" /> <label
			for="reponse_nom"></label></label></td>
	</tr>
	<tr>
		<td>Réponse 2</td>
		<td><input id="question_nom" type="text"
			class="validate" name="nom" value="${ reponse.nom }" /> <label
			for="reponse_nom"></label></label></td>
	</tr>
</table>


<%-- <div class="row">
	<div class="col s4">
		<h5>Edition d'une question</h5>
<form method="post">
			<input type="hidden" name="id" value="${ question.id }" />
			<div class="input-field col s12">
				<input id="question_nom" type="text" class="validate" name="nom" value="${ question.nom }" />
				<label for="question_nom"></label>
			</div>
 --%>
<!-- <div class="row">
		<div class="input-field col s12">
			<input id="question" type="question" class="validate"> <label
				for="question">Editez votre question</label>
		</div>
	</div> -->
<%-- <form action="#">
	<div class="row">
		<div class="input-field col s12">
			<input class="with-gap" name="group1" type="radio" id="test1" /> <label
				for="test1">{{reponse1}}</label>
		</div>
	</div>
	<div class="row">
		<div class="input-field col s12">
			<input class="with-gap" name="group1" type="radio" id="test2" /> <label
				for="test2">{{reponse2}}</label>
		</div>
	</div>
	<div class="row">
		<div class="input-field col s12">
			<input class="with-gap" name="group1" type="radio" id="test3" /> <label
				for="test3">{{reponse3}}</label>
		</div>
	</div>
	<div class="row">
		<div class="input-field col s12">
			<input class="with-gap" name="group1" type="radio" id="test4" /> <label
				for="test4">{{reponse4}}</label>
		</div>
	</div>
</form> --%>