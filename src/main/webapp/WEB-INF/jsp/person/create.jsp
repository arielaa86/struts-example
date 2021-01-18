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
    <title>Create Person</title>
</head>
<body>

    <h3>Register for a prize by completing this form.</h3>

    <s:form action="savePerson">
        <s:textfield name="person.firstName" label="First name" />
        <s:textfield name="person.lastName" label="Last name" />
        <s:textfield name="person.email"  label ="Email"/>
        <s:textfield name="person.age"  label="Age"  />
        <s:submit/>
    </s:form>

</body>
</html>
