<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Registration</title>
    </head>
    <body>
        <h1>Employee Registration System</h1>
        <% if (request.getAttribute("registered") == "1"){ %>
        <h3>Employee details</h3>
        <p>Emp no.: <% out.println(request.getAttribute("empNo")); %></p>
        <p>Name: <% out.println(request.getAttribute("name")); %></p>
        <p>Email: <% out.println(request.getAttribute("email")); %></p>
        <p>Mobile: <% out.println(request.getAttribute("mobile")); %></p>
        <p>Department: <% out.println(request.getAttribute("dept")); %></p>
        <p>Designation: <% out.println(request.getAttribute("designation")); %></p>
        <p>Location: <% out.println(request.getAttribute("location")); %></p>
        <a href="./logout">Logout</a>
        <% } else {  %>
        <p>Employee not registered yet!</p>
        <a href="<% out.print(request.getContextPath()); %>/register.jsp">Register employee</a>
        <% } %>
    </body>
</html>
