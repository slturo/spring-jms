<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body onload="document.form.value.focus()">
<h1>
	Hello JMS!
</h1>

<P>Dodaj wiadomość do kolejki: </P>
<form action="sent" name="form">
    <input type="text" name="value"/>
</form>
<P>Przetworzone wiadomości:<br /> ${messages} </P>
</body>
</html>
