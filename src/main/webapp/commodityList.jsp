<%--
  Created by IntelliJ IDEA.
  User: joy
  Date: 2017/11/7
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body style="align-content: center;">
        <h2>商品详情</h2>
    <table border="1" width="800px" id="tab">
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品图片</td>
            <td>生产日期</td>
            <td>生产厂家</td>
            <td>是否上架</td>
            <td>管理</td>
        </tr>
    </table>
</body>
</html>
<script type="text/javascript">
    function loadData(){
        $("#tab tr:not(:first)").remove();
        $.get("commAction/findList","",function(data){
            $.each(data.commList,function(i,v){
                var tr="<tr>";
                tr+="<td>"+v.sname+"</td>";
                tr+="<td>"+v.price+"</td>";
                tr+="<td style='width: 50px;height: 50px;'>"+v.ufile+"</td>";
                tr+="<td>"+v.uintime.substring(0,10)+"</td>";
                tr+="<td>"+v.producer+"</td>";
                tr+="<td>"+v.state==0?'未上架':'上架'+"</td>";
                tr+="<td><a href=''>上架</a>|";
                tr+="<a href=''>下架</a>|</td>";
                tr+="</tr>";
                $("#tab").append(tr);
            });
        },"json");
    }
    window.onload=loadData;
</script>