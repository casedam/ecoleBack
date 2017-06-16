<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<br>



<div class="row">
	<div class="col s4">
		<h5>Formulaire candidat</h5>
		<form:form class="col s12" method="POST" action="" modelAttribute="candidat" >
			
			
			<div class="input-field">
				<form:input class="validate" path="nom" />
				<form:label path="nom" data-error="" data-success="">Nom </form:label>
			</div>
			
			
			
			<div class="input-field">
				<form:input class="validate" path="prenom" />
				<form:label path="prenom" data-error="" data-success="">Prenom </form:label>
			</div>
			
			
			<!-- Bouton permettant la génération d'une clé d'accès -->
			<a id="cleAccess" class="btn waves-effect waves-light">
				Générer une clé d'accès
			</a>
			
			<div class="raw">
				Voici la clé d'accès générée : <span id="texteAInserer"></span>
			</div>
			
			<form:input type="hidden" path="cleAcces" id="idCleAccess" value="" />
			
			
			
			
			<!-- Bouton permettant l'envoie du formulaire -->
			<button id="submitCandidat" class="btn waves-effect waves-light" type="submit">
				Créer un nouveau candidat
			</button>
			
			
		</form:form>	
				
</div>
</div>