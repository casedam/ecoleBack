<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<br>

<form class="col s12" method="POST" action="" >

	<div class="row">
		<div class="input-field col s6">
			<i class="material-icons prefix">account_circle</i>
			<input class="validate" id="username" name="username" />
			<label for="username" data-error="" data-success="">Nom d'utilisateur</label>
		</div>
	</div>


	<div class="row">
		<div class="input-field col s6">
			<i class="material-icons prefix">vpn_key</i>
			<input class="validate" type="password" id="password" name="password" />
			<label for="password" data-error="" data-success="">Mot de passe</label>
		</div>
	</div>


	<button id="submitLogin"
		class="btn waves-effect waves-light" type="submit">
		Se connecter<i class="material-icons right">send</i>
	</button>
	
</form>
