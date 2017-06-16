<%@ page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		
		<!-- Materialize -->
		<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
			rel="stylesheet">
		<link type="text/css" rel="stylesheet" href="/ecoleBack/Materialize/css/materialize.min.css"
			media="screen,projection" />
			
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
		

		
		
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
	</head>
	
	
	<body>
	
	
		<tiles:insertAttribute name="navigation" />

		<div class="container">
			<tiles:insertAttribute name="body" />
		</div>
	
		
	  <script type="text/javascript" src="/ecoleBack/Materialize/js/materialize.min.js"></script>
	  <script type="text/javascript" src="/ecoleBack/js/candidat.js"></script>
	  
	</body>
</html>