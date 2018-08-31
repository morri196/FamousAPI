<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="complete" items="${complete}">
	<tr>
 	
    <td> ${complete.firstname} </td>
 
 	<td> ${complete.lastname} </td>
  
    <td> ${complete.innovation} </td>
 
    <td> ${complete.year} </td>
    
    </tr>
	</c:forEach>
	<p>
	<button class="btn">
	<a href="/"> Return Home</a></button>
	</p>
</body>
</html>