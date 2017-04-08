<%--
  Created by IntelliJ IDEA.
  User: Doctor邓
  Date: 2017/4/7
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="zh">
<head>
    <title>${requestScope.topic_title}</title>
    <jsp:include page="../pages/commonHead.jsp"/>
    <link href="${path}/css/post-detail.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../pages/header.jsp"/>



<c:forEach items="${requestScope.topicDetails}" var="topicDetail">
    <!-- 楼主 -->
    <c:if test="${topicDetail.sign == 0}">
        <jsp:include page="../pages/topicDetail.jsp">
            <jsp:param name="topic_id"        value="${topicDetail.topic_id}" />
            <jsp:param name="reply_num"       value="${topicDetail.reply_num}" />
            <jsp:param name="topic_title"     value="${topicDetail.topic_title}" />
            <jsp:param name="forum_name"      value="${topicDetail.forum_name}" />
            <jsp:param name="user_ico_url"    value="${topicDetail.user_ico_url}" />
            <jsp:param name="user_name"       value="${topicDetail.user_name}" />
            <jsp:param name="user_sex"        value="${topicDetail.user_sex}" />
            <jsp:param name="publish_time"    value="${topicDetail.publish_time}" />
            <jsp:param name="publish_content" value="${topicDetail.publish_content}" />
        </jsp:include>
    </c:if>
    <!-- 回复 -->
    <c:if test="${topicDetail.sign == 1}">
        <jsp:include page="../pages/reply.jsp">
            <jsp:param name="user_ico_url"    value="${topicDetail.user_ico_url}" />
            <jsp:param name="user_name"       value="${topicDetail.user_name}" />
            <jsp:param name="user_sex"        value="${topicDetail.user_sex}" />
            <jsp:param name="publish_time"    value="${topicDetail.publish_time}" />
            <jsp:param name="reply_floor"     value="${topicDetail.reply_floor}" />
            <jsp:param name="publish_content" value="${topicDetail.publish_content}" />
        </jsp:include>
    </c:if>
</c:forEach>

<div class="container">
    <div class="row">
        <div class="col-md-11">
            <ul class="pagination page-float" style="float: right;margin-right: 0px;">
                <c:if test="${requestScope.currPage == requestScope.indexPage}" >
                    <li class="disabled"><a href="#">首页</a></li>
                </c:if>
                <c:if test="${requestScope.currPage != requestScope.indexPage}" >
                    <li><a href="${requestScope.indexPage}">首页</a></li>
                </c:if>

                <c:if test="${requestScope.previousPage == requestScope.indexPage}" >
                    <li><a class="disabled" href="#">上一页</a></li>
                </c:if>
                <c:if test="${requestScope.previousPage != requestScope.indexPage}" >
                    <li><a href="${requestScope.previousPage}">上一页</a></li>
                </c:if>

                <c:forEach items="${requestScope.navigates}" var="navigate">
                    <c:if test="${requestScope.currPage == navigate}">
                        <li class="active"><a href="${navigate}">${navigate}</a></li>
                    </c:if>
                    <c:if test="${requestScope.currPage != navigate}">
                        <li><a href="${navigate}">${navigate}</a></li>
                    </c:if>
                </c:forEach>

                <c:if test="${requestScope.nextPage == requestScope.endPage}" >
                    <li><a class="disabled" href="#">下一页</a></li>
                </c:if>
                <c:if test="${requestScope.nextPage != requestScope.endPage}" >
                    <li><a href="${requestScope.nextPage}">下一页</a></li>
                </c:if>

                <c:if test="${requestScope.currPage == requestScope.endPage}" >
                    <li class="disabled"><a href="#">尾页</a></li>
                </c:if>
                <c:if test="${requestScope.currPage != requestScope.endPage}" >
                    <li><a href="${requestScope.endPage}">尾页</a></li>
                </c:if>
            </ul>
        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-11">
            <div style="height: 200px;margin: 50px auto;margin-left: 100px; ">
                <form action="#" method="post">
                    <input type="hidden" name="postId" value="">
                    <input type="hidden" name="page" value="">
                    <div style="margin: 5px auto;height: 100px; ">
                        <textarea id="reply_content" cols="20" rows="1" name="content" class="ckeditor"></textarea>
                    </div>
<%--                    <s:fielderror fieldName="limit"></s:fielderror>--%>
                    <div style="float:right;margin: 60px auto">
                        <input type="submit" class="btn btn-primary" style="width: 60px;" value="回复" />
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../pages/bottom.jsp" />
</body>
<jsp:include page="../pages/commonJs.jsp"/>
<script type="text/javascript" src="${path}/plugin/ckeditor/ckeditor.js"></script>
</html>
