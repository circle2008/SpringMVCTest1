<%--
  Created by IntelliJ IDEA.
  User: cf
  Date: 2017/5/24
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/save.do" method="post">
    <table>
        <tr>
            <th colspan="2">添加学生</th>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>

            <td colspan="2"><input type="submit"value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
