<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<script>
	tinymce
			.init({
				selector : '#content',
				content_css : "../../assets/css/content.css",
				theme : "modern",
				height : 350,
				plugins : [
						"advlist autolink link image lists charmap print preview hr anchor pagebreak spellchecker",
						"searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media nonbreaking",
						"save table contextmenu directionality emoticons template paste textcolor" ],
				toolbar : "insertfile undo redo | styleselect | bold italic | fontselect | fontsizeselect | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image | print preview media fullpage | forecolor backcolor emoticons",
				fontsize_formats : "8pt 10pt 12pt 14pt 18pt 24pt 36pt"
			});
</script>

<div class="sub-header">
	<div class="breadcrumb">
		<a href="<spring:url value="/admin/entries" />"><spring:message
				code="label.back" /></a>
	</div>
	<div class="welcome">
		<security:authorize access="isAuthenticated()">
			<spring:message code="label.welcome" />
			<security:authentication property="principal.username" />,
			<a href="<spring:url value="/j_spring_security_logout" />"><spring:message
					code="label.logout" /></a>
		</security:authorize>
	</div>
</div>
<div class="entry-container">
	<div class="title">
		<c:if test="${isUpdate eq false}">
			<spring:message code="label.entry.create.new" />
		</c:if>
		<c:if test="${isUpdate eq true}">
			<spring:message code="label.entry.edit" />
		</c:if>
	</div>
	<div>
		<spring:url value="/admin/entries" var="entryUrl" />
		<form:form modelAttribute="entry" action="${entryUrl}" method="post">
			<table>
				<tr>
					<td width="50px"><label><spring:message
								code="label.entry.title" /> *</label></td>
					<td><form:input path="title" type="text" id="title" /></td>
				</tr>
				<tr>
					<td colspan="2"><form:textarea path="content" id="content" /></td>
				</tr>
				<tr>
					<td colspan="2" class="center"><button type="submit"
							class="button">
							<spring:message code="label.post" />
						</button>
						<button type="reset" class="button">
							<spring:message code="label.cancel" />
						</button></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>