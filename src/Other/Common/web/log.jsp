<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>log</title>
    <script type="text/javascript" src="jquery-3.2.1.min.js"></script>
</head>
<body>
执行日志：
<div id="log"></div>
<script>
    $(function () {
        var startTime = new Date().getTime();
        setInterval(function () {
            if(new Date().getTime()-startTime>600000){
                clearInterval(interval);
                return
            }
            $.get("http://10.142.65.78:5000/log_flush",
            function (data) {
                $("#log").html(data);
            });
            },2000
        );
    })
</script>

</body>
</html>
