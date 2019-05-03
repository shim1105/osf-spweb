<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>사원 등록</title>
    <!-- Bootstrap core CSS -->
    <link href="/resources/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/signin.css" rel="stylesheet">
  </head>
<script >
	
</script>  
  <body class="text-center">
    <form class="form-signin" action="/emp/login" method="post">
    
      <img class="mb-4" src="\resources\insert.png" alt="" width="200" height="200">
      <h1 class="h3 mb-3 font-weight-normal">Employee registration</h1>
   <select name="detpNo" id="detpNo" >
      <c:forEach var="d" items="${deptList}">
         <option value="${d.DNAME}">${d.DNAME}</option>  
      </c:forEach>
   </select>
      <label for="ename" class="sr-only">ename</label>
      <input type="text" id="ename" class="form-control" placeholder="이름" required autofocus name="name">
      <label for="job" class="sr-only">job</label>
      <input type="text" id="job" class="form-control" placeholder="직책" required  name="job">
      <label for="mgr" class="sr-only">mgr</label>
      <input type="number" id="mgr" class="form-control" placeholder="사수" required  name="mgr">
      <label for="hiredate" class="sr-only">hiredate</label>
      <input type="date" id="hiredate" class="form-control" placeholder="입사년도월일" required  name="hiredate">
      <label for="sal" class="sr-only">sal</label>
      <input type="number" id="sal" class="form-control" placeholder="급여" required  name="sal">
      <label for="comm" class="sr-only">comm</label>
      <input type="number" id="comm" class="form-control" placeholder="커미션" required  name="com">
     <!--  <label for="id" class="sr-only">id</label>
      <input type="text" id="id" class="form-control" placeholder="ID" required  name="id">
      <label for="pwd" class="sr-only">pwd</label>
      <input type="password" id="pwd" class="form-control" placeholder="PWD" required  name="pwd">
      <label for="lvl" class="sr-only">lvl</label>
      <input type="number" id="lvl" class="form-control" placeholder="LVL" required  name="lvl">
       -->
      <button class="btn btn-lg btn-primary btn-block" type="button" id="signinBtn">사원등록</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2999</p>
    </form>
  </body>
</html>
