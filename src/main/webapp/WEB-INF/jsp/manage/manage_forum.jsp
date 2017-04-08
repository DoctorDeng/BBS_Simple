<%--
  Created by IntelliJ IDEA.
  User: Doctor邓
  Date: 2017/4/8
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="zh">
<head>
    <title>校园论坛-板块管理</title>
    <jsp:include page="/WEB-INF/jsp/pages/commonHead.jsp"/>
    <link rel="stylesheet" type="text/css" href="${path}/plugin/bootstrap-select-1.12.2/dist/css/bootstrap-select.css">
</head>
<body>
<jsp:include page="/WEB-INF/jsp/pages/header.jsp"/>
<div class="container" style="margin-top: 80px">
    <div class="row">
        <div class="col-xs-3">
            <ul class="nav nav-pills nav-stacked">
                <li role="presentation"><a href="#">发布公告</a></li>
                <li role="presentation"><a href="#">个人信息修改</a></li>
                <li role="presentation"><a href="#">申精管理</a></li>
                <li role="presentation"><a href="#">封锁用户</a></li>
                <li role="presentation" class="active"><a href="#">板块管理</a></li>
            </ul>
        </div>

        <div class="col-md-9">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        创建讨论区
                    </h3>
                </div>

                <div class="panel-body">
                    <div class="column">
                        <form action="#" method="post">
                            <div class="form-group">
                                <label for="forum_id" class="control-label">父板块:</label>
                              &nbsp;&nbsp;&nbsp;
                               <%-- <br>--%>
                                <select class="selectpicker" id="forum_id">
                                    <option value="0">&nbsp;</option>
                                    <option value="1">踢足球</option>
                                    <option value="2">游泳</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="forum_name">板块名称:</label>
                                <input type="text" class="form-control" id="forum_name" name="forum_name" width="200px"
                                       height="80px"
                                       placeholder="请输入板块名称">
                            </div>
                            <div class="form-group">
                                <label for="forum_name">板块简介:</label>
                                <textarea class="form-control" id="forum_intruction" name="forum_intruction"></textarea>
                            </div>
                            <p>
                                <button type="submit" class="btn btn-success">创建板块</button>
                            </p>
                        </form>
                    </div>

                </div>
            </div>

        </div>
    </div>
</div>
<div style="height: 330px"></div>
<jsp:include page="/WEB-INF/jsp/pages/bottom.jsp"/>
</body>
<jsp:include page="/WEB-INF/jsp/pages/commonJs.jsp"/>
<script type="text/javascript" src="${path}/plugin/bootstrap-select-1.12.2/dist/js/bootstrap-select.js"></script>
</html>
