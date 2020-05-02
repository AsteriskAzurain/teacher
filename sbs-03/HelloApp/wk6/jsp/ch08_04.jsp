<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
   <head><title>EL对作用域内属性的访问</title></head>
   <body>
    <% pageContext.setAttribute("a","page");
       request.setAttribute("a","request");
       session.setAttribute("a","session");
       application.setAttribute("a","application"); %>
      页面范围a值：${pageScope.a }<br/>
      请求范围a值：${requestScope.a }<br/>
      会话范围a值：${sessionScope.a }<br/>
      应用范围a值：${applicationScope.a }<br/>
      不加范围a值：${a }<br/>
   </body>
</html>
