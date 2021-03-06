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
				<c:if test="${isSuccess eq true}">
					<tr>
						<td colspan="2" class="success"><spring:message
								code="label.contact.success" /></td>
					</tr>
				</c:if>
				<tr>
					<td width="15%"><spring:message code="label.contact.email" />
						*</td>
					<td width="25%"><form:input path="email" id="email"
							type="email" maxlength="200" /></td>
					<td width="30%"><form:errors cssClass="error" path="email" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.contact.title" /> *</td>
					<td><form:input path="title" id="title" maxlength="200" /></td>
					<td><form:errors cssClass="error" path="title" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.contact.message" /> *</td>
					<td height="115px"><form:textarea path="message" id="message"
							cols="48" rows="50" /></td>
					<td><form:errors cssClass="error" path="message" /></td>
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