package com.java.cis;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String validUsername = "hari23";
        String validPassword = "hari23";
        String enteredUsername = request.getParameter("username");
        String enteredPassword = request.getParameter("password");
        boolean isValidUser = validUsername.equals(enteredUsername) && validPassword.equals(enteredPassword);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if (isValidUser) {
            out.println("<h2>Login Successful</h2>");
        } else {
            out.println("<h2>Login Failed. Invalid username or password.</h2>");
        }
        out.println("</body></html>");
    }
}



