<%--
  Created by IntelliJ IDEA.
  User: ariel
  Date: 14/01/2021
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Show Person</title>
</head>
<body>

    <p>${person.getFirstName()}</p>
    <p>${person.getLastName()}</p>
    <p>${person.getAge()}</p>



</body>
</html>
