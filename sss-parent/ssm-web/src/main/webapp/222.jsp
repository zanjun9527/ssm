<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<% 
String cpath= request.getContextPath();
request.setAttribute("cpath", cpath);
%>
<head>
<title>Insert title here</title>
</head>
<body>
<strong>wo jiushi wo</strong>
<form id='form1' name= "myform" method = 'get' action = '${cpath}/usercenter/userInfo/wade' >
<!-- <label for='wadeId'>
wojiushi wo 
</label> -->
请输入你的东西<input type='text' id='wadeId' name='wadeId' />
<button type='submit' value='zhenshicai'>来啦乱UI从</button>
</form>
 
</body>
</html>
