<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="login-container">
	<div class="title">Login</div>
	<div>
		<form method="post"
			action="<spring:url value="/j_spring_security_check" />">
			<table>
				<c:if test="${error eq true}">
					<tr>
						<td colspan="2" class="error">Incorrect username or password.
							Please try again!</td>
					</tr>
				</c:if>
				<tr>
					<td width="100px"><label for="username">Username *</label></td>
					<td><input type="text" id="username" name="username"></td>
				</tr>
				<tr>
					<td><label for="password">Password *</label></td>
					<td><input type="password" id="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2" class="center">
						<button type="submit" class="button">Login</button>
						<button type="reset" class="button">Cancel</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>