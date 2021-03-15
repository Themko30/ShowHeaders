<%@ page import="Model.HeadersBean" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Alfonso_D'Albenzio
  Date: 11/03/2021
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Request</title>
</head>
<body>
<h1>Headers Requested:</h1>
<%
    HeadersBean headersBean = (HeadersBean) request.getAttribute("headerskey");
    List<String> headersNames = headersBean.getHeaderNames();
    List<String> headersValue = headersBean.getHeaderValues();
    for (int i = 0; i < headersNames.size(); i++) {
%>
<%= headersNames.get(i)%>=<%= headersValue.get(i)%> <br>
<% } %>

</body>
</html>
