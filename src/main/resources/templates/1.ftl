<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title></title>
</head>
<body>
${name}
<hr>
<#if sex==1>
    男
    <#elseif sex==2>
    女
    <#else>
    未知
</#if>
<hr>
<#list userlist as user>
    ${user}
</#list>
</body>
</html>