<%@ page language="java" contentType="text/html"%>
<html>
    <head>
        <title>Sum Of Two Numbers</title>
    </head>
    <body>
        
        <%! public int max(int a, int b){
            return a+b;
        }
        %>

        <p>The sum of the 2 numbers is:</p>
        <% out.println(max(3,5)); %>
    </body>
</html>