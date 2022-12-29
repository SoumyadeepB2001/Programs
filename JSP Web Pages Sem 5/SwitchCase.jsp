<%@ page language="java" contentType="text/html"%>
<html>
    <head>
        <title>Switch Case</title>
    </head>
    <body>
        
        <%! int a = 7; %>
        <% switch(a)
        {
            case 0: %>
            <p>Zero</p>
            <% break;
            case 1: %>
            <p>One</p>
            <% break;
            case 2: %>
            <p>Two</p>
            <% break;
            case 3: %>
            <p>Three</p>
            <% break;
            case 4: %>
            <p>Four</p>
            <% break;
            case 5: %>
            <p>Five</p>
            <% break;
            case 6: %>
            <p>Six</p>
            <% break;
            case 7: %>
            <p>Seven</p>
            <% break;
            case 8: %>
            <p>Eight</p>
            <% break;
            case 9: %>
            <p>Nine</p>
            <% break;
            default: %>
            <p>Wrong Input</p>
            <% break; 
        }
        %>
    </body>
</html>