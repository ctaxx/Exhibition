<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Index</title>
</head>
<body>

	<jsp:forward page="/Controller">
		<jsp:param value="getAllExs" name="command" />
	</jsp:forward>
</body>
</html>