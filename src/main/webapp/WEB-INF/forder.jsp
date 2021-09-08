
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="layui/layui.js"></script>
</head>
<body bgcolor="#2f4f4f">
    <h1 style="margin: 50px">订单信息：</h1>
    <div style=" margin:0 auto;align-content: center;width: 450px;">
        <table  class="layui-table" style=" margin:0 auto;align-content: center;width: 450px;">
                <tr>
                    <td>影片</td>
                    <td>${voForder.filmName}</td>
                </tr>
            <tr>
                <td>影院</td>
                <td>${voForder.cinemaName}</td>
            </tr>
            <tr>
                <td>放映厅</td>
                <td>${voForder.roomName}</td>
            </tr>
            <tr>
                <td>订单编号</td>
                <td>${voForder.forderId}</td>
            </tr>
            <tr>
                <td>放映时间</td>
                <td>${voForder.createTime}</td>
            </tr>
            <tr>
                <td>座位</td>
                <td>${voForder.seat}</td>
            </tr>
            <tr>
                <td>数量</td>
                <td>${voForder.cnt}</td>
            </tr>
            <tr>
                <td>总价</td>
                <td>${voForder.price}</td>
            </tr>
        </table>
        <p style="margin-top:30px ">
            <a href="select" style="width: 50px;margin: 50px;color: #01AAED;cursor: pointer">返回首页</a>
            <a href="select" style="width: 50px;margin: 110px;color: #01AAED;cursor: pointer">继续购票</a>
        </p>
    </div>
</body>
</html>
