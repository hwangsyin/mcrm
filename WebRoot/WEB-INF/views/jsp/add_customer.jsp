<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div>
	<form name="customer" action="${pageContext.request.contextPath}/customers" method="post">
		<label>称呼:</label><input type="text" name="title">
		<br>
	<input type="submit" value="添加">
</form>
</div>