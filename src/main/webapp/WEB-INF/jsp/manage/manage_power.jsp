<%--
  Created by IntelliJ IDEA.
  User: Doctor邓
  Date: 2017/4/8
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="zh">
<head>
    <title>校园论坛-用户权限</title>
    <jsp:include page="/WEB-INF/jsp/pages/commonHead.jsp"/>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/pages/header.jsp"/>

<script>
    function test() {
        alert("dd");
    }
</script>
<div class="container" style="margin-top: 80px">
    <div class="row">
        <div class="col-xs-3">
            <ul class="nav nav-pills nav-stacked">
                <li role="presentation"><a href="#">发布公告</a></li>
                <li role="presentation"><a href="#">个人信息修改</a></li>
                <%-- <li role="presentation"><a href="#">查看新帖</a></li>--%>
                <li role="presentation"><a href="#">申精管理</a></li>
                <li role="presentation" class="active"><a href="#">封锁用户</a></li>
                <li role="presentation"><a href="#">板块管理</a></li>
            </ul>
        </div>

        <div class="col-md-9">
            <form style="float: right;" class="navbar-form navbar-right" role="search"
                  action="#" method="get">
                <div class="input-group" style="width: 300px">
                    <input type="text" class="form-control" name="keywords" placeholder="搜索用户(用户名/邮箱)">
                   <%-- <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span></span>--%>
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search" style="height: 20px;"></span></button>
                    </span>
                </div>
            </form>
            <div style="margin-top: 50px;">
                <ul class="list-group">
                    <!-- 用户 -->
                    <c:forEach items="${requestScope.users_power}" var="user_power" >
                        <div class="list-group-item" style="height: 60px;padding-top: 20px;">
                            <a href="" style="color:grey">
                                用户名:${user_power.user_name}&nbsp;|&nbsp;
                                邮箱:${user_power.user_email}
                            </a>

                            <div class="btn-group" style="float: right;margin-right: 20px;">
                                <button type="button" class="btn btn-default dropdown-toggle btn-xs"
                                        data-toggle="dropdown">
                                    封锁用户 <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu" role="menu">
                                    <li>
                                        <a href="#">删除账号</a>
                                    </li>
                                    <li>
                                        <a href="#">限制回复</a>
                                    </li>
                                    <li>
                                        <a href="#">限制发帖</a>
                                    </li>
                                    <li>
                                        <a href="#">限制发帖与回复</a>
                                    </li>
                                </ul>
                            </div>
                            <div style="float: right;margin-right: 10px;">
                                限制状态：${user_power.user_status}
                            </div>
                        </div>
                    </c:forEach>
                </ul>
            </div>

        </div>
    </div>
</div>
<div style="height: 480px;"></div>
<jsp:include page="/WEB-INF/jsp/pages/bottom.jsp"/>
</body>
<jsp:include page="/WEB-INF/jsp/pages/commonJs.jsp"/>
</html>
