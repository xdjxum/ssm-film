
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
       <tr>
           <c:forEach items="${voFilms}" var="film" begin="0" end="1">
               <td>
<%--                  <a href="${pageContext.request.contextPath}/filmDetails?filmId=${film.filmId}">--%>
              <a href="filmDetails?filmId=${film.filmId}">
                      <img src="${pageContext.request.contextPath}${film.imgPath}"width="100px">
                  </a>
                   <p style="align-content: center">${film.filmName}</p>
               </td>
           </c:forEach>
       </tr>
    </table>
</body>
</html>
