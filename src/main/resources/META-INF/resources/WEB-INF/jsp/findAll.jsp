<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Select</title>
</head>
<body>

<c:forEach var="user" items="${stud}">
    <p>${user}</p>
</c:forEach>

</body>
</html>
