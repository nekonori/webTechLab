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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
