<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title" /></title>

<!-- font library -->
<link href='http://fonts.googleapis.com/css?family=Roboto+Slab:400,300'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Ubuntu+Mono:400,700,400italic'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400'
	rel='stylesheet' type='text/css'>

<!-- css library -->
<link rel="shortcut icon" type="image/png" sizes="128x128"
	href="<spring:url value="/assets/img/favicon.png" />" />

<!-- css application -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/assets/css/main.css" />" />

<!-- javascript library -->
<script type="text/javascript"
	src="<spring:url value="/assets/js/lib/jquery-2.1.4.min.js" />"></script>
<script type="text/javascript"
	src="<spring:url value="/assets/js/lib/tinymce/tinymce.min.js" />"></script>

</head>
<body>
	<tiles:insertAttribute name="header" />
	<div class="container">
		<tiles:insertAttribute name="body" />
	</div>
	<div class="clearfix"></div>
	<tiles:insertAttribute name="footer" />
</body>
</html>