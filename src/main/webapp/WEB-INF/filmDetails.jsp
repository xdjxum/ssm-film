
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<img src="${pageContext.request.contextPath}${filmDetails.imgPath}" width="200px">
    ${filmDetails.filmName}<br>
${filmDetails.driector}<br>
${filmDetails.player}<br>
${filmDetails.filmType}<br>
${filmDetails.country}<br>
${filmDetails.synopsis}<br>
${filmDetails.play_time}<br>
</body>
</html>
