
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <table align="center">
            <tr>
                <c:forEach items="${voFilms}" var="film" begin="0" end="2">
                    <td align="center">
                        <a href="filmDetails?filmId=${film.filmId}">
                            <img src="${pageContext.request.contextPath}${film.imgPath}"width="250px" height="350">
                        </a>
                        <p>${film.filmName}</p>
                    </td>
                </c:forEach>
            </tr>
            <tr>
                <c:forEach items="${voFilms}" var="film" begin="3" end="5">
                    <td  align="center">
                        <a href="filmDetails?filmId=${film.filmId}">
                            <img src="${pageContext.request.contextPath}${film.imgPath}"width="250px" height="350">
                        </a>
                        <p >${film.filmName}</p>
                    </td>
                </c:forEach>
            </tr>
        </table>
</body>
</html>
