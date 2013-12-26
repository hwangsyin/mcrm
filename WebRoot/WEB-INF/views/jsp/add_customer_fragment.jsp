<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="customer-form">
	<form name="customer" action="${pageContext.request.contextPath}/customers" method="post">
		<div class="cf-f">
			<label class="cf-l">称呼:</label><input class="cf-v" type="text" name="title">
		</div>
		<div class="cf-f">
			<label class="cf-l">电话:</label><input class="cf-v" type="text" name="phone">
		</div>
		<div class="cf-f">
			<label class="cf-l">姓名:</label><input class="cf-v" type="text" name="name">
		</div>
		<div class="cf-f">
			<label class="cf-l">性别:</label>
			<input class="cf-v-r" type="radio" name="gender" value="MALE" checked="true">&nbsp;男
			<input class="cf-v-r" type="radio" name="gender" value="FEMALE">&nbsp;女
		</div>
		<div class="cf-f">
			<label class="cf-l">年龄:</label><input class="cf-v" type="text" name="age">
		</div>
		<div class="cf-f">
			<label class="cf-l">电子邮件:</label><input class="cf-v" type="text" name="email">
		</div>
		<div class="cf-f">
			<label class="cf-l">地址:</label><input class="cf-v" type="text" name="address">
		</div>
		<div class="cf-f">
			<label class="cf-l">客户类型:</label>
			<select class="cf-v-s" name="type">
				<option value="1">1类</option>
				<option value="2">2类</option>
				<option value="3">3类</option>
			</select>
		</div>
		<div class="cf-f">
			<label class="cf-l">职务:</label><input class="cf-v" type="text" name="position">
		</div>
		<div class="cf-f">
			<label class="cf-l">加入时间:</label><input class="cf-v" type="text" name="startTime">
		</div>
		<div class="cf-f">
			<input class="cf-b" id="addCustomerButton" type="button" value="添加">
		</div>
	</form>
</div>