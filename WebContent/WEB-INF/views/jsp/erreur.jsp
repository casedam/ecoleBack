<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<p>Vous n'êtes pas connecté pour accéder à la ressource demandée !</p>

<form method="GET" action="login">
    <button class="btn waves-effect waves-light" type="submit" name="action">S'identifier
   		<i class="material-icons right">send</i>
 		</button>
</form>
