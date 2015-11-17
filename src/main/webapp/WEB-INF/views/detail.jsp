<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="detail-container">
	<div class="title">${entry.title}</div>
	<div class="detail-date">
		<fmt:formatDate pattern="MMM dd, yyyy" value="${entry.createdDate}" />
	</div>
	<div class="detail-content">
		<!-- 
		<div class="content-img">
			<img src="<spring:url value="/assets/img/gotalk.png" />" />
		</div>
		 -->
		<div class="content-text">
			${entry.content}
		</div>
	</div>
</div>