
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="layui/layui.js">
    </script>
    <style>
        table.layui-table{
            margin: 20px;
        }
    </style>
</head>
<body>
    <table class="layui-table">
        <tr>
            <th>放映时间</th>
            <th>语言</th>
            <th>影院</th>
            <th>放映厅</th>
            <th>价格</th>
            <th>选座购票</th>
        </tr>
            <c:forEach items="${plays}" var="play" end="${plays.size()-1}" begin="0">
                <tr>
                    <td>${play.playTime}</td>
                    <td>${play.language}</td>
                    <td>${play.cinemaName}</td>
                    <td>${play.roomName}</td>
                    <td>${play.price}</td>
                    <td><a href="seatController?playId=${play.playId}" style="color: #01AAED">购票</a></td>
                </tr>
            </c:forEach>
    </table>
</body>
</html>
