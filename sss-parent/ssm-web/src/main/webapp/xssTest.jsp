<%@ page pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>XSS跨站脚本测试</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
  </head>
  <body style="${bodyStyle }">
      <form action="<%=path %>/usercenter/userInfo/wade" method="get">
           背景颜色：<input name="bodyStyle" type="input" value="${bodyStyle }" />
          <br />
          <input type="submit" value="改变" />
      </form>
  </body>
</html>