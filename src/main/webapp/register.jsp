<%--
  Created by IntelliJ IDEA.
  User: joy
  Date: 2017/11/6
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="userAction/doRegister" method="post">
        用户名：<input type="text" name="uname"><br/>
        密码：<input type="password" name="upwd" id="pwd1"><br/>
        确认密码：<input type="password" name="tupwd" id="pwd2" onkeyup="validate()"><span id="tishi"></span></input><br/>
        <input type="submit" value="注册">
    </form>
</body>
</html>
<script>
    function validate() {
        var pwd1 = document.getElementById("pwd1").value;
        var pwd2 = document.getElementById("pwd2").value;
        <!-- 对比两次输入的密码 -->
        if(pwd1 == pwd2) {
            document.getElementById("tishi").innerHTML="<b color='green'>两次密码相同</b>";
            document.getElementById("submit").disabled = false;
        }
        else {
            document.getElementById("tishi").innerHTML="<b color='red'>两次密码不相同</b>";
            document.getElementById("submit").disabled = true;
        }
    }
</script>
