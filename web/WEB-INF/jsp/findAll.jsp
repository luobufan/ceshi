<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2018/12/16
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<html>
<head>
    <title>查询所有</title>
</head>
<body>

<h1 align="center">查询所有</h1>
<table class="table table-bordered table table-hover">

    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年级</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${ulist}" var="list">
    <tr>
    <td>${list.id}</td>
    <td>${list.name}</td>
    <td>${list.grade.gname}</td>
    <td><a href="findid?id=${list.id}"><span class="glyphicon glyphicon-pencil"></span></a>&nbsp;&nbsp;
        <a href="delete?id=${list.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
    </tr>
    </c:forEach>
</table>
<td th:switch="${page}">
    <p th:case="0"><a th:href="@{/findAj(page=0)}">上一页</a></p>
    <p th:case="*"><a th:href="@{/findAj(page=${page}-1)}">上一页</a></p>
</td>
<td th:switch="${page}">
    <p th:case="${pages}"><a th:href="@{/findAj(page=${pages})}">下一页</a></p>
    <p th:case="*"><a th:href="@{/findAj(page=${page}+1)}">下一页</a></p>
</td>
<div align="center">
    <a href="add"><span class="glyphicon glyphicon-plus-sign"></span></a>
</div>


</body>
</html>
