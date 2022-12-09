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
            int bookId = Integer.parseInt(request.getParameter("bookId")),
                    quantity = Integer.parseInt(request.getParameter("quantity"));
            String bookName = request.getParameter("bookName");
            double price = Double.parseDouble(request.getParameter("price"));
            Book book = new Book(bookId, bookName, "", "", "", price);
			book.setQuantity(quantity);
            if(quantity == 0) session.removeAttribute(String.valueOf(bookId));
            else session.setAttribute(String.valueOf(bookId), book); 				
            
        %>
    </body>
</html>
