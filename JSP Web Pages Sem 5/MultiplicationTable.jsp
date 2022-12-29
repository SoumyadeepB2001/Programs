<%@ page language="java" contentType="text/html"%>
<html>
    <head>
        <title>Multiplication Table</title>
    </head>
    <body>
       <%! int a = 6; %>
       <table border="2">
        <% for(int i=1;i<=10;i++)
        {%>
            <tr>
                <td>
                    <% out.print(a); %>
                </td>
                <td>
                    <% out.print("*"); %>
                </td>
                <td>
                    <% out.print(i); %>
                </td>
                <td>
                    <% out.print("="); %>
                </td>
                <td>
                    <% out.print(a*i); %>
                </td>
            </tr>
        <% } %>
       </table>
    </body>
</html>