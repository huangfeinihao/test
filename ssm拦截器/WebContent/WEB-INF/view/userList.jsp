<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>用户列表</h3>
<table border="1" style="border-collapse: collapse;">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>password</th>
		<th>age</th>
		<th>phone</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${users}" var="user" varStatus="vs">
		<tr style="${vs.index % 2 eq 0 ? 'background-color: gray':''}">
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.password}</td>
			<td>${user.age}</td>
			<td>${user.did}</td>
			<td>
				<a onclick="deleteUser(${user.id})" href="javascript:void(0);">删除</a>&nbsp;&nbsp;
				<a href="#">修改</a>
			</td>
		</tr>
	</c:forEach>
</table>
<script type="text/javascript">
	
	function deleteUser(userId){
		
		if(confirm("亲，您确定要删除此条数据么？？")){
			window.location.href="${pageContext.request.contextPath}/user/delete.do?userId="+userId
		}
		
	}

</script>

</body>
</html>