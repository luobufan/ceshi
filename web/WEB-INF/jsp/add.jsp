<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2018/12/16
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>添加</title>
</head>
<body>

    <form action="insert" method="post">
        姓名:<input name="name" type="text"><br>
        年级:<select name="grade.gid">
        <c:forEach items="${listt}" var="lll">
            <option value="${lll.gid }">${lll.gname }</option>
        </c:forEach>
    </select><br>
        <input type="submit" value="添加">
    </form>


</body>
</html>
