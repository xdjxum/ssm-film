<%@ page import="com.xud.vo.VoSert" %>
<%@ page import="com.fasterxml.jackson.databind.ObjectMapper" %>
<%@ page import="java.lang.reflect.Array" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>选座购票</title>
        <link rel="stylesheet" href="layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <style>
            button{
                width: 100px;
                height: 22px;
                margin-left: 10px;
                margin-bottom: 5px;
            }
            #pm{
                margin:0 auto;
                margin-bottom: 20px;
                align-content: center;
                width: 600px;
                height: 30px;
                background: #01AAED;
                border-radius: 30px;
            }
            p{
                width: 200px;
                height: 30px;
                line-height: 30px;
                align-content: center;
                margin-left: 250px;
            }
            th{
                width: 400px;
                height: 48px;
            }
            span {
                margin-top: 20px;
                margin-left: 10px;
            }
        </style>
    </head>
    <body onload="x()" text-align:center bgcolor="#2f4f4f">
   <span> 可选座位：</span><button class='layui-btn layui-btn-primary' style='width: 100px;height: 22px;line-height: 22px;margin-top: 10px;cursor: not-allowed'>1</button>
    <span>已选座位：</span><button  class='layui-btn layui-btn-warm' style='width: 100px;height: 22px;line-height: 22px;margin-top: 10px;cursor: not-allowed'>1</button><br>
   <span> 他人座位：</span><button   class='layui-btn layui-btn-danger' style='width: 100px;height: 22px;line-height: 22px;cursor: not-allowed'>1</button>
   <span> 禁选座位：</span><button   class='layui-btn layui-btn-xs layui-btn-radius layui-btn-disabled' style='width: 100px;height: 22px;line-height: 22px'>.</button>
        <div id="pm" style="line-height: 30px">
            <p>影屏</p>
        </div>
        <table align="center">
            <div id="ids"></div><br><br>
        </table>
        <h3 style="margin-left: 10px">订单详情</h3>
        <hr class="layui-border-red">
        <table align="center" class="layui-table">
            <tr>
                <th>影片：</th>
                <td>${voSert.filmName}</td>
            </tr>
            <tr>
                <th>影城：</th>
                <td>${voSert.cinemaName}</td>
            </tr>
            <tr>  <th>放映时间：</th>
                <td>${voSert.playTime}</td>
            </tr>
            <tr>
                <th>制片国家：</th>
                <td>${voSert.country}</td>
            </tr>
            <tr>
                <th>片长：</th>
                <td>${voSert.length}</td>
            <tr>
                <th>已选座位：</th>
                <td id="yz"> </td>
            </tr>
            </tr>
            <tr>
                <th>单价：</th>
                <td>${voSert.price}</td>
            </tr>
            <tr>
                <th>合计</th>
                <td id="money">$</td>
            </tr>
            <tr>
                <th>选择购票</th>
                <td><a onclick="buyTickts()" style="color: #01AAED;cursor: pointer;">购票</a></td>
            </tr>
        </table>
    </body>
    <script>
        var str=${voSert.seatInfo};
        var money=0;//记录购票数量
        var price=${voSert.price};//单价
        var str1=new Array();
        for (var p in str){
            str1[p]=new Array(str[0].length)
            for (var i in str[0]){
                str1[p][i]=0;
            }
        }console.log(str1)
        //展示座位；
        function x() {
            $('#ids').empty();
            for (var i in str){
                $("#ids").append("<button>第"+(+i+1)+"行</button>")
                for (var j in str[i]){
                    if (str[i][j]==0){
                        //0可选座位
                        $("#ids").append("<button id='t"+i+j+"' class='layui-btn layui-btn-primary' style='width: 100px;height: 22px;line-height: 22px'  onclick='dj("+i+","+j+")'>"+(+j+1)+"</button>")
                    }else if (str[i][j]==-1){
                        //-1禁选座位
                        $("#ids").append("<button class='layui-btn layui-btn-xs layui-btn-radius layui-btn-disabled' style='width: 100px;height: 22px'>"+(+j+1)+"</button>")
                    }else if (str[i][j]==1){
                        // 1已选座位
                        $("#ids").append("<button  id='t"+i+j+"' class='layui-btn layui-btn-warm' style='width: 100px;height: 22px;line-height: 22px' onclick='dj("+i+","+j+")'>"+(+j+1)+"</button>")
                    }else if (str[i][j]==2){
                        //2已被他人选用座位
                        $("#ids").append("<button class='layui-btn layui-btn-danger' style='width: 100px;height: 22px;line-height: 22px;cursor: not-allowed'>"+(+j+1)+"</button>")
                    }else {
                        //无座位
                        $("#ids").append("<button class='layui-btn layui-btn-disabled' style='width: 100px;height: 22px'>.</button>")
                    }
                }$("#ids").append("<br>")
            }
        }
        function dj(i,j) {//r--行，c--列
           if (str1[i][j]==0){
               money=money+1;
               $("#t"+i+j+"").attr('class','layui-btn layui-btn-warm');
               $('#yz').append("<button id='"+i+j+"' class='layui-btn layui-btn-primary layui-border-red' style='width: 100px;height: 22px;line-height: 22px' onclick='dj("+i+","+j+")'>第"+(+i+1)+"排"+(+j+1)+"座</button>")
               $('#money').empty();
               $('#money').append(money*price);
               str1[i][j]=1;
           }else if (str1[i][j]!=0){
               $("#t"+i+j+"").attr('class','layui-btn layui-btn-primary');
               $("#"+i+j+"").remove();
               str1[i][j]=0;
               money=money-1;
               $('#money').empty();
               $('#money').append(money*price);
           }
        }
        function wheeLing() {
            $.get("selectSeat?playId=${voSert.playId}",function (date){//查询座位售卖情况；
                for (var i in str1){
                    for (var j in str1[i]){
                        if (str1[i][j]==1){
                            if (date[i][j]==0){
                                date[i][j]=1;
                            }else {
                                money=money-1;
                                str1[i][j]=0;
                                $('#money').empty();
                                $('#money').append(money*price);
                                $("#"+i+j+"").remove();
                            }
                        }
                    }
                }
               console.log(date)
                str=date;
                x();
            },'json')
        }
        setInterval('wheeLing()',3000)

        //购票
        function buyTickts() {
            var seat="";
            for (var i in str1){
                for (var j in str1[i]){
                    if (str1[i][j]==1){
                        seat=seat+i+','+j+';'
                    }
                }
            }
            var temp = document.createElement("form");
            temp.action ="insertForder";
            temp.method = "post";
            temp.style.display = "none";
            var t= document.createElement("textarea");
            t.name ="seat";
            t.value =seat;
            temp.appendChild(t);
            var o = document.createElement("textarea");
            o.name ="price";
            o.value =${voSert.price};
            temp.appendChild(o);
            var p = document.createElement("textarea");
            p.name ="playId";
            p.value ="${voSert.playId}";
            temp.appendChild(p);
            document.body.appendChild(temp);
            temp.submit();
            return temp;
        }
    </script>
</html>
