<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<br>
<form:form class="col s12" method="POST" action=""
	modelAttribute="questionTraitee">
	<div>
		<table class="bordered">
			<tr>
				<th>Edition de la question</th>
				<th>Question N°<form:input class="validate" path="numero" /> <form:label
						path="numero" data-error="" data-success="">Numéro de la question</form:label></th>
			</tr>
			<tr>
				<td>Ecrivez votre question :</td>
				<td><form:input class="validate" path="intitule" /> <form:label
						path="intitule" data-error="" data-success="">Intitulé de la question</form:label>
				</td>
			</tr>
		</table>
	</div>


	<button class="btn amber success waves-effect waves-light"
		type="submit">
		Valider <i class="material-icons right">send</i>
	</button>


</form:form>




<br>
<br>
<table>
	<tr>
		<th>Edition des réponses</th>
		<th>Editez vos réponses</th>
	</tr>
	<tr>
		<td>Réponse 1</td>
		<td><input id="reponse_nom" type="text" class="validate"
			name="nom" value="${ reponse.nom }" /> <label for="reponse_nom"></label></td>
	</tr>
	<tr>
		<td>Réponse 2</td>
		<td><input id="reponse_nom" type="text" class="validate"
			name="nom" value="${ reponse.nom }" /> <label for="reponse_nom"></label></td>
	</tr>
	<tr>
		<td>Réponse 3</td>
		<td><input id="reponse_nom" type="text" class="validate"
			name="nom" value="${ reponse.nom }" /> <label for="reponse_nom"></label></td>
	</tr>
	<tr>
		<td>Réponse 4</td>
		<td><input id="reponse_nom" type="text" class="validate"
			name="nom" value="${ reponse.nom }" /> <label for="reponse_nom"></label></td>
	</tr>
	<tr>
		<td>Réponse 2</td>
		<td><input id="reponse_nom" type="text" class="validate"
			name="nom" value="${ reponse.nom }" /> <label for="reponse_nom"></label></td>
	</tr>
</table>
<br>

<button class="btn amber success waves-effect waves-light" type="submit">
	Valider <i class="material-icons right">send</i>
</button>
