<%@ page language="java" contentType="text/html"%>
<html>
    <head>
        <title>Greater Of Two Numbers</title>
    </head>
    <body>
        
        <%! public int max(int a, int b){
            if(a>=b)
                return a;

                return b;
        }
        %>

        <p>The greater of the 2 numbers is:</p>
        <% out.println(max(3,5)); %>
    </body>
</html>