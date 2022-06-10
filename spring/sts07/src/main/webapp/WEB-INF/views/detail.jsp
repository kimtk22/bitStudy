<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="template/header.jspf" %>
</head>
<body>
<%@ include file="template/menu.jspf" %>
	<div class="page-header">
		<h1>DEPT detail <small>dept</small></h1>
	</div>
	<form class="form-horizontal" method="post">
		<input type="hidden" name="_method" value="delete">
	  <div class="form-group">
	    <label for="deptno" class="col-sm-2 control-label">deptno</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="deptno" id="deptno" value="${bean.deptno }" readonly>
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="dname" class="col-sm-2 control-label">dname</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="dname" id="dname" value="${bean.dname }" readonly>
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="loc" class="col-sm-2 control-label">loc</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="loc" id="loc" value="${bean.loc }" readonly>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10">
	      <a href="${bean.deptno }/edit" class="btn btn-primary">수정</a>
	      <button type="submit" class="btn btn-danger">삭제</button>
	      <button type="button" class="btn btn-default" onclick="history.back();">뒤로</button>
	    </div>
	  </div>
	</form>	
</body>
</html>