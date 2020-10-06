<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>MainPage</title>
</head>
<body>
	<%@ include file="/jsp/header.jsp" %>
	main page here
	<table>
		<c:forEach items="${values}" var="element">
			<tr>
				<td>${element.name}</td>
		</c:forEach>
	</table>
	<jsp:include page="/jsp/footer.jsp"></jsp:include>
</body>
</html>