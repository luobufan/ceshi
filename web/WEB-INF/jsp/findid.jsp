<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2018/12/16
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>

<html>
<head>
    <title>修改</title>
</head>
<body>
<form action="update" method="post">
    编号:<input name="id" value="${stu.id}" readonly="readonly"/><br>
    姓名:<input name="name" value="${stu.name}"/><br>
    年级:<select name="grade.gid">
    <option value="${stu.grade.gid }">${stu.grade.gname }</option>
    <c:forEach items="${gra }" var="ss">
        <option value="${ss.gid }">${ss.gname }</option>
    </c:forEach>
    <input type="submit" value="修改">
</select>
</form>

</body>
</html>
