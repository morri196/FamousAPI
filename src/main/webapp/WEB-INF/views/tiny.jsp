<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach var="tiny" items="${tiny}">
	<tr>
 	
    <td> ${tiny.name} </td>
 
 	<td> ${tiny.invented} </td>
  
    <td> ${tiny.year} </td>
    
    </tr>
	</c:forEach>
	
	<p>
	<button class="btn">
	<a href="/complete"> Next</a></button>
	</p>
</body>
</html>