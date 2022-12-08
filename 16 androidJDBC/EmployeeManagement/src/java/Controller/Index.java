package Controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Index extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("empNo")) {
                        if (cookie.getValue().equals("")) {
                            break;
                        }
                        request.setAttribute("registered", "1");
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
                        Statement st = con.createStatement();
                        String query = "SELECT * FROM employees WHERE empNo=" + cookie.getValue();
                        ResultSet res = st.executeQuery(query);
                        while (res.next()) {
                            request.setAttribute("empNo", res.getInt(1));
                            request.setAttribute("name", res.getString(2));
                            request.setAttribute("email", res.getString(3));
                            request.setAttribute("mobile", res.getString(4));
                            request.setAttribute("dept", res.getString(5));
                            request.setAttribute("designation", res.getString(6));
                            request.setAttribute("location", res.getString(7));
                        }
                    }
                }
            }
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
