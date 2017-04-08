<%--
  Created by IntelliJ IDEA.
  User: Doctor邓
  Date: 2017/4/7
  Time: 9:10
  TODO: 论坛公告模板
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="col-md-3 ${param.custom_class}" style="${param.custom_style}">
    <ul class="list-group">
        <div class="list-group-item active">论坛公告</div>
        <c:forEach items="${requestScope.notices}" var="notice">
            <a href="${notice.id}" class="list-group-item">${notice.simple_title}</a>
        </c:forEach>
    </ul>
    <a href="#" >
        <button type="button" class="btn btn-success" style="width: 200px;height:50px;margin-left: 30px">我要发帖</button>
    </a>
</div>
