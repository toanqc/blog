<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="login-container">
	<div class="title"><spring:message
								code="label.login" /></div>
	<div>
		<form method="post"
			action="<spring:url value="/j_spring_security_check" />">
			<table>
				<c:if test="${error eq true}">
					<tr>
						<td colspan="2" class="error"><spring:message
								code="label.login.failed" /></td>
					</tr>
				</c:if>
				<tr>
					<td width="100px"><label for="username"><spring:message
								code="label.login.username" /> *</label></td>
					<td><input type="text" id="username" name="username"></td>
				</tr>
				<tr>
					<td><label for="password"><spring:message
								code="label.login.password" /> *</label></td>
					<td><input type="password" id="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2" class="center">
						<button type="submit" class="button">
							<spring:message code="label.login" />
						</button>
						<button type="reset" class="button">
							<spring:message code="label.clear" />
						</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>