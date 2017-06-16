<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<br>


<h1>Bienvenue, ${ username } !</h1>
	
	<form method="GET" action="home/logout">
	    <button class="btn waves-effect waves-light" type="submit" name="action">Se déconnecter
    		<i class="material-icons right">power_settings_new</i>
  		</button>
	</form>