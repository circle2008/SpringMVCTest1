<%--
  Created by IntelliJ IDEA.
  User: cf
  Date: 2017/5/24
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/student/preSave.do">添加学生</a>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td>${student.id }</td>
            <td>${student.name }</td>
            <td>${student.age }</td>
            <td>
                <a href="${pageContext.request.contextPath}/student/preSave.do?id=${student.id}">修改</a>&nbsp;&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/student/delete.do?id=${student.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
