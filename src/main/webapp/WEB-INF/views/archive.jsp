<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="archive-container">
	<div class="archive-icon">
		<img src="<spring:url value="/assets/img/archive.png" />">
	</div>
	<spring:url value="/archives/search" var="searchUrl" />
	<form:form modelAttribute="entry" action="${searchUrl}" method="get">
		<form:input path="title" type="text" id="search" name="search"
			placeholder="Search my stuff here" />
	</form:form>

	<div class="archive-post">
		<ul>
			<c:forEach items="${entries}" var="entry">
				<li><fmt:formatDate pattern="MMM dd yyyy"
						value="${entry.createdDate}" /> — <a
					href="/entries/${entry.id}">${entry.title}</a></li>
			</c:forEach>
		</ul>
	</div>
</div>