<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="st" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">he${tips}
<title>login${tips}</title>
</head>
<body>
    <form:form action="login" method="post" modelAttribute="account">					 
    User name:<form:input path="userName"/>
    Password:<form:password path="password"/>
    age:<form:input path="age"/>
    <input type="submit" value="Login" />
    </form:form>
</body>
</html>