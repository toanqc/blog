<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<header>
	<div class="signature">
		<a href="<spring:url value="/" />"><img
			src="<spring:url value="/assets/img/signature.png" />" /></a>
	</div>
	<div class="i18n">
		<a href="?language=en_US"><img src="<spring:url value="/assets/img/flag/us.png" />" /></a>
		<a href="?language=vi_VN"><img src="<spring:url value="/assets/img/flag/vi.png" />" /></a>
	</div>
	<ul class="navigation">
		<li><a target="_blank"
			href="http://www.flickr.com/photos/toanquach"><spring:message code="label.header.photography" /></a></li>
		<li><a href="<spring:url value="/" />"><spring:message code="label.header.home" /></a></li>
		<li><a href="<spring:url value="/archives" />"><spring:message code="label.header.archive" /></a></li>
		<li><a href="<spring:url value="/about-me" />"><spring:message code="label.header.aboutme" /></a></li>
		<li><a href=""><spring:message code="label.header.contact" /></a></li>
	</ul>
</header>