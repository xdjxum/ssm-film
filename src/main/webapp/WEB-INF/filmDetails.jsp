
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #js{
            width: 500px;
            height: 300px;
            display: inline-block;
            margin-left: 20px;
        }
    </style>
    <script src="${pageContext.request.contextPath}/js/jquery.js">

    </script>
</head>
    <body>
        <div style="margin: 10px"  >
            <img src="${pageContext.request.contextPath}${filmDetails.imgPath}" width="250px" height="400">

            <div id="js">
                <p>片名：${filmDetails.filmName}</p>
                <p>导演：${filmDetails.driector}</p>
                <p>主演：${filmDetails.player}</p>
                <p>类型：${filmDetails.filmType}</p>
                <p>地区：${filmDetails.country}</p>
                <p>剧情介绍：${filmDetails.synopsis}</p>
                <p>上映时间：${filmDetails.play_time}
                    <a style="color: skyblue" href="playAll?filmId=${filmDetails.filmId}">查看排片信息</a>
                </p>
            </div>
        </div>
        <div id="play">

        </div>
    </body>
</html>
