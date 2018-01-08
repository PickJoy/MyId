<%--
  Created by IntelliJ IDEA.
  User: joy
  Date: 2017/11/6
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="commAction/addCommodity" method="post" enctype="multipart/form-data">
    商品名称：<input type="text" name="sname" /><br/>
    商品价格：<input type="text" name="price" /><br/>
    商品图片：<input type="file" name="uimage"><br/>
    生产商家：<input type="text" name="producer"/><br/>
    生产日期：<input type="text" name="sintime"><br/>
    <input type="submit" value="添加商品">
</form>
</body>
</html>
