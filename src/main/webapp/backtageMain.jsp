
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>贪狼影城</title>
    meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="layui/layui.js"></script>
    <script src="js/jquery.js"></script>
    <style>
        .layui-tree-txt {
            color: #f6f6f6;
        }
        a{
            color: #f6f6f6;
        }
    </style>
</head>
<body onload="function x() {
  alert(1)
   $('#aid').trigger('click');
}">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo layui-hide-xs layui-bg-black">贪狼影城</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item layui-hide layui-show-md-inline-block">
                <a href="javascript:;">
                    <img src="img/tx.jpg" class="layui-nav-img">
                    操作
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">Your Profile</a></dd>
                    <dd><a href="">Settings</a></dd>
                    <dd><a href="">Sign out</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item" lay-header-event="menuRight" lay-unselect>
                <a href="javascript:;">
                    <i class="layui-icon layui-icon-more-vertical"></i>
                </a>
            </li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <div  id="test1" class="demo-tree-more"></div>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe height="100%" width="100%" frameborder="0" name="controller"></iframe>
        <h1>jiaondsxfbndsakfhsakfedsafaf</h1>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
    </div>
</div>
<script>
        layui.use('tree', function(){
        var tree = layui.tree;

        //渲染
        var inst1 = tree.render({
        elem: '#test1'  //绑定元素
        ,showLine: false  //是否开启连接线
        ,data: [{
                title:'权限管理'
                ,children:[{
                    title:'<a href="https://maoyan.com/cinemas" target="controller">用户管理</a>'
                },{
                    title:'<a href="https://maoyan.com/cinemas" target="controller">角色管理</a>'
                },{
                    title:'<a href="https://maoyan.com/cinemas" target="controller">功能管理</a>'
                }

                ]
            },{
                title:'<a href="backtageFilm" target="controller">影片管理</a>'
            },{
                title:'<a href="https://maoyan.com/cinemas" target="controller">影院管理</a>'
            },{
                title:'<a href="https://maoyan.com/cinemas" target="controller">放映厅管理</a>'
            },{
                title:'<a href="https://maoyan.com/cinemas" target="controller">排片管理</a>'
            }
        ]
        });
        });
</script>
</body>
</html>
