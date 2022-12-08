package Controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String empNo = request.getParameter("empNo"),
                    name = request.getParameter("name"),
                    email = request.getParameter("email"),
                    dept = request.getParameter("department"),
                    designation = request.getParameter("designation"),
                    location = request.getParameter("location"),
                    mobile = request.getParameter("mobile");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            Statement st = con.createStatement();
            String query = String.format("INSERT INTO Employees "
                    + "values('%s', '%s', '%s', '%s', '%s', '%s', '%s')",
                    empNo, name, email, mobile,
                    dept, designation, location);
            st.executeUpdate(query);

            // response.setContentType("text/html;charset=UTF-8");
            Cookie ck = new Cookie("empNo", empNo);
            response.addCookie(ck);
            response.sendRedirect(request.getContextPath() + "/");
        } catch (Exception e) {
            System.out.println(e);
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
