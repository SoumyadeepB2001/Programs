<html>
<head>
<title>JSP</title>
</head>
<body>
    <% String s=request.getParameter("textbox1");

    Cookie C1=new Cookie("name",s); 
    response.addCookie(C1);
    C1.setMaxAge(60*60);
    Cookie k[] = request.getCookies();
    
    for(int i=0;i<2;i++)   
    {
        out.print(k[i].getName() +"-");
        out.print(k[i].getValue() + "<br>");
        k[i].setMaxAge(0);
    }
    %>
</body>
</html>