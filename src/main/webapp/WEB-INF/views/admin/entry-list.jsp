<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<div class="sub-header">
	<div class="welcome">
		<security:authorize access="isAuthenticated()">
			<spring:message code="label.welcome" />
			<security:authentication property="principal.username" />,
			<a href="<spring:url value="/j_spring_security_logout" />"><spring:message
					code="label.logout" /></a>
		</security:authorize>
	</div>
</div>

<div class="entry-list-container">
	<div class="title">Entry List</div>
	<div>
		<table>
			<tr>
				<th width="20%" class="left"><spring:message
						code="label.entry.created.date" /></th>
				<th width="50%" class="left"><spring:message
						code="label.entry.title" /></th>
				<th width="15%"><spring:message code="label.edit" /></th>
				<th width="15%"><spring:message code="label.delete" /></th>
			</tr>

			<c:forEach items="${entries}" var="entry">
				<tr>
					<td width="20%"><fmt:formatDate pattern="MMM dd yyyy"
							value="${entry.createdDate}" /></td>
					<td width="50%">${entry.title}</td>
					<td width="15%" class="center"><a
						href="<spring:url value="/admin/entries/${entry.id}" />"><spring:message
								code="label.edit" /></a></td>
					<td width="15%" class="center"><spring:message
							code="label.are.you.sure" var="confirm" /> <a
						onclick="return confirm('${confirm}')"
						href="<spring:url value="/admin/entries/${entry.id}/delete" />"
						id="cancel"><spring:message code="label.delete" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="right">
		<a href="<spring:url value="/admin/entries/create" />"><spring:message code="label.entry.create.new" /></a>
	</div>
</div>