<%@ page import="java.io.BufferedWriter" %>
<%@ page import="java.io.FileWriter" %>
<%@page %>
<html>
    <head>
        <title>Morning</title>
    </head>
    <body>
        <%
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\tools\\32awrew\\Internet_Smelov\\Lab4\\logs\\stdout.txt", true));
            writer.write("Morning");
            writer.append("\n");
            writer.close();
        %>
        <h1>Morning</h1>
    </body>
</html>
