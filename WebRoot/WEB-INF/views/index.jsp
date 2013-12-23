<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>CRM</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/main.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-2.0.3.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/main.js"></script>
	</head>
	<body>
		<div class="nav">nav</div>
		<div class="action">action</div>
		<div class="content">
			<div class="menu">
				<div class="menu-item">
					<a href="${pageContext.request.contextPath}/customers/add" class="mi-c">+ 客户</a>
				</div>
				<div class="menu-item">
					<a href="${pageContext.request.contextPath}/sessions/add" class="mi-c">+ 会话</a>
				</div>
				<div class="menu-item">
					<a href="${pageContext.request.contextPath}/customers" class="mi-c">客户</a>
				</div>
				<div class="menu-item">
					<a href="${pageContext.request.contextPath}/sessions" class="mi-c">会话</a>
				</div>
			</div>
			<div class="res" id="res">
				notifications
			</div>
		</div>
	</body>
</html>