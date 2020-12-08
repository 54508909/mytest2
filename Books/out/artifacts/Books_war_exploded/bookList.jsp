<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/7
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息列表</title>
</head>
<body style="text-align: center">

<form action="/book/getBooksList">
    <select name="type">
        <option value="0"></option>
        <option value="1">书名</option>
        <option value="2">作者</option>
        <option value="3">出版社</option>
    </select>
    <input type="text" name="des">
    <input type="submit" value="提交">
    <div>
        <span style="text-align: right"><a href="/book/toBookAdd">新增图书</a></span>
    </div>
    <table border="1" style="margin: auto">
        <tr>
            <th>书名</th>
            <th>作者</th>
            <th>出版社</th>
            <th>页数</th>
            <th>价格</th>
        </tr>
        <c:forEach items="${list.list}" var="l">
            <tr>
                <td>${l.bookName}</td>
                <td>${l.bookAuthor}</td>
                <td>${l.bookPublish}</td>
                <td>${l.bookPage}</td>
                <td>${l.bookPrice}</td>
            </tr>
        </c:forEach>
    </table>

    <div>
        <a href="/book/getBooksList?pageNo=${list.firstPage}">首页</a>/
        <a href="/book/getBooksList?pageNo=${list.pageNum-1}">上一页</a>
        <a href="/book/getBooksList?pageNo=${list.pageNum+1}">下一页</a>/
        <a href="/book/getBooksList?pageNo=${list.pages}">末页</a>
        第 ${list.pageNum} 页/总 ${list.total} 页
    </div>
</form>
</body>
</html>
