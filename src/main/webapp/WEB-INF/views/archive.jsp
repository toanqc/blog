<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript"
	src="<spring:url value="/assets/js/archive.js" />"></script>

<div class="archive-container">
	<div class="archive-icon">
		<img src="<spring:url value="/assets/img/archive.png" />">
	</div>
	<input type="text" id="search" name="search"
		placeholder="Search my stuff here"
		onchange="getArchivesAjax(search.value)" />


	<div class="archive-post">
		<div id="archives"></div>
		<!-- 
		<ul>
			<c:forEach items="${entries}" var="entry">
				<li><fmt:formatDate pattern="MMM dd yyyy"
						value="${entry.createdDate}" /> — <a
					href="/entries/${entry.id}">${entry.title}</a></li>
			</c:forEach>
		</ul>
		 -->
	</div>
</div>