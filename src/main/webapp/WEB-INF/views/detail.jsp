<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="sub-header">
	<div class="breadcrumb">
		<a class="back" onclick="history.back()"><spring:message
				code="label.back" /></a>
	</div>
</div>

<div class="detail-container">
	<div class="title">${entry.title}</div>
	<div class="detail-date">
		<fmt:formatDate pattern="MMM dd, yyyy" value="${entry.createdDate}" />
	</div>
	<div class="detail-content">
		<div class="content-text">
			${entry.entryDetail.content}
		</div>
	</div>
</div>