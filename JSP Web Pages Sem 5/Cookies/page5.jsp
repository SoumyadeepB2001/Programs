<html>
<head>
<title>JSP</title>
</head>
<body>
    <%
        Cookie k[] = request.getCookies();
        out.print(k.length);
    %>
</body>
</html>