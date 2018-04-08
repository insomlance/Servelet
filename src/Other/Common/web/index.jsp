<%--
  Created by IntelliJ IDEA.
  User: zilong
  Date: 2018/3/30
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>make</title>
    <script type="text/javascript" src="jquery-3.2.1.min.js"></script>
</head>
<body>

<form action="/pack" method="POST" enctype="multipart/form-data">
    <input name="software" id="software" size="60" required="">
    <br/>
    <h1></h1>
    类型：
    <select name="type" id="type">
        <option value="vnfd">vnfd</option>
        <option value="software">software</option>>
    </select>
    <h1></h1>
    参数：<input name="replace_software_dict" id="replace_software_dict" style="width:600px;height:200px" required="">
    <h1></h1>
    参数示例：
    <br/>
      替换原模型文件：{"VNFD_VNF.zip":"VNFP"}
    <br/>
      刷新VNFD或软件包:{ }
    <h1></h1>
    <input type="submit" value="开始做包">
</form>
</body>
</html>
