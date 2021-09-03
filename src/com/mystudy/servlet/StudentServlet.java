package com.mystudy.servlet;

import com.mystudy.Dao.StudentDao;
import com.mystudy.entity.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        StudentDao sd = new StudentDao();
        String flag = request.getParameter("flag");
        if("getAll".equals(flag)){
            List<Student> list = sd.getAllStudent();
            request.setAttribute("stuList",list);
            request.getRequestDispatcher("Student.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
