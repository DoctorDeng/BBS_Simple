<%--
  Created by IntelliJ IDEA.
  User: Doctor邓
  Date: 2017/4/8
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="zh">
<head>
    <title>校园论坛-</title>
    <jsp:include page="/WEB-INF/jsp/pages/commonHead.jsp"/>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/pages/header.jsp"/>


<div class="container" style="margin-top: 30px">
    <div class="row">
        <div class="col-xs-3">
            <ul class="nav nav-pills nav-stacked">
                <li role="presentation"><a href="#">资料修改</a></li>
                <li role="presentation"><a href="#">我的帖子</a></li>
                <li role="presentation" class="active"><a href="#">申请记录</a></li>
                <!--<li role="presentation"><a href="#">Messages</a></li>-->
            </ul>
        </div>

        <div class="col-md-9">
            <ul class="list-group">
                <a class="list-group-item active">
                    <c:if test="${!empty requestScope.topics_applybest}">
                        申请记录
                    </c:if>
                    <c:if test="${!empty requestScope.topics_applybest}">
                        没有任何申请！
                    </c:if>
                </a>
                <c:forEach items="${requestScope.topics_applybest}" var="topic_applybest">
                    <div class="list-group-item">
                        <a href="${topic_applybest.topic_id}" style="color:grey">
                            <h4 class="list-group-item-heading" style="color:black">
                                [${topic_applybest.forum_name}]</h4>
                            ${topic_applybest.topic_title}
                        </a>
                        <p style="float: right;margin-right: 50px">状态：{帖子申精状态}
                        </p>
                    </div>
                </c:forEach>
            </ul>

            <ul class="pagination pagination-lg" style="float:right">
                <c:if test="${!empty requestScope.topics_applybest}">
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
                </c:if>
            </ul>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/pages/bottom.jsp">
    <jsp:param name="buttom_type" value="bottom_fixed" />
</jsp:include>
</body>
<jsp:include page="/WEB-INF/jsp/pages/commonJs.jsp"/>
</html>
