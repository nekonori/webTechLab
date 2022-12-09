<%@page import="java.util.*" %>
<%@page import="MyPackage.Book" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String[] bookIds = new String[100];
            int i=0;
            for (Enumeration<String> s = session.getAttributeNames(); s.hasMoreElements();i++)                
                bookIds[i] = s.nextElement();
            double total = 0;
            for(int j=0;j<i;j++){
                Book book = (Book)session.getAttribute(bookIds[j]);
                out.print("<p>Book: " + book.name +                
                ", Price: $" + book.price +
                ", Quantity: " + book.quantity + "</p>"              
                );
                total += book.quantity * book.price;
            }
            %>
            <h3>Total amount: <%= total %></h3>
    </body>
</html>
