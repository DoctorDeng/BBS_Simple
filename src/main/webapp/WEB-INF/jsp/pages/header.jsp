<%--
  Created by IntelliJ IDEA.
  User: Doctor邓
  Date: 2017/4/6
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- navbar-fixed-top 导航条固定在顶部 -->
<nav class="navbar navbar-inverse" role="navigation">
    <div class="navbar-header">
        <a class="navbar-brand" href="#">校园论坛</a>
    </div>

    <div>
        <ul class="nav navbar-nav">
            <li><a href="#">首页</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    精选板块 <b class="caret"></b>
                </a>

                <ul class="dropdown-menu">
                    <!-- 板块下拉列表-->
                    <li class="divider"></li> <!--分割线 -->
                    <li><a href="#">板块名称1</a></li>
                    <li class="divider"></li>
                    <li><a href="#">板块名称2</a>
                    </li>
                </ul>
            </li>
            <li><a href="#">论坛热帖</a></li>
            <li><a href="#">论坛新帖</a></li>
            <li><a href="#">精华帖</a></li>
        </ul>
    </div>


    <!--未登录 用户中心显示 -->
    <!--
      <ul class="nav navbar-nav navbar-right user">
        <li><a href="<%=request.getContextPath()%>/login.jsp">登陆</a></li>
        <li><a href="<%=request.getContextPath()%>/regist.jsp">注册</a></li>
      </ul>
      <p class="navbar-text navbar-right">尊敬的游客您好！</p> -->


    <!--登录 普通用户 用户中心显示 -->

    <!--
    <ul class="nav navbar-nav navbar-right user">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          用户名称 <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="">个人信息</a></li>
          <li><a href="">我的帖子</a></li>
          <li><a href="">我要发帖</a></li>
          <li class="divider"></li>
          <li><a href="">退出登陆</a></li>
        </ul>
      </li>
    </ul>
    <p class="navbar-text navbar-right">尊敬的用户您好！</p> -->

    <!--已登录 管理员 用户中心显示 -->

    <ul class="nav navbar-nav navbar-right user">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                管理员名称<b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
                <li><a href="#">发布公告</a></li>
                <li><a href="#">个人信息修改</a></li>
                <li><a href="#">申精管理</a></li>
                <li><a href="#">封锁用户</a></li>
                <li><a href="#">板块管理</a></li>
                <li class="divider"></li>
                <li><a href="">退出登陆</a></li>
            </ul>
        </li>
    </ul>
    <p class="navbar-text navbar-right">尊敬的管理员您好！</p>

    <!-- 搜索框 -->
    <form class="navbar-form navbar-right" role="search" action="">
        <div class="input-group">
            <input type="text" class="form-control" name="keywords" placeholder="搜索">
           <%-- <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span> </span>--%>
            <span class="input-group-btn">
                <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search" style="height: 20px;"></span></button>
            </span>
        </div>
    </form>
</nav>
