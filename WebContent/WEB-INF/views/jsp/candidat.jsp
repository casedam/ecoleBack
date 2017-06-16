<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<br>




<div class="fixed-action-btn">
	<a href="new" class="btn-floating btn-large red"> <i
		class="large material-icons">add</i>
	</a>
</div>



<div class="row">
	



<table class="highlight"  >
        <thead>
          <tr>
              <th>nom</th>
              <th>prenom</th>
              <th>Cle d'acces</th>
          </tr>
        </thead>
<c:forEach items="${ candidats }" var="candidat">
        <tbody>
          <tr>
           <td>${ candidat.nom }</td>
				<td>${ candidat.prenom }</td>
				<td>${ candidat.cleAcces }</td>
          </tr>
    </c:forEach>
      </table>
		


</div>