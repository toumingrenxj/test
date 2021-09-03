package com.mystudy.servlet;

import com.mystudy.Dao.UserDao;
import com.mystudy.entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        UserDao ud = new UserDao();
        User user = ud.login(username, pwd);
        if(user == null) {
            response.sendRedirect("false.html");
        }else {
            response.sendRedirect("index.jsp");
        }
    }
}
