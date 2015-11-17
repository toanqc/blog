<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<div class="items">
	<c:forEach items="${entries}" var="entry">
		<a href="<spring:url value="/entries/${entry.id}" />"> <span
			class="title">${entry.title}</span> <span class="date"><fmt:formatDate
					pattern="MMM dd, yyyy" value="${entry.createdDate}" /></span> <span
			class="content">${entry.shortDescription} ...</span>
		</a>
	</c:forEach>
</div>