<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<br>




<div class="fixed-action-btn">
	<a href="candidat/new" class="btn-floating btn-large red"> <i
		class="large material-icons">add</i>
	</a>
</div>



<div class="row">
	<c:forEach items="${ candidats }" var="candidat">

		<table>

			<tr>
				<td>${ candidat.nom }</td>
				<td>${ candidat.prenom }</td>
				<td>${ candidat.cle }</td>
			</tr>
		</table>

</c:forEach>
</div>