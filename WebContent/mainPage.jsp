<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>MainPage</title>
</head>
<body>
	main page here
	<table>
		<c:forEach items="${values}" var="element">
			<tr>
				<td>${element.name}</td>
		</c:forEach>
	</table>
</body>
</html>