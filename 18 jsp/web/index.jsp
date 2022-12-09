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
        <h1>Books</h1>
        <% 
            Book[] books = new Book[2];
            books[0] = new Book(0, "Harry Potter", "Fantasy novel", 
                    "ABC Publishers", "JK Rowling", 23.2);
            books[1] = new Book(1, "Treasure Island", "Adventure novel", 
                    "CBA Publishers", "Robert Stevenson", 21.9);
            for(Book book: books){ %>
                <%= "<h4>Book: " + book.name + "</h4>" +
                "<p>" + book.desc + "</p>" + 
                "<p>Author: " + book.author + "</p>" + 
                "<p>Publisher: " + book.publisher + "</p>" + 
                "<h5>Price: $" + book.price + "</h5>"                
                %>         
                <label>Quantity: </label>                
                <input type="number" id="i<%= book.id %>" value="0"/>
                <% String arg = String.format("%x, '%s', %.2f", book.id, book.name, book.price); %>
                <button onclick="addToCart(<%= arg %>)">Add to cart</button>
                <span id="done<%= book.id %>" style="display:none">Added!</span>
            <% }            
        %>
        <p>
            <a href="checkout.jsp">Proceed to checkout</a>
        </p>
        <script>
            const addToCart = (id, name, price) => {
                const quantity = document.querySelector("#i" + id).value;
                document.querySelector("#done" + id).style.display='initial';
                fetch("<%= request.getContextPath() %>/addToCart.jsp", {
                method: "POST",
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded',
                },
                body: `bookId=\${id}&bookName=\${name}&price=\${price}&quantity=\${quantity}`,
                }).then(res => {
                    console.log(res);
                });                            
            };
        </script>
    </body>
</html>
