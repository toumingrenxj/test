<%@ page import="java.util.List" %>
<%@ page import="com.mystudy.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>学生信息展示</title>
</head>
<body>
    <table>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
            <th>邮箱</th>
        </tr>
        <c:forEach var="stu" items="${stuList}">
            <tr>
                <td>${stu.sid}</td>
                <td>${stu.sname}</td>
                <td>${stu.sage}</td>
                <td>${stu.ssex}</td>
                <td>${stu.semail}</td>
            </tr>
        </c:forEach>
        <%--<%
            List<Student> list = (List<Student>) request.getAttribute("stuList");
            for(Student stu : list){
        %>
        <tr>
            <td><%=stu.getSid()%></td>
            <td><%=stu.getSname()%></td>
            <td><%=stu.getSage()%></td>
            <td><%=stu.getSsex()%></td>
            <td><%=stu.getSemail()%></td>
        </tr>

        <%
            }
        %>--%>
    </table>
</body>
</html>