<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="contact-container">
	<div class="title">
		<spring:message code="label.contact" />
	</div>
	<div>
		<form:form modelAttribute="contact" method="post">
			<table>
				<tr>
					<td><spring:message code="label.contact.name" /> *</td>
					<td><form:input path="name" id="name" type="text"
							maxlength="100" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.contact.email" /> *</td>
					<td><form:input path="email" id="email" type="email"
							maxlength="200" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.contact.title" /> *</td>
					<td><form:input path="title" id="title" maxlength="200" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.contact.message" /> *</td>
					<td height="115px"><form:textarea path="message" id="message"
							cols="48" rows="50" /></td>
				</tr>
				<tr>
					<td class="center" colspan="2"><button type="submit"
							class="button">
							<spring:message code="label.submit" />
						</button>
						<button type="reset" class="button">
							<spring:message code="label.cancel" />
						</button></td>
				</tr>

			</table>
		</form:form>
	</div>
</div>