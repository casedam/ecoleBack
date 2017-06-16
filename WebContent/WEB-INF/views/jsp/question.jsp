<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<br>

<div class="row">
	



<table class="highlight"  >
        <thead>
          <tr>
              <th>Question Numéro</th>
              <th>Question</th>
          </tr>
        </thead>
<c:forEach items="${ questions }" var="question">
        <tbody>
          <tr>
           <td>${ question.numero }</td>
				<td>${ question.intitule }</td>
          </tr>
    </c:forEach>
      </table>
		


</div>