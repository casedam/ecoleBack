<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!-- Déclaration des variable JSTL -->
<c:set var="joueur" value="joueur" />
<c:set var="spectateur" value="spectateur" />
<c:set var="administrateur" value="administrateur" />


<nav>
	<div class="nav-wrapper">
		<div class="container">
			<a class="brand-logo">Gestionnaire des tests</a>




				<ul id="nav-mobile" class="right hide-on-med-and-down">
				
							
					<li><a
						href="${ pageContext.request.contextPath }/account/login">Login</a></li>

					<li><a href="${ pageContext.request.contextPath }/questionnaire">Questionnaires</a></li>
				</ul>




		</div>
	</div>
</nav>
