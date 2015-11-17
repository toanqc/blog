<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="entry-list-container">
	<div class="title">Entry List</div>
	<div>
		<table>
			<tr>
				<th width="20%" class="left">Created Date</th>
				<th width="50%" class="left">Title</th>
				<th width="15%"><spring:message
						code="label.edit" /></th>
				<th width="15%"><spring:message
						code="label.delete" /></th>
			</tr>

			<c:forEach items="${entries}" var="entry">
				<tr>
					<td width="20%"><fmt:formatDate pattern="MMM dd yyyy" value="${entry.createdDate}" /></td>
					<td width="50%">${entry.title}</td>
					<td width="15%" class="center"><a href="<spring:url value="/admin/entries" />"><spring:message
								code="label.edit" /></a></td>
					<td width="15%" class="center"><spring:message code="label.are.you.sure" var="confirm" />
						<a onclick="return confirm('${confirm}')"
						href="<spring:url value="/entries/delete" />" id="cancel"><spring:message
								code="label.delete" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>