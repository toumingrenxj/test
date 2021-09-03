package com.mystudy.servlet;

import com.mystudy.Dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisteredServlet", value = "/RegisteredServlet")
public class RegisteredServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        UserDao ud = new UserDao();
        int num = ud.select(username);
        if (num != 0) {
            response.sendRedirect("false.html");
        }else {
            ud.add(username, pwd);
            response.sendRedirect("true.html");
        }
    }
}
