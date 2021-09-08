
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="layui/layui.js"></script>
</head>
<body bgcolor="#2f4f4f">
        <form action="select" method="post" style="margin:0px;display:inline;">
            <input type="text" name="film_name" placeholder="请输入影片名" style="height: 40px;width: 200px;margin: 20px;position: relative;left: 900px">
            <input type="submit" class="layui-btn layui-btn-normal" value="搜索" style="height: 40px;;position: relative;left: 900px">
        </form>
        <button  class="layui-btn layui-btn-normal"style="height: 40px;width: 65px;position: relative;left: 910px;align-content: center">
            <a onclick="login()">
                <i class="layui-icon" style="justify-content: center;align-items: center;display: flex;color: #F0F0F0">登录 </i>
            </a>
        </button>
        <button  class="layui-btn layui-btn-normal"style="height: 40px;width: 65px;position: relative;left: 910px;align-content: center">
            <a href="backtageMain.jsp">
                <i class="layui-icon" style="justify-content: center;align-items: center;display: flex;color: #F0F0F0">后台管理 </i>
            </a>
        </button>
<div class="layui-carousel" id="test1" style="margin:0 auto;align-content: center;border-radius: 10px;margin-top: 20px">
    <div carousel-item style="margin:0 auto;align-content: center;border-radius: 10px">
        <img src="img/lbt/1.jpg">
        <img src="img/lbt/2.jpg">
        <img src="img/lbt/3.jpg">
        <img src="img/lbt/4.jpg">
    </div>
</div>
        <table align="center" style="margin-top: 60px" >
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
                        <p style="c: #01AAED">${film.filmName}</p>
                    </td>
                </c:forEach>
            </tr>
        </table>
<%--登录弹出层--%>
    <div id="login" style="display: none">
        <form class="layui-form" action="login" method="post" >
            <br>
    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">输入账号</label>
        <div class="layui-input-block">
            <input type="text" name="uname" required  lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input" style="width: 300px">
        </div> <br>
        <div class="layui-form-item"  style="margin-top: 10px">
            <label class="layui-form-label">输入密码</label>
            <div class="layui-input-block">
                <input type="password" name="password" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input" style="width: 300px">
            </div>
        </div>
    </div> <br>
   <div style="position: relative;left: 160px">
       <input class="layui-btn" type="submit" value="登录"style="margin-right: 20px" >
       <input class="layui-btn" type="button" value="注册" style="margin-right: 20px">
   </div>
        </form>
    </div>
</body>
    <script>
        layui.use('carousel', function(){
            var carousel = layui.carousel;
            //建造实例
            carousel.render({
                elem: '#test1'
                ,width: '60%' //设置容器宽度
                ,height:'250'
                ,arrow: 'always' //始终显示箭头
                //,anim: 'updown' //切换动画方式
            });
        });
    </script>
    <script>
       function login() {
           layui.use('jquery',function (){
               var $=layui.$
               layer.open({
                   title:'用户登录',
                   offset: '250px',
                   type: 1,
                   area:['500px','300px'],
                   content: $('#login') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
               });
           })
       }
    </script>
</html>
