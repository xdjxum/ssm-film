
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
</head>
    <body>
        <div style="margin: 10px">
            <img src="${pageContext.request.contextPath}${filmDetails.imgPath}" width="300px">

            <div id="js">
                <p>片名：${filmDetails.filmName}</p>
                <p>导演：${filmDetails.driector}</p>
                <p>主演：${filmDetails.player}</p>
                <p>类型：${filmDetails.filmType}</p>
                <p>地区：${filmDetails.country}</p>
                <p>剧情介绍：${filmDetails.synopsis}</p>
                <p>上映时间：${filmDetails.play_time}</p>
            </div>
        </div>
    </body>
</html>
