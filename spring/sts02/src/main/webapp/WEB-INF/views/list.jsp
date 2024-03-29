<%@page import="com.bit.emp.model.EmpVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="template/header.jspf" %>
</head>
<body>
	<%@ include file="template/menu.jspf" %>
	<ol class="breadcrumb">
	  <li><a href="${pageContext.request.contextPath }/index.bit">Home</a></li>
	  <li class="active">EMP</li>
	</ol>
	<h3 class="page-header">EMP List</h3>
	<a href="add.bit" class="btn btn-primary btn-block" role="button">입력</a>
	<table class="table">
		<thead>
			<tr>
				<th>empno</th>
				<th>ename</th>
				<th>hiredate</th>
			</tr>
		</thead>
		<tbody>
		<%
			for(EmpVo bean : (List<EmpVo>) request.getAttribute("list")){			
		%>
			<tr>
				<td><a href="detail.bit?empno=<%=bean.getEmpno() %>"><%=bean.getEmpno() %></a></td>
				<td><a href="detail.bit?empno=<%=bean.getEmpno() %>"><%=bean.getEname() %></a></td>
				<td><a href="detail.bit?empno=<%=bean.getEmpno() %>"><%=bean.getHiredate() %></a></td>
			</tr>
			
		<%} %>
		</tbody>
	</table>
	
	<%@ include file="template/footer.jspf" %>
</body>
</html>