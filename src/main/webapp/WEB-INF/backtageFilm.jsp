
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>影片管理</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="layui/layui.js"></script>
</head>
<body>
<form style="margin:0px;display:inline;">

    <input type="text" name="film_name" placeholder="请输入影片名" style="height: 40px;width: 200px;margin: 20px;position: relative;left: 800px">
    <input type="submit" class="layui-btn layui-btn-normal" value="搜索" style="height: 40px;;position: relative;left: 800px">
</form>
<button  class="layui-btn layui-btn-normal"style="height: 40px;width: 65px;position: relative;left: 810px;align-content: center">
    <a href="filmBuild.jsp">
        <i class="layui-icon" style="justify-content: center;align-items: center;display: flex;color: #F0F0F0">&#xe624;新建 </i>
    </a>
</button>
    <table  class="layui-table" align="center" style="margin: 10px;position: relative;top: -10px">
        <tr>
            <th>影片id</th>
            <th>影片名</th>
            <th>海报</th>
            <th>导演</th>
            <th>主演</th>
            <th>类型</th>
            <th>国家</th>
            <th>片长</th>
            <th>剧情介绍</th>
            <th>上映时间</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${films}" var="film" begin="0" end="${films.size()}">
            <tr>
                <td>${film.film_id}</td>
                <td>${film.film_name}</td>
                <td><a style="cursor: pointer;"><img src="${pageContext.request.contextPath}${film.img_path}"></a></td>
                <td>${film.driector}</td>
                <td>${film.player}</td>
                <td>${film.film_type}</td>
                <td>${film.country}</td>
                <td>${film.length}</td>
                <td>${film.synopsis}</td>
                <td>${film.play_time}</td>
                <td align="center">
                    <button  style="width: 50px;height: 30px;margin: 5px;line-height: 30px;display: flex;
                        justify-content: center;align-items: center;" class="layui-btn layui-btn-primary layui-border-blue">编辑</button><br>
                    <button  style="width: 50px;height: 30px;line-height: 30px;display: flex;
                         justify-content: center;align-items: center;" class="layui-btn layui-btn-primary layui-border-blue">删除</button>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
